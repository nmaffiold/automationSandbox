package Test.CreateNewOrganisationParty;

import Models.Data.*;
import Models.Dialog.LoginDialog;
import Models.Dialog.SearchWorkItemDialog;
import Models.Dialog.TreatyProductPopupDialog;
import Models.Pages.*;
import Test.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import Test.RegressionTests;

public class PANP25553CreateNewOrganisationParty extends BaseTest {

    @Category(RegressionTests.class)
    @Test
    //PANP-33349 - Create Reassurer with no ABN details
    public void createNewReassurerWithTreaty() {
        //Initialize a random reference and name for this run
        String reassurerName = generateRandomUniqueString();
        String treatyReferenceNumber = getRandomNumberString(8);

        //Login to BaNCS
        LoginData data = new LoginData().withLogin("Auto01").withPassword("1");
        LoginDialog loginDialog = new LoginDialog(driver, data);
        loginDialog.clickLoginButton();
        HomePage homePage = new HomePage(driver);
        homePage.clickReassuranceTab();

        //Navigate to Party Search
        TreatyData treatyData = new TreatyData()
                .withTreatyType("Surplus");
        MenuDialoguePage menuDialoguePage = new MenuDialoguePage(driver);
        menuDialoguePage.createNewTreaty(treatyData.getTreatyType());

        //Select Reassurer Split Level
        TreatyPage treatyPage = new TreatyPage(driver, treatyData);
        if (!treatyData.getRule()) {
            treatyPage.selectSplitLevel("Treaty");
        }
        treatyPage.clickProceed();

        //Search for non-existent record
        treatyPage.searchReassurerName();
        SearchPolicyData searchPolicyData = new SearchPolicyData()
                .withSearchType("Party")
                .withParty("CreateCustomer")
                .withPartyTypeID("Business");
        SearchPolicyPage searchPolicyPage = new SearchPolicyPage(driver, searchPolicyData);
        searchPolicyPage.clickCreateNewCustomer();

        //Create New Reassurer
        CreateCustomerData createCustomerData = new CreateCustomerData()
                .withCustomerType("Business")
                .withNameOfBusiness(reassurerName)
                .withCompanyIdentifier("MLC-Group")
                .withSanctionedEntity("Yes")
                .withDateOfLastSanctionsScreening("01/01/2017");
        CreateBusinessPage createBusinessPage = new CreateBusinessPage(driver, createCustomerData);
        createBusinessPage.clickAddSanctionedEntityList();
        createBusinessPage.clickSubmitButton();

        String reassurerID = createBusinessPage.getCustomerNumber();
        System.out.println("Reassurer Customer Number: " + reassurerID);
        System.out.println("Reassurer Customer Name: " + reassurerName);
        createBusinessPage.setABNEmpty();
        createBusinessPage.clickActivate();

        //Add Treaty Information
        treatyPage.refreshFrame();
        Assert.assertEquals("PANP-33349: Was not able to progress successfully with a blank ABN", treatyPage.getReassurerName(), reassurerName);
        treatyData = new TreatyData()
                .withTreatyReference(treatyReferenceNumber)
                .withTreatyCommencementDate(getDateToday())
                .withTreatyBasis("Policy")
                .withTreatyContactLevel("Reassurer")
                .withReinsurancePaymentFrequency("Monthly")
                //This is necessary for adding a Reassurer when adding 'Treaty'
                .withReassurerSplit("50")
        ;
        treatyPage = new TreatyPage(driver, treatyData);
        treatyPage.clickAdd();
        treatyPage.clickSave();

        //Setup Schedule
        treatyPage.setupSchedule();
        TreatySchedulePage treatySchedulePage = new TreatySchedulePage(driver);
        treatySchedulePage.scheduleReference(treatyData.getTreatyReference());

        //Add Rule Information
        treatySchedulePage.goToTreatyNode();
        treatySchedulePage.addRule();
        RuleData ruleData = new RuleData()
                .withLevelType("Benefit")
                .withTreatyLimit("10000")
                .withRetentionLimitValue("500")
                .withUpperRetentionLimit("999")
                .withLowerRetentionLimit("100");
        RulePage rulePage = new RulePage(driver, ruleData);
        rulePage.searchProductName();

        //Add Product from Dialog
        TreatyProductPopupDialog treatyProductPopupDialog = new TreatyProductPopupDialog(driver);
        treatyProductPopupDialog.selectSuperProduct();
        rulePage.refreshFrame();
        rulePage.levelValueSearch();

        //Add Level from Dialog
        treatyProductPopupDialog = new TreatyProductPopupDialog(driver);
        treatyProductPopupDialog.selectLifeCover();
        rulePage.refreshFrame();
        rulePage.clickSave();
        treatyPage.setupReassurer();
        treatyPage.searchUnderwritingContact();

        //Search and return with Underwriting Contact
        SearchPolicyData searchPolicyData1 = new SearchPolicyData()
                .withSearchType("Party")
                .withParty("C100070004")
                .withPartyTypeID("Individual");
        SearchPolicyPage searchPolicyPage1 = new SearchPolicyPage(driver, searchPolicyData1);
        searchPolicyPage.clickSearch();
        IndividualPartyDetailData individualPartyDetailData = new IndividualPartyDetailData();
        IndividualPartyDetailsPage individualPartyDetailsPage = new IndividualPartyDetailsPage(driver, individualPartyDetailData);
        individualPartyDetailsPage.clickReturnWithResult();
        treatyPage.refreshFrame();

        //Search and return with Claim Contact
        treatyPage.searchClaimContact();
        SearchPolicyData searchPolicyData2 = new SearchPolicyData()
                .withSearchType("Party")
                .withParty("C100070004")
                .withPartyTypeID("Individual");
        SearchPolicyPage searchPolicyPage2 = new SearchPolicyPage(driver, searchPolicyData2);
        searchPolicyPage.clickSearch();
        individualPartyDetailData = new IndividualPartyDetailData();
        individualPartyDetailsPage = new IndividualPartyDetailsPage(driver, individualPartyDetailData);
        individualPartyDetailsPage.clickReturnWithResult();

        //Search for and Verify Treaty Created
        treatyPage.refreshFrame();
        treatyPage.clickSaveReassurer();
        treatyPage.submitTreaty();
        homePage.clickLogout();

        loginDialog.switchWindow();
        data = new LoginData().withLogin("EK1").withPassword("1");
        loginDialog = new LoginDialog(driver, data);
        loginDialog.clickLoginButton();

        homePage.refreshFrame();
        homePage.clickSearchTab();
        menuDialoguePage.searchAndPick();

        WorkItemData workItemData = new WorkItemData()
                .withCustomerNumber(reassurerID);
        SearchWorkItemDialog searchWorkItemDialog = new SearchWorkItemDialog(driver, workItemData);
        searchWorkItemDialog.clickSearchButton();
        searchWorkItemDialog.clickEditWorkItem();
        searchWorkItemDialog.clickOpenTransaction();
        treatyPage.submitTreatyAsAnotherUser();
        Assert.assertEquals(treatyPage.verifyActionTakenComplete(),"Complete");
    }
}

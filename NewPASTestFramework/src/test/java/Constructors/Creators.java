package Constructors;

import Library.CSVReader;
import Models.Data.*;
import Models.Dialog.*;
import Models.Pages.*;
import Models.Pages.MenuDialoguePage;
import org.junit.Test;
import Test.BaseTest;

import java.util.List;


public class Creators extends BaseTest {

    private Boolean loggedIn = false;
    private HomePage homePage = null;

    private void logIn() {

        if (!loggedIn) {
            LoginData data = new LoginData().withLogin("Auto01").withPassword("1");
            LoginDialog loginDialog = new LoginDialog(driver, data);
            loginDialog.clickLoginButton();
            loggedIn = true;
        }

        homePage = new HomePage(driver);

    }


    @Test
    public void create() {

        CSVReader reader = new CSVReader();
        String projectPath = (System.getProperty("user.dir"));
        List<TreatyData> values = reader.readReassurerTreatyFromCSV(projectPath + "\\treatyData.csv");
        String res = "";

        for (TreatyData data : values) {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            res += " " + this.createNewReassurerWithTreaty(data) + System.getProperty("line.separator");

        }

//        String reassurerName = generateRandomUniqueString();
//
//        //Initialize a random reference name for this test's run
//        String treatyReferenceName = getRandomAlphaNumeralString(8);
//        String treatyReferenceNumber = getRandomNumberString(8);

//        SearchPolicyData searchPolicyData = new SearchPolicyData()
//                .withSearchType("Party")
//                .withParty("C100070004")
//                .withPartyTypeID("Individual");
//        CreateCustomerData createCustomerData = new CreateCustomerData()
//                .withCustomerType("Business")
//                .withCompanyIdentifier("MLC-Group")
//                .withSanctionedEntity("Yes")
//                .withDateOfLastSanctionsScreening("01/01/2017")
//        .withNameOfBusiness(reassurerName);
//
//        RuleData ruleData = new RuleData()
//                .withLevelType("Benefit")
//                .withTreatyLimit("10000")
//                .withRetentionLimitValue("1000")
//                .withUpperRetentionLimit("30000")
//                .withLowerRetentionLimit("5000");
//
//        TreatyData treatyData = new TreatyData()
//                .withTreatyReference(treatyReferenceNumber)
//                .withTreatyCommencementDate(getDateToday())
//                .withTreatyBasis("Policy")
//                .withTreatyContactLevel("Reassurer")
//                .withReinsurancePaymentFrequency("Monthly")
//                .withReassurerSplit("50")
//                .withSearchPolicyData(searchPolicyData)
//                .withCreateCustomerData(createCustomerData)
//                .isRule()
//                .withRuleData(ruleData)
//                .withTreatyType("Surplus")
//                .withTreatyReferenceName(treatyReferenceName)
//        ;
//        String res = " " + this.createNewReassurerWithTreaty(treatyData);
        System.out.println("Id Created Object: " + res);

    }


    public String createDirectPayment(DirectPaymentData DPdata) {

        String Id = "not found";
        logIn();
        homePage.clickNewTab();

        MenuDialoguePage menuDialoguePage = new MenuDialoguePage(driver);
        menuDialoguePage.clickNewDirectPayment();

        DirectPaymentData directPaymentData = new DirectPaymentData();
        DirectPaymentPage directPaymentPage = new DirectPaymentPage(driver, directPaymentData);
        directPaymentPage.clickSearchPayer();

        SearchPolicyPage searchPolicyPage = new SearchPolicyPage(driver, DPdata.getSearchPolicyData());
        searchPolicyPage.clickSearch();

        //Return with an existing result
        IndividualPartyDetailData individualPartyDetailsData = new IndividualPartyDetailData();
        IndividualPartyDetailsPage individualPartyDetailsPage = new IndividualPartyDetailsPage(driver, individualPartyDetailsData);
        individualPartyDetailsPage.clickReturnWithResult();

        //Select MLC BSB Option
        directPaymentPage.refreshFrame();
        directPaymentPage.searchBSB();
        BankStateBranchDialog bankStateBranchDialog = new BankStateBranchDialog(driver);
        bankStateBranchDialog.selectMLCLimited();
        directPaymentPage.refreshFrame();


        directPaymentPage = new DirectPaymentPage(driver, DPdata);
        directPaymentPage.clickSave();

        directPaymentPage.clickNewLinkedScheme();
        LinkedRefactorData linkedRefactorData = new LinkedRefactorData();
        LinkedSchemePage linkedSchemePage = new LinkedSchemePage(driver, linkedRefactorData);
        linkedSchemePage.clickSearchPartyNumber();


        searchPolicyPage = new SearchPolicyPage(driver, DPdata.getSearchPolicyData().withSearchType("Scheme"));
        searchPolicyPage.clickSearch();
        searchPolicyPage.clickSelectedPolicy();
        searchPolicyPage.clickReturnWithPolicy();
        linkedSchemePage.refreshFrame();
        linkedSchemePage.clickSave();

        Id = directPaymentPage.getInstrumentNumberID();

        directPaymentPage.clickSubmitButton();
        directPaymentPage.waitForWindowAndSwitch();

        return Id;

    }


    public String createRegCashWorkitem(SearchPolicyData SPdata) {

        logIn();
        homePage.clickSearchTab();


        String comment = "Auto Generated Workitem comment" + getRandomNumberString(8);
        MenuDialoguePage menuDialoguePage = new MenuDialoguePage(driver);
        menuDialoguePage.clickWorkItemMenu();
        menuDialoguePage.clickSearchAndPickOption();
        WorkItemData workItemData = new WorkItemData();
        SearchWorkItemDialog searchWorkItemDialog = new SearchWorkItemDialog(driver, workItemData);
        searchWorkItemDialog.clickCreateWorkItem();
        CreateWorkItemDialog createWorkItemDialog = new CreateWorkItemDialog(driver, workItemData);
        createWorkItemDialog.clickSearchCustomer();

        SearchPolicyPage searchPolicyPage = new SearchPolicyPage(driver, SPdata);
        searchPolicyPage.clickSearch();
        IndividualPartyDetailData individualPartyDetailData = new IndividualPartyDetailData();
        IndividualPartyDetailsPage individualPartyDetailsPage = new IndividualPartyDetailsPage(driver, individualPartyDetailData);
        individualPartyDetailsPage.clickReturnWithResult();
        createWorkItemDialog.waitForWindowAndSwitch();
        createWorkItemDialog.clickSearchWorkType();
        SearchWorkTypePopupForWIDialog searchWorkTypePopupForWIDialog = new SearchWorkTypePopupForWIDialog(driver);
        searchWorkTypePopupForWIDialog.searchWorkType("CreateREgCash");
        createWorkItemDialog.waitForWindowAndSwitch();
        createWorkItemDialog.setCommentInput(comment);
        createWorkItemDialog.clickSave();

        return comment;

    }

    public String createNewReassurerWithTreaty(TreatyData treatyData) {
        //Can be altered to add Reference to any Business Reassurer. Must be exact UserID and Reassurer Name.

        //Login to BaNCS
        logIn();
        homePage.clickReassuranceTab();


        //Navigate to Party Search

        MenuDialoguePage menuDialoguePage = new MenuDialoguePage(driver);
        menuDialoguePage.createNewTreaty(treatyData.getTreatyType());

        //Select Reassurer Split Level
        TreatyPage treatyPage = new TreatyPage(driver, new TreatyData().withTreatyType(treatyData.getTreatyType()));
        if (!treatyData.getRule()) {
            treatyPage.selectSplitLevel("Treaty");
        }

        treatyPage.clickProceed();
        //Search for non-existent record
        treatyPage.searchReassurerName();
        SearchPolicyData searchPolicyData = new SearchPolicyData().withParty("!").withSearchType("Party");
        SearchPolicyPage searchPolicyPage = new SearchPolicyPage(driver, searchPolicyData);
        searchPolicyPage.clickCreateNewCustomer();

        //Create New Reassurer

        CreateBusinessPage createBusinessPage = new CreateBusinessPage(driver, treatyData.getCreateCustomerData());
        createBusinessPage.clickAddSanctionedEntityList();
        createBusinessPage.clickSubmitButton();


        createBusinessPage.setABNEmpty();
        createBusinessPage.clickActivate();

        //Add Treaty Information
        treatyPage.refreshFrame();

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

        RulePage rulePage = new RulePage(driver, treatyData.getRuleData());
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

        searchPolicyPage = new SearchPolicyPage(driver, treatyData.getSearchPolicyData());
        searchPolicyPage.clickSearch();
        IndividualPartyDetailData individualPartyDetailData = new IndividualPartyDetailData();
        IndividualPartyDetailsPage individualPartyDetailsPage = new IndividualPartyDetailsPage(driver, individualPartyDetailData);
        individualPartyDetailsPage.clickReturnWithResult();
        treatyPage.refreshFrame();

        //Search and return with Claim Contact
        treatyPage.searchClaimContact();
        searchPolicyPage = new SearchPolicyPage(driver, treatyData.getSearchPolicyData());
        searchPolicyPage.clickSearch();
        individualPartyDetailData = new IndividualPartyDetailData();
        individualPartyDetailsPage = new IndividualPartyDetailsPage(driver, individualPartyDetailData);
        individualPartyDetailsPage.clickReturnWithResult();

        //Search for and Verify Treaty Created
        treatyPage.refreshFrame();
        treatyPage.clickSaveReassurer();
        treatyPage.submitTreaty();

        return "Treaty Generated : " + treatyData.getTreatyReference();
    }

    public void createSchemeProcessWithExistingCustomer() {
        //Login to BaNCS
        LoginData data = new LoginData().withLogin("Auto01").withPassword("1");
        LoginDialog loginDialog = new LoginDialog(driver, data);
        loginDialog.clickLoginButton();
        HomePage homePage = new HomePage(driver);
        homePage.clickNewTab();

        //Navigate to New Scheme and fill out the Scheme Application Details
        MenuDialoguePage menuDialoguePage = new MenuDialoguePage(driver);
        menuDialoguePage.clickNewScheme();
        NewSchemeApplicationData applicationData = new NewSchemeApplicationData()
                .withEffectiveDate("24/06/2016")
                .withRequestDate("24/06/2016")
                .withCommencementDate("31/12/3000");
        SchemeApplicationDetailsPage schemeApplicationDetailsPage = new SchemeApplicationDetailsPage(driver, applicationData);
        schemeApplicationDetailsPage.clickProductNameSearch();

        //Select Non-Super from Product dialog and initiate customer search
        ProductPopupDialog productPopupDialog = new ProductPopupDialog(driver);
        productPopupDialog.selectNonSuperProduct();
        schemeApplicationDetailsPage.refreshFrame();
        schemeApplicationDetailsPage.clickCustomerSearch();

        //Search for existing
        SearchPolicyData searchPolicyData = new SearchPolicyData()
                .withSearchType("Party")
                .withParty("C100056006")
                .withPartyTypeID("Business");
        SearchPolicyPage searchPolicyPage = new SearchPolicyPage(driver, searchPolicyData);
        searchPolicyPage.clickSearch();

        //Return with an existing result
        BusinessPartyDetailData businessPartyDetailData = new BusinessPartyDetailData();
        BusinessPartyDetailsPage businessPartyDetailsPage = new BusinessPartyDetailsPage(driver, businessPartyDetailData);
        businessPartyDetailsPage.clickReturnWithResult();

        //Fill Scheme Overview Details and Save Scheme
        schemeApplicationDetailsPage.refreshFrame();
        schemeApplicationDetailsPage.clickProceedButton();
        SchemeOverviewData schemeOverviewData = new SchemeOverviewData()
                .withSchemeName("TestScheme")
                .withSchemeCurrency("AUD - A$")
                .withSchemeFullName("SchemeFullName")
                .withSchemeClass("Group Life")
                .withSchemeTier("Tier 2")
                .withSchemeCollectionMethod("Direct Payment")
                .withBlockRegularStatement("Yes")
                .withLeaverSchemePersonalDivision("No")
                .withBlockAnnualStatement("Yes")
                .withBusinessSegment("Corporate");
        SchemeOverviewPage schemeOverviewPage = new SchemeOverviewPage(driver, schemeOverviewData);
        schemeOverviewPage.clickSave();
        String schemeNumber = schemeOverviewPage.getSchemeNumber();
        schemeOverviewPage.closeSchemeCreation();

        //Setup Direct Payment for newly created scheme
        menuDialoguePage.clickNewDirectPayment();

        DirectPaymentData directPaymentData = new DirectPaymentData();
        DirectPaymentPage directPaymentPage = new DirectPaymentPage(driver, directPaymentData);
        directPaymentPage.clickSearchPayer();

        //Search for existing
        searchPolicyData = new SearchPolicyData()
                .withSearchType("Party")
                .withParty("C100056006")
                .withPartyTypeID("Business");
        searchPolicyPage = new SearchPolicyPage(driver, searchPolicyData);
        searchPolicyPage.clickSearch();

        //Return with an existing result
        businessPartyDetailData = new BusinessPartyDetailData();
        businessPartyDetailsPage = new BusinessPartyDetailsPage(driver, businessPartyDetailData);
        businessPartyDetailsPage.clickReturnWithResult();

        //Select MLC BSB Option
        directPaymentPage.refreshFrame();
        directPaymentPage.searchBSB();
        BankStateBranchDialog bankStateBranchDialog = new BankStateBranchDialog(driver);
        bankStateBranchDialog.selectMLCLimited();
        directPaymentPage.refreshFrame();

        directPaymentData = new DirectPaymentData()
                .withCollectOn("Specific Day")
                .withCollectOnDate("31")
                .withStartDate(getDateToday())
                .withExpiryDate("31/12/2017")
                .withSubType("Any")
                .withCollectionFrequency("Monthly")
                .withCurrency("Australian Dollar");
        directPaymentPage = new DirectPaymentPage(driver, directPaymentData);
        directPaymentPage.clickSave();

        directPaymentPage.clickNewLinkedScheme();
        LinkedRefactorData linkedRefactorData = new LinkedRefactorData();
        LinkedSchemePage linkedSchemePage = new LinkedSchemePage(driver, linkedRefactorData);
        linkedSchemePage.clickSearchPartyNumber();

        searchPolicyData = new SearchPolicyData().withSearchType("Scheme").withPolicy(schemeNumber);
        searchPolicyPage = new SearchPolicyPage(driver, searchPolicyData);
        searchPolicyPage.clickSearch();
        searchPolicyPage.clickSelectedPolicy();
        searchPolicyPage.clickReturnWithPolicy();
        linkedSchemePage.refreshFrame();
        linkedSchemePage.clickSave();
        directPaymentPage.clickSubmitButton();

        homePage.refreshFrame();
        homePage.clickSearchTab();
        menuDialoguePage.refreshFrame();
        menuDialoguePage.searchPartyPolicy();

        searchPolicyData = new SearchPolicyData().withSearchType("Scheme").withPolicy(schemeNumber);
        searchPolicyPage = new SearchPolicyPage(driver, searchPolicyData);
        searchPolicyPage.clickSearch();
        searchPolicyPage.clickSelectedPolicy();
        schemeOverviewPage.clickAlteration();

        schemeOverviewPage.clickSchemeSpecificationDetails();
        //PANP-33277 - Complete Screen 4 for Non-Super Product
        SchemeSpecificationData schemeSpecificationData = new SchemeSpecificationData()
                .withDefaultLeaverOption("Lapse")
                .withLeaverDefaultPeriodInDays("1")
                .withSchemeAssociationOnLeaver("De-link from Scheme")
                .withAllowableLeaverOption("Cancellation and Refund")
                .withCommissionAtSource("No")
                .withAllowableOccupationClassCodes("White collar")
                .withAgeCalculationBasis("")
                .withAgeDay("1")
                .withAgeMonth("1")
                .withTakeoverTermsApply("Yes")
                .withContinuationOptionApplicable("Yes")
                .withContinuationOptionSpecifiedNumberOfDays("")
                .withLeaveOfAbsencePeriodInMonths("")
                .withProfitShareApplicable("No")
                .withTransferOfCoverApplicable("Yes")
                .withLifeEventsAdditionalCoverApplicable("No")
                .withExtendedCoverNumberOfDays("1");
        SchemeSpecificationPage schemeSpecificationPage = new SchemeSpecificationPage(driver, schemeSpecificationData);
        schemeSpecificationPage.clickSave();
        schemeSpecificationPage.clickProcessParameters();

        //PANP33282 TC27: User completes Process parameters screen 4 for Non-Super product
        ProcessParametersData processParametersData = new ProcessParametersData()
                .withRenewalNoticeApplicable("Yes")
                .withNextRenewalDueDate("01/01/3001")
                .withScheduleFrequency("Annually")
                .withRateReviewTrigger("Next Premium Rerate Date")
                .withNextPremiumRerateDate("01/01/3001")
                .withRateReviewSpecifiedNoClaims("10")
                .withAdminFeeApplicable("No")
                .withLeadTimeForSchedule("31")
                .withScheduleDueDate("01/01/3001");
        ProcessParametersPage processParametersPage = new ProcessParametersPage(driver, processParametersData);
        processParametersPage.clickSave();

        processParametersPage.clickSubmit();
    }
}

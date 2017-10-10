package Test.SetupAndMaintainSchemeAgency.Sprint2;

import Models.Data.*;
import Models.Dialog.LoginDialog;
import Models.Dialog.SearchWorkItemDialog;
import Models.Pages.*;
import Test.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import Test.RegressionTests;

public class PANP20862CreateNewLicenseeRecord extends BaseTest {

    /*
    PANP-36442 TC08: Authorised user creates a new Licensee Record |User-Initiated Scenario 4
    PANP-36477 TC45: Submit Licensee
    PANP-36479 TC47" Authorise Licensee
     */
    @Category(RegressionTests.class)
    @Test
    public void newLicenseRecord() {

        LoginData data = new LoginData().withLogin("Auto01").withPassword("1");
        LoginDialog loginDialog = new LoginDialog(driver, data);
        loginDialog.clickLoginButton();
        HomePage homePage = new HomePage(driver);
        homePage.clickNewTab();

        MenuDialoguePage menuDialoguePage = new MenuDialoguePage(driver);
        menuDialoguePage.clickNewAgency();


        SearchPolicyData searchPolicyData = new SearchPolicyData()
                .withSearchType("Party")
                .withParty("C100046011")
                .withPartyTypeID("Individual");


        AgencyPage agencyPage = new AgencyPage(driver, new AgencyData());
        agencyPage.clickSearchCustomerButton();

        AgencyData agencyData = new AgencyData()
                .withAgencyName("AgencyZeon")
                .withRegistrationNumber(this.getRandomNumberString(6))
                .withAgencyType("Licensee")
                .withSearchPolicyData(searchPolicyData);

        //Search for existing
        SearchPolicyPage searchPolicyPage = new SearchPolicyPage(driver, searchPolicyData);
        searchPolicyPage.clickSearch();
        //Return with an existing result
        IndividualPartyDetailData individualPartyDetailsData = new IndividualPartyDetailData();
        IndividualPartyDetailsPage individualPartyDetailsPage = new IndividualPartyDetailsPage(driver, individualPartyDetailsData);
        individualPartyDetailsPage.clickReturnWithResult();

        agencyPage = new AgencyPage(driver, agencyData);
        agencyPage.clickSaveButton();
        String agencyCode= agencyPage.getAgencyCode();
        agencyData.setRegistrationNumber(agencyCode);
        agencyPage.clickSubmitButton();

        homePage.refreshFrame();
        homePage.clickLogout();

        data = new LoginData().withLogin("NM1").withPassword("1");
        loginDialog.switchWindow();
        loginDialog = new LoginDialog(driver, data);
        loginDialog.clickLoginButton();
        homePage = new HomePage(driver);
        homePage.clickSearchTab();
        menuDialoguePage = new MenuDialoguePage(driver);
        menuDialoguePage.clickWorkItemMenu();
        menuDialoguePage.clickSearchAndPickOption();

        WorkItemData workItemData = new WorkItemData()
                .withType("Agency")
                .withReferenceNumber(agencyData.getRegistrationNumber())
                ;

        SearchWorkItemDialog searchWorkItemDialog = new SearchWorkItemDialog(driver,workItemData);
        searchWorkItemDialog.clickSearchButton();
        searchWorkItemDialog.clickEditWorkItem();
        searchWorkItemDialog.waitForWindowAndSwitch();
        searchWorkItemDialog.clickOpenTransaction();
        agencyPage.refreshFrame();
        agencyPage.clickSubmitButton();
        searchWorkItemDialog.refreshFrame();
        searchWorkItemDialog.clickReferenceDataTab();
        Assert.assertEquals("PANP-36479: Agency Licensee couldn't be authorized","END",searchWorkItemDialog.getCurrentQueue());





    }
}

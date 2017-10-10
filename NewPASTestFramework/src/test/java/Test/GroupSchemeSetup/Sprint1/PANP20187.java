package Test.GroupSchemeSetup.Sprint1;

import Models.Data.*;
import Models.Dialog.AddAddressDialog;
import Models.Dialog.BankStateBranchDialog;
import Models.Dialog.LoginDialog;
import Models.Dialog.ProductPopupDialog;
import Models.Pages.*;
import Test.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import Test.RegressionTests;
import org.junit.experimental.categories.Category;

public class PANP20187 extends BaseTest {

    /*
    PANP-33256 - TC01: To verify that an authorised user is able to initiate the creation of a new group scheme directly from BaNCS i.e. not via workflow
    PANP-33261 - TC06: To verify that a user can complete the 'Scheme Application Details' section with Super Product/Create New Customer/Current Commencement Date
    PANP-33265 - TC10: To verify that a user can complete the 'Scheme Overview' section with User Generated Scheme Name, Superannutation Scheme Type, Direct Payment method, and scheme Tier 1.
    PANP-33271 - TC16: To verify that a user can select the Business product
    */

    @Test
    public void createSchemeProcessWithNewCustomer() {
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
                .withEffectiveDate(getDateToday())
                .withRequestDate("24/06/2016")
                .withCommencementDate(getDateToday());
        SchemeApplicationDetailsPage schemeApplicationDetailsPage = new SchemeApplicationDetailsPage(driver, applicationData);
        schemeApplicationDetailsPage.clickProductNameSearch();

        //Select Super from Product dialog and initiate customer search
        ProductPopupDialog productPopupDialog = new ProductPopupDialog(driver);
        productPopupDialog.selectSuperProduct();
        schemeApplicationDetailsPage.refreshFrame();
        schemeApplicationDetailsPage.clickCustomerSearch();

        //Search for non-existent record
        SearchPolicyData searchPolicyData = new SearchPolicyData()
                .withSearchType("Party")
                .withParty("CreateCustomer")
                .withPartyTypeID("Business");
        SearchPolicyPage searchPolicyPage = new SearchPolicyPage(driver, searchPolicyData);
        searchPolicyPage.clickCreateNewCustomer();

        //Create New Customer
        CreateCustomerData createCustomerData = new CreateCustomerData()
                .withCustomerType("Business")
                .withNameOfBusiness(getRandomUserName())
                .withCompanyIdentifier("MLC-Group")
                .withSanctionedEntity("Yes")
                .withDateOfLastSanctionsScreening("01/01/2017");
        CreateBusinessPage createBusinessPage = new CreateBusinessPage(driver, createCustomerData);
        createBusinessPage.clickAddSanctionedEntityList();
        createBusinessPage.clickSubmitButton();

        //Fill Address of New Customer and activate user
        createBusinessPage.clickAddAddress();
        AddressData addressData = new AddressData()
                .withPostCode("3000")
                .withHouseNumber("G")
                .withStreet("123 TEST STREET")
                .withState("VIC");
        AddAddressDialog addAddressDialog = new AddAddressDialog(driver, addressData);
        addAddressDialog.setCountryAustralia();
        addAddressDialog.clickSaveButton();
        addAddressDialog.proceedWithoutAddressValidation();
        createBusinessPage.clickActivate();

        //Fill Scheme Overview Details and Save Scheme
        schemeApplicationDetailsPage.refreshFrame();
        schemeApplicationDetailsPage.clickProceedButton();
        SchemeOverviewData schemeOverviewData = new SchemeOverviewData()
                .withSchemeName("MySchemeName")
                .withSchemeCurrency("AUD - A$")
                .withSchemeFullName("SchemeFullName")
                .withSchemeClass("Group Life")
                .withSchemeTier("Tier 1")
                .withSchemeCollectionMethod("Direct Payment")
                .withBlockRegularStatement("Yes")
                .withLeaverSchemePersonalDivision("No")
                .withBlockAnnualStatement("Yes")
                .withBusinessSegment("Public Offer");
        SchemeOverviewPage schemeOverviewPage = new SchemeOverviewPage(driver, schemeOverviewData);
        schemeOverviewPage.clickSave();
    }

    /*
    PANP-33264 - TC09: To verify that a user can complete the Scheme Application Details section with a Non-Super Product, an Existing Customer, and a Future CommencementDate.
    PANP-33266 - TC11: To verify that a user can complete the Scheme Overview Section with a System Generated Scheme name, Ordinary Scheme Type, Direct Payment Method and Scheme Tier 2.
    PANP-33272 - TC17: To verify that a user can select Non-Super product
    */

    @Category(RegressionTests.class)
    @Test
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

        searchPolicyData = new SearchPolicyData().withSearchType("Scheme").withScheme(schemeNumber);
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

        searchPolicyData = new SearchPolicyData().withSearchType("Scheme").withScheme(schemeNumber);
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
        //09/10/17 - Some values were changed regarding Rate Review.
        ProcessParametersData processParametersData = new ProcessParametersData()
                .withRenewalNoticeApplicable("Yes")
                .withNextRenewalDueDate("01/01/3001")
                .withScheduleFrequency("Annually")
                .withRateReviewTrigger("Earliest of Next Premium Rerate Date or On receipt of number of notified death and TPD claims")
                .withNextPremiumRerateDate("01/01/3001")
                .withRateReviewSpecifiedNoClaims("0")
                .withAdminFeeApplicable("No")
                .withLeadTimeForSchedule("31")
                .withScheduleDueDate("01/01/3001")
                ;
        ProcessParametersPage processParametersPage = new ProcessParametersPage(driver, processParametersData);
        processParametersPage.clickSave();
        Assert.assertFalse("PANP-33282: Error was found on the page", processParametersPage.confirmErrorMessage("ERROR"));
        processParametersPage.clickSubmit();
    }
}

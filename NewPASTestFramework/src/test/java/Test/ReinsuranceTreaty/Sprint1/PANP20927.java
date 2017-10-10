package Test.ReinsuranceTreaty.Sprint1;

import Models.Data.BusinessPartyDetailData;
import Models.Data.LoginData;
import Models.Data.SearchPolicyData;
import Models.Data.TreatyData;
import Models.Dialog.LoginDialog;
import Models.Pages.*;
import Test.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import Test.RegressionTests;
import org.junit.experimental.categories.Category;

public class PANP20927 extends BaseTest {
    //PANP-32929 TC01 - Verify that authorised users can search for treaties with different parameters.
    //PANP-32930 TC02 - Verify that multiple fields can be used to search for policies simultaneously.
    //PANP-32933 TC05 - Verify that an Authorized Treaty can be opened.
    //PANP-32938 TC10 - Verify that when parameters don't match any Reinsurance Treaty, no result is returned

    @Category(RegressionTests.class)
    @Test
    public void searchForTreaty() {
        //Login to BaNCS
        LoginData data = new LoginData().withLogin("Auto01").withPassword("1");
        LoginDialog loginDialog = new LoginDialog(driver, data);
        loginDialog.clickLoginButton();
        HomePage homePage = new HomePage(driver);
        homePage.clickReassuranceTab();

        TreatyData treatyData = new TreatyData();
        TreatyPage treatyPage = new TreatyPage(driver, treatyData);

        //ID
        treatyPage.searchTreatyByReference("42308780");
        treatyPage.clickSearch();
        Assert.assertEquals("PANP-32929: Account Reference was not correct","ACC/TR/SURP/101017/002",treatyPage.verifyAccountReference());
        treatyPage.resetSearch();

        //CommenceFrom
        treatyPage.searchTreatyByDates("10/10/2017","10/10/2017");
        treatyPage.clickSearch();
        Assert.assertEquals("PANP-32930: Account Reference was not correct","ACC/TR/SURP/101017/002",treatyPage.verifyAccountReference());
        treatyPage.resetSearch();

        //Policy Number
        treatyPage.searchReassurerByName();
        SearchPolicyData searchPolicyData = new SearchPolicyData()
                .byCustomerDetails()
                .withSurnameBusinessName("188d7b1a-9a83-4a56-a23a-f1e5366b20b7")
                .withType("Business")
                ;
        SearchPolicyPage searchPolicyPage = new SearchPolicyPage(driver, searchPolicyData);
        searchPolicyPage.clickSearch();

        BusinessPartyDetailData businessPartyDetailData = new BusinessPartyDetailData();
        BusinessPartyDetailsPage businessPartyDetailsPage = new BusinessPartyDetailsPage(driver, businessPartyDetailData);
        businessPartyDetailsPage.clickReturnWithResult();
        treatyPage.setScheduleEffectiveDate("10/10/2017");
        treatyPage.clickSearch();
        Assert.assertEquals("Account Reference was not correct","ACC/TR/SURP/101017/002",treatyPage.verifyAccountReference());

        treatyPage.resetSearch();
        treatyPage.searchTreatyByReference("1");
        treatyPage.clickSearch();
        Assert.assertEquals("PANP-32938: A result was found when one shouldn't have been","INFORMATION : POA0002 : No record found for search criteria",treatyPage.retrieveRecordNotFoundMessage());

        treatyPage.resetSearch();
        treatyPage.searchTreatyByReference("42308780");
        treatyPage.clickSearch();
        treatyPage.openLatestWorkItem();
        Assert.assertEquals("PANP-32933: Treaty ID did not match expected result","42308780",treatyPage.retrieveTreatyReference());
    }
}

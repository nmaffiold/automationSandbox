package Models.Pages;


import Models.Data.SearchPolicyData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;


public class SearchPolicyPage extends BasePage {

    @FindBy(css = "#policyPartySearch\\3a policyPartySearch_policyNoId")
    public WebElement policySearch;

    @FindBy(css = "#policyPartySearch\\3a policyPartySearch_partyNoId")
    public WebElement partySearch;

    @FindBy(xpath = "//button[@value='Search']")
    public WebElement searchButton;

    @FindBy(css = "#policyPartySearch\\3a policyPartySearch_createCustomerId")
    public WebElement createCustomerButton;

    @FindBy(css = "#policyPartySearch\\3a policyPartySearch_dummyPartyTypeId")
    public WebElement partyID;

    @FindBy(css = "#policyPartySearch\\3a policyPartySearch_selectComboId")
    public WebElement searchDropdown;

    @FindBy(xpath = "//div[contains(text(),'BY CUSTOMER DETAILS')]")
    public WebElement customerDetailSearch;

    @FindBy(css = "#policyPartySearch\\3a policyPartySearch_firstNameId")
    public WebElement firstName;

    @FindBy(css = "#policyPartySearch\\3a policyPartySearch_surnameBusinessNameId")
    public WebElement surnameBusinessName;

    @FindBy(css = "#policyPartySearch\\3a policyPartySearch_dateOfBirthId")
    public WebElement dateOfBirth;

    @FindBy(css = "#policyPartySearch\\3a policyPartySearch_postCodeId")
    public WebElement postCode;

    @FindBy(css = "#policyPartySearch\\3a policyPartySearch_houseNoId")
    public WebElement houseNumberHouseName;

    @FindBy(css = "#policyPartySearch\\3a policyPartySearch_nationalInsuranceNoId")
    public WebElement nationalInsuranceNumber;

    @FindBy(css = "#policyPartySearch\\3a policyPartySearch_genderId")
    public WebElement genderDropdown;

    @FindBy(css = "#policyPartySearch\\3a policyPartySearch_partyTypeId")
    public WebElement typeDropdown;

    @FindBy(css = "#policyPartySearch\\3a policyPartySearch_organisationTypeCmbId")
    public WebElement organisationType;

    @FindBy(css = "#policyPartySearch\\3a partytableId\\3a 0\\3a policyPartySearch_partyName2Id")
    public WebElement firstSearchResultPartyName;

    @FindBy(css = "#recentActivitySummary\\3a recentActivitySummary_goWorkItemsId > span")
    public WebElement workItems;

    @FindBy(css = "#existingWorkItemPolCust\\3a existingWorkItemCustTabletableId\\3a 0\\3a existingWorkItemPolCust_currentStatusId1")
    public WebElement latestItemStatus;

    @FindBy(css = "#existingWorkItemPolCust\\3a existingWorkItemCustTabletableId\\3a 0\\3a existingWorkItemPolCust_editDataId1")
    public WebElement editLatestItem;

    @FindBy(css = "#workItemDetail\\3a workItemDetail_customerNameId")
    public WebElement workItemCustomerName;

    @FindBy(css = "#policyPartySearch\\3a policyPartySearchSchemeTabletableId\\3a 0\\3a policyPartySearch_schemeNumberLblTextId")
    public WebElement selectedPolicy;

    @FindBy(css = "#schemeApplicationDetail\\3a schemeApplicationDetail_returnWithResultId")
    public WebElement returnWithPolicy;

    @FindBy(css = "#secondPageHeading")
    public WebElement searchPageTitle;


    public SearchPolicyPage(WebDriver driver, SearchPolicyData data) {
        super(driver);

        waitForWindowAndSwitch();
        this.switchToFrame("botFr");

        if (data.getByCustomerDetails()) {
            this.clickCustomerDetailSearch();

            if (data.getFirstName() != null) {
                this.setFirstName(data.getFirstName());
            }

            if (data.getSurnameBusinessName() != null) {
                this.setSurnameBusinessName(data.getSurnameBusinessName());
            }

            if (data.getDateOfBirth() != null) {
                this.setDateOfBirth(data.getDateOfBirth());
            }

            if (data.getPostCode() != null) {
                this.setPostCode(data.getPostCode());
            }

            if (data.getHouseNumberHouseName() != null) {
                this.setHouseNumberHouseName(data.getHouseNumberHouseName());
            }

            if (data.getNationalInsuranceNumber() != null) {
                this.setNationalInsuranceNumber(data.getNationalInsuranceNumber());
            }

            if (data.getGenderDropdown() != null) {
                this.selectGenderFromDropdown(data.getGenderDropdown());
            }

            if (data.getTypeDropdown() != null) {
                this.selectTypeFromDropdown(data.getTypeDropdown());
                if (data.getTypeDropdown().equalsIgnoreCase("Business") && data.getOrganisationType() != null) {
                    this.selectOrganisationType(data.getOrganisationType());
                }
            }
        } else {
            if (data.getPolicyToSearch() != null) {
                this.setPolicySearch(data.getPolicyToSearch());
            }
            if (data.getSearchType() != null) {
                this.selectFromPolicySearchDropdown(data.getSearchType());
                if (data.getSearchType().equalsIgnoreCase("Party")) {
                    this.setPartySearch(data.getPartyToSearch());
                } else if (data.getSearchType().equalsIgnoreCase("Scheme")) {
                    this.setPolicySearch(data.getSchemeToSearch());
                    data.setPartyTypeID(null);
                }
                if (data.getPartyTypeID() != null) {
                    this.selectPartyIDFromDropdown(data.getPartyTypeID());

                }
            }
        }
    }

    public void refreshFrame() {
        switchWindow();
        this.switchToFrame("botFr");
    }

    public void setPolicySearch(String policySearch) {
        this.policySearch.clear();
        this.policySearch.sendKeys(policySearch);
    }

    public void setPartySearch(String partySearch) {
        this.partySearch.sendKeys(partySearch);
    }

    public void clickCustomerDetailSearch() {
        this.customerDetailSearch.click();
    }

    public void clickSearch() {
        this.waitForElement(searchButton,4).click();
    }

    public void setFirstName(String key) {
        this.firstName.sendKeys(key);
    }

    public void setSurnameBusinessName(String key) {
        this.surnameBusinessName.sendKeys(key);
    }

    public void setDateOfBirth(String key) {
        this.dateOfBirth.sendKeys(key);
    }

    public void setPostCode(String key) {
        this.postCode.sendKeys(key);
    }

    public void setHouseNumberHouseName(String key) {
        this.houseNumberHouseName.sendKeys(key);
    }

    public void setNationalInsuranceNumber(String key) {
        this.nationalInsuranceNumber.sendKeys(key);
    }

    public void selectGenderFromDropdown(String option) {
        this.selectFromDropdown(genderDropdown, option);
    }

    public void selectTypeFromDropdown(String option) {
        this.selectFromDropdown(typeDropdown, option);
    }

    public void selectPartyIDFromDropdown(String option) {
        this.selectFromDropdown(partyID, option);
    }

    public void selectOrganisationType(String option) {
        this.selectFromDropdown(organisationType, option);
    }

    public void selectFromPolicySearchDropdown(String option) {
        this.selectFromDropdown(searchDropdown, option);
    }

    public void clickCreateNewCustomer() {
        this.searchButton.click();
        this.createCustomerButton.click();
    }

    public String getSearchPageTitle() {
        return this.searchPageTitle.getText();
    }

    /**
     * gets the first search result's party name
     *
     * @return the party name of the most recently created search item
     */
    public String getFirstSearchResultNames() {
        return this.firstSearchResultPartyName.getText();
    }

    /**
     * check the current frame and switch to the party recent activity frame
     */
    public void refreshWorkItemsFrame() {
        if (!this.isThisFrame("partyRecentActivityFrame")) {
            switchWindow();
            ArrayList<String> path = new ArrayList<>();
            path.add("botFr");
            path.add("partyRecentActivityFrame");
            this.switchToFrame(path);
        }
    }

    /**
     * check the current frame and switch to the existing work item frame
     */
    public void refreshExistingWorkItems() {
        if (!this.isThisFrame("existingWorkItemPolCust")) {
            switchWindow();
            ArrayList<String> path = new ArrayList<>();
            path.add("botFr");
            path.add("existingWorkItemPolCust");
            this.switchToFrame(path);
        }
    }

    /**
     * get the status of the most recently generated work item
     *
     * @return the status of the work item
     */
    public String getLatestWorkItemStatus() {
        return this.latestItemStatus.getText();
    }

    /**
     * navigate to the list of the user's pending work items
     */
    public void clickWorkItems() {
        this.workItems.click();
        refreshExistingWorkItems();
    }

    /**
     * get the latest work item's customer name
     *
     * @return the work item's customer name
     */
    public String getWorkItemCustomerName() {
        driver.switchTo().defaultContent();
        switchToFrame("botFr");
        return this.workItemCustomerName.getAttribute("value");
    }

    /**
     * click the edit icon next to the most recent work item
     */
    public void editLatestItem() {
        this.editLatestItem.click();
    }

    public void clickSelectedPolicy(){
        this.waitForElement(selectedPolicy).click();
    }

    public void clickReturnWithPolicy(){
        this.switchToFrame("botFr");
        this.returnWithPolicy.click();
    }
}

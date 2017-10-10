package Models.Dialog;

import Models.Data.AddressData;
import Models.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class AddAddressDialog extends BasePage {

    protected WebElement element;

    @FindBy(css = "#addAddress\\3a addAddress_postCodeId")
    @CacheLookup
    public WebElement postCode;

    @FindBy(css = "#addAddress\\3a addAddress_addressStatusId")
    @CacheLookup
    public WebElement addressStatus;

    @FindBy(css = "#addAddress\\3a addAddress_houseNumberId")
    @CacheLookup
    public WebElement houseNumber;

    @FindBy(css = "#addAddress\\3a addAddress_addressTypeId")
    @CacheLookup
    public WebElement addressType;

    @FindBy(css = "#addAddress\\3a addAddress_houseNameId")
    @CacheLookup
    public WebElement houseName;

    @FindBy(css = "#addAddress\\3a addAddress_preferredId")
    @CacheLookup
    public WebElement preferredAddress;

    @FindBy(css = "#addAddress\\3a addAddress_streetId")
    @CacheLookup
    public WebElement street;

    @FindBy(css = "#addAddress\\3a addAddress_coaId")
    @CacheLookup
    public WebElement COAConfirmation;

    @FindBy(css = "#addAddress\\3a addAddress_districtId")
    @CacheLookup
    public WebElement district;

    @FindBy(css = "#addAddress\\3a addAddress_startDateId")
    @CacheLookup
    public WebElement startDate;

    @FindBy(css = "#addAddress\\3a addAddress_endDateId")
    @CacheLookup
    public WebElement endDate;

    @FindBy(css = "#addAddress\\3a addAddress_townId")
    @CacheLookup
    public WebElement townCitySuburb;

    @FindBy(css = "#addAddress\\3a addAddress_stampDutyStateId")
    @CacheLookup
    public WebElement state;

    @FindBy(css = "#addAddress\\3a addAddress_countryId")
    @CacheLookup
    public WebElement country;

    @FindBy(css = "#addAddress\\3a addAddress_saveId")
    @CacheLookup
    public WebElement saveButton;

    @FindBy(xpath = "//input[@value='OK']")
    @CacheLookup
    public WebElement proceedWithoutValidation;

    @FindBy(css = "#addAddress\\3a addAddress_searchCountrybuttonId")
    public WebElement searchCountry;

    @FindBy(css = "#popup\\3a poupTabletableId\\3a 1\\3a popup_tableCheckedRadioId")
    public WebElement countrySelectionAustralia;

    @FindBy(css = "#popup\\3a popup_selectBindingId")
    public WebElement selectCountry;

    public AddAddressDialog(WebDriver driver, AddressData data) {
        super(driver);

        switchWindow();

        if (data.getPostCode() != null) {
            this.setPostCode(data.getPostCode());
        }

        if (data.getAddressStatus() != null) {
            this.setAddressStatus(data.getAddressStatus());
        }

        if (data.getAddressStatus() != null) {
            this.setAddressStatus(data.getAddressStatus());
        }

        if (data.getAddressType() != null) {
            this.selectAddressTypeFromDropdown(data.getAddressType());
        }

        if (data.getHouseName() != null) {
            this.setHouseName(data.getHouseName());
        }

        if (data.getHouseNumber() != null) {
            this.setHouseNumber(data.getHouseNumber());
        }


        if (data.getPreferredAddress() != null) {
            this.selectPreferredAddressFromDropdown(data.getPreferredAddress());
        }

        if (data.getStreet() != null) {
            this.setStreet(data.getStreet());
        }

        if (data.getCOAConfirmation() != null) {
            this.selectCOAConfirmationFromDropdown(data.getCOAConfirmation());
        }

        if (data.getDistrict() != null) {
            this.setDistrict(data.getDistrict());
        }

        if (data.getStartDate() != null) {
            this.setStartDate(data.getStartDate());
        }

        if (data.getEndDate() != null) {
            this.setEndDate(data.getEndDate());
        }

        if (data.getState() != null) {
            this.selectStateFromDropdown(data.getState());
        }
    }

    public void setPostCode(String postcode) {
        this.postCode.sendKeys(postcode);
    }

    public void setAddressStatus(String addressStatus) {
        this.addressStatus.sendKeys(addressStatus);
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber.sendKeys(houseNumber);
    }

    public void selectAddressTypeFromDropdown(String option) {
        this.selectFromDropdown(addressType, option);
    }

    public void setHouseName(String houseName) {
        this.houseName.sendKeys(houseName);
    }

    public void selectPreferredAddressFromDropdown(String option) {
        this.selectFromDropdown(preferredAddress, option);
    }

    public void setStreet(String street) {
        this.street.sendKeys(street);
    }

    public void selectCOAConfirmationFromDropdown(String option) {
        this.selectFromDropdown(COAConfirmation, option);
    }

    public void setDistrict(String district) {
        this.district.sendKeys(district);
    }

    public void setStartDate(String startDate) {
        this.startDate.sendKeys(startDate);
    }

    public void setEndDate(String endDate) {
        this.endDate.sendKeys(endDate);
    }

    public void setTownCitySuburb(String townCitySuburb) {
        this.townCitySuburb.sendKeys(townCitySuburb);
    }

    public void selectStateFromDropdown(String option) {
        this.selectFromDropdown(state, option);
    }

    public void setCountryAustralia() {
        this.searchCountry.click();
        switchWindow();
        this.countrySelectionAustralia.click();
        this.selectCountry.click();
        switchWindow();
    }

    public void clickSaveButton() {
        this.saveButton.click();
    }

    /**
     * proceed without validation if address is unvalidated
     */
    public void proceedWithoutAddressValidation() {
        this.switchWindow();
        this.proceedWithoutValidation.click();
    }
}

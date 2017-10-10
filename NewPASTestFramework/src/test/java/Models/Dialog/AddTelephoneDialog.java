package Models.Dialog;

import Models.Data.TelephoneData;
import Models.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class AddTelephoneDialog extends BasePage {

    protected WebElement element;

    @FindBy(css = "#telephoneDetail\\3a telephoneDetail_typeId")
    @CacheLookup
    public WebElement typeDropdown;

    @FindBy(css = "#telephoneDetail\\3a telephoneDetail_telephoneTypeId")
    @CacheLookup
    public WebElement telephoneType;

    @FindBy(css = "#telephoneDetail\\3a telephoneDetail_preferredId")
    @CacheLookup
    public WebElement preferred;

    @FindBy(css = "#telephoneDetail\\3a telephoneDetail_featureId")
    @CacheLookup
    public WebElement telephoneFeature;

    @FindBy(css = "#telephoneDetail\\3a telephoneDetail_stdId")
    @CacheLookup
    public WebElement areaCode;

    @FindBy(css = "#telephoneDetail\\3a telephoneDetail_telephoneNumberId")
    @CacheLookup
    public WebElement telephoneNumber;

    @FindBy(css = "#telephoneDetail\\3a telephoneDetail_extensionId")
    @CacheLookup
    public WebElement extensionNumber;

    @FindBy(css = "#telephoneDetail\\3a telephoneDetail_startDateId")
    @CacheLookup
    public WebElement startDate;

    @FindBy(css = "#telephoneDetail\\3a telephoneDetail_endDateId")
    @CacheLookup
    public WebElement endDate;

    @FindBy(css = "#telephoneDetail\\3a telephoneDetail_remarksId")
    @CacheLookup
    public WebElement remarks;

    @FindBy(css = "#telephoneDetail\\3a telephoneDetail_saveId")
    @CacheLookup
    public WebElement saveButton;

    public AddTelephoneDialog(WebDriver driver, TelephoneData data) {
        super(driver);
        switchWindow();

        if (data.getType() != null) {
            this.setType(data.getType());
        }

        if (data.getTelephoneType() != null) {
            this.setTelephoneType(data.getTelephoneType());
        }

        if (data.getPreferred() != null) {
            this.setPreferred(data.getPreferred());
        }

        if (data.getTelephoneFeature() != null) {
            this.setTelephoneFeature(data.getTelephoneFeature());
        }

        if (data.getAreaCode() != null) {
            this.setAreaCode(data.getAreaCode());
        }

        if (data.getFaxTelephoneNumber() != null) {
            this.setTelephoneNumber(data.getFaxTelephoneNumber());
        }

        if (data.getExtensionNumber() != null) {
            this.setExtensionNumber(data.getExtensionNumber());
        }

        if (data.getStartDate() != null) {
            this.setStartDate(data.getStartDate());
        }

        if (data.getEndDate() != null) {
            this.setEndDate(data.getEndDate());
        }

        if (data.getRemarks() != null) {
            this.setRemarks(data.getRemarks());
        }
    }

    public void setType(String option) {
        this.selectFromDropdown(typeDropdown, option);
    }

    public void setTelephoneType(String option) {
        this.selectFromDropdown(telephoneType, option);
    }

    public void setPreferred(String option) {
        this.selectFromDropdown(preferred, option);
    }

    public void setTelephoneFeature(String option) {
        this.selectFromDropdown(telephoneFeature, option);
    }

    public void setAreaCode(String code) {
        this.areaCode.sendKeys(code);
    }

    public void setTelephoneNumber(String number) {
        this.telephoneNumber.sendKeys(number);
    }

    public void setExtensionNumber(String number) {
        this.extensionNumber.sendKeys(number);
    }

    public void setStartDate(String date) {
        this.startDate.sendKeys(date);
    }

    public void setEndDate(String date) {
        this.endDate.sendKeys(date);
    }

    public void setRemarks(String remarks) {
        this.remarks.sendKeys(remarks);
    }

    public void clickSaveButton() {
        this.saveButton.click();
    }

}

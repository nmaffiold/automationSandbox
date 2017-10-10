package Models.Dialog;

import Models.Data.EmailData;
import Models.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class AddEmailDialog extends BasePage {

    protected WebElement element;

    @FindBy(css = "#addEmail\\3a addEmail_emailTypeId")
    @CacheLookup
    public WebElement emailType;

    @FindBy(css = "#addEmail\\3a addEmail_emailAddressId")
    @CacheLookup
    public WebElement emailAddress;

    @FindBy(css = "#addEmail\\3a addEmail_preferredId")
    @CacheLookup
    public WebElement preferred;

    @FindBy(css = "#addEmail\\3a addEmail_startDateId")
    @CacheLookup
    public WebElement startDate;

    @FindBy(css = "#addEmail\\3a addEmail_endDateId")
    @CacheLookup
    public WebElement endDate;

    @FindBy(css = "#addEmail\\3a addEmail_remarksId")
    @CacheLookup
    public WebElement remarks;


    @FindBy(css = "#addEmail\\3a addEmail_saveId")
    @CacheLookup
    public WebElement saveButton;

    public AddEmailDialog(WebDriver driver, EmailData data) {
        super(driver);
        switchWindow();

        if (data.getEmailType() != null) {
            this.setEmailType(data.getEmailType());
        }

        if (data.getEmailAddress() != null) {
            this.setEmailAddress(data.getEmailAddress());
        }

        if (data.getPreferred() != null) {
            this.setPreferred(data.getPreferred());
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

    public void setEmailType(String option) {
        this.selectFromDropdown(emailType, option);
    }

    public void setPreferred(String option) {
        this.selectFromDropdown(preferred, option);
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress.sendKeys(emailAddress);
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

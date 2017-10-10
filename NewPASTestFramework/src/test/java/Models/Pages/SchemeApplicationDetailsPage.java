package Models.Pages;

import Models.Data.LoginData;
import Models.Data.NewSchemeApplicationData;
import Models.Dialog.LoginDialog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SchemeApplicationDetailsPage extends BasePage {


    @FindBy(css = "saveButton")
    @CacheLookup
    public WebElement saveButton;

    @FindBy(css = "#schemeApplicationDetail\\3a schemeApplicationDetail_requestDateTxtId")
    @CacheLookup
    public WebElement requestDateCalendar;

    @FindBy(css = "#schemeApplicationDetail\\3a schemeApplicationDetail_effectiveDateTxtId")
    @CacheLookup
    public WebElement effectiveDateCalendar;

    @FindBy(css = "#schemeApplicationDetail\\3a schemeApplicationDetail_productNameLovId")
    @CacheLookup
    public WebElement productNameSearch;

    @FindBy(css = "#schemeApplicationDetail\\3a schemeApplicationDetail_customerNumberButtonId")
    @CacheLookup
    public WebElement customerNameSearch;

    @FindBy(css = "#schemeApplicationDetail\\3a schemeApplicationDetail_commencementDateTxtId")
    @CacheLookup
    public WebElement commencementDateCalendar;

    @FindBy(css = "#schemeApplicationDetail\\3a schemeApplicationDetail_proceedId")
    @CacheLookup
    public WebElement proceedButton;

    public SchemeApplicationDetailsPage(WebDriver driver, NewSchemeApplicationData data) {
        super(driver);
        refreshFrame();

        if (data.getRequestDate() != null) {
            this.setRequestDateCalendar(data.getRequestDate());
        }

        if (data.getEffectiveDate() != null) {
            this.setEffectiveDateCalendar(data.getEffectiveDate());
        }

        if (data.getCommencementDate() != null) {
            this.setCommencementDateCalendar(data.getCommencementDate());
        }
    }

    public void refreshFrame() {
        switchWindow();
        this.switchToFrame("botFr");
    }

    public void setRequestDateCalendar(String requestDateCalendar) {
        this.requestDateCalendar.clear();
        this.requestDateCalendar.sendKeys(requestDateCalendar);
    }

    public void setEffectiveDateCalendar(String effectiveDateCalendar) {
        this.effectiveDateCalendar.clear();
        this.effectiveDateCalendar.sendKeys(effectiveDateCalendar);
    }

    public void setCommencementDateCalendar(String commencementDateCalendar) {
        this.commencementDateCalendar.clear();
        this.commencementDateCalendar.sendKeys(commencementDateCalendar);
    }

    public void clickCustomerSearch() {
        this.customerNameSearch.click();
    }

    public void clickSave() {
        this.saveButton.click();
    }

    public void clickProductNameSearch() {
        this.productNameSearch.click();
    }

    public void clickProceedButton() {
        this.proceedButton.click();
    }
}

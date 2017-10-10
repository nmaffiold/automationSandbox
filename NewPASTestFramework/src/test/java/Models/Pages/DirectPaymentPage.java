package Models.Pages;

import Models.Data.DirectPaymentData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DirectPaymentPage extends BasePage {

    @FindBy(css = "#createRegularCash\\3a createRegularCash_payerfindId")
    public WebElement searchPayer;

    @FindBy(css = "#createRegularCash\\3a createRegularCash_sortfindId")
    public WebElement searchBSB;

    @FindBy(css = "#createRegularCash\\3a createRegularCash_accountNumberId")
    public WebElement bankAccountNumber;

    @FindBy(css = "#createRegularCash\\3a createRegularCash_bankNameId")
    public WebElement bankName;

    @FindBy(css = "#createRegularCash\\3a createRegularCash_collectionDayComboId")
    public WebElement collectOn;

    @FindBy(css = "#createRegularCash\\3a createRegularCash_collectionDayTxtId")
    public WebElement collectOnDate;

    @FindBy(css = "#createRegularCash\\3a createRegularCash_startDateId")
    public WebElement startDate;

    @FindBy(css = "#createRegularCash\\3a createRegularCash_expiryDateId")
    public WebElement expiryDate;

    @FindBy(css = "#createRegularCash\\3a createRegularCash_subTypeComboId")
    public WebElement subType;

    @FindBy(css = "#createRegularCash\\3a createRegularCash_collectionFrequencyId")
    public WebElement collectionFrequency;

    @FindBy(css = "#createRegularCash\\3a createRegularCash_currencyId")
    public WebElement currencyID;

    @FindBy(css = "#createRegularCash\\3a createRegularCash_actionId")
    public WebElement action;

    @FindBy(css = "#createRegularCash\\3a createRegularCash_saveId")
    public WebElement saveButton;

    @FindBy(css = "#createRegularCash\\3a createRegularCash_submitId")
    public WebElement submitButton;

    @FindBy(css = "#createRegularCash\\3a createRegularCash_payInReferenceId")
    public WebElement paymentReferenceNumber;

    @FindBy(css = "#navigateTree\\3a tree\\3a n-0-0-0\\3a _idJsp20")
    public WebElement newLinkedPolicy;

    @FindBy(css = "#navigateTree\\3a tree\\3a n-0-0-1\\3a _idJsp20")
    public WebElement newLinkedScheme;

    @FindBy(css = "#createRegularCash\\3a linkedEntityTableCreateRegularCashtableId\\3a 0\\3a createRegularCash_schemeapplicationnumberTextId")
    public WebElement linkedScheme;

    @FindBy(xpath = "//input[@value='OK']")
    public WebElement confirmSubmitButton;

    @FindBy(css = "#createRegularCash\\3a createRegularCash_instrumentNumberId")
    public WebElement instrumentNumberId;


    public DirectPaymentPage(WebDriver driver, DirectPaymentData data) {
        super(driver);
        refreshFrame();

        if (data.getLEBankAccountNumber() != null) {
            this.setBankAccountNumber(data.getLEBankAccountNumber());
        }

        if (data.getCollectOn() != null) {
            this.setCollectOn(data.getCollectOn());
        }

        if (data.getCollectOnDate() != null) {
            this.setCollectOnDate(data.getCollectOnDate());
        }

        if (data.getStartDate() != null) {
            this.setStartDate(data.getStartDate());
        }

        if (data.getExpiryDate() != null) {
            this.setExpiryDate(data.getExpiryDate());
        }

        if (data.getSubType() != null) {
            this.setSubType(data.getSubType());
        }

        if (data.getCollectionFrequency() != null) {
            this.setCollectionFrequency(data.getCollectionFrequency());
        }

        if (data.getCurrency() != null) {
            this.setCurrency(data.getCurrency());
        }

        if (data.getAction() != null) {
            this.setAction(data.getAction());
        }
    }

    /**
     * refresh the default frame of the current page
     */
    public void refreshFrame() {
        waitForWindowAndSwitch();
        this.switchToFrame("botFr");
    }

    public void clickNewLinkedPolicy() {
        this.switchToFrame("topFr");
        this.newLinkedPolicy.click();
    }

    public void clickNewLinkedScheme() {
        this.switchToFrame("topFr");
        this.newLinkedScheme.click();
    }

    public void clickSearchPayer() {
        this.searchPayer.click();
    }

    public void searchBSB() {
        this.searchBSB.click();
    }

    public void setCollectOnDate(String date) {
        this.collectOnDate.clear();
        this.collectOnDate.sendKeys(date);
    }

    public void setStartDate(String date) {
        this.startDate.clear();
        this.startDate.sendKeys(date);
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate.clear();
        this.expiryDate.sendKeys(expiryDate);
    }

    public String getExpiryDate() {
        return this.expiryDate.getAttribute("value");
    }

    public void setCollectOn(String option) {
        this.selectFromDropdown(collectOn, option);
    }

    public void setSubType(String option) {
        this.selectFromDropdown(subType, option);
    }

    public void setCollectionFrequency(String option) {
        this.selectFromDropdown(collectionFrequency, option);
    }

    public void setCurrency(String option) {
        this.selectFromDropdown(currencyID, option);
    }

    public void setAction(String option) {
        this.selectFromDropdown(action, option);
    }

    public void setBankAccountNumber(String number) {
        this.bankAccountNumber.sendKeys(number);
    }

    public void setLEBankName(String bankName) {
        this.bankName.sendKeys(bankName);
    }

    public void clickSave() {
        this.saveButton.click();
    }

    public String getPaymentReferenceNumber() {
        return this.paymentReferenceNumber.getAttribute("value");
    }

    public void clickSubmitButton() {
        this.submitButton.click();

        //close the Pop-up if it shows
        try {
            this.switchWindow();
            this.confirmSubmitButton.click();
        } catch (Exception e) {

        }

    }

    public String getLinkedScheme() {
        return this.linkedScheme.getText();
    }

    public String getInstrumentNumberID() {
        return this.waitForElement(instrumentNumberId).getAttribute("value");
    }
}

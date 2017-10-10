package Models.Pages;

import Models.Data.AgencyData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AgencyPage extends BasePage {

    @FindBy(css = "#addAgency\\3a addAgency_agencyCurrentNameTextId")
    public WebElement agencyName;

    @FindBy(css = "#addAgency\\3a addAgency_registrationNoTextId")
    public WebElement registrationNo;

    @FindBy(css = "#addAgency\\3a addAgency_agencyTypesComboId")
    public WebElement agencyType;

    @FindBy(css = "#addAgency\\3a addAgency_customerNamefindId")
    public WebElement searchCustomerButton;

    @FindBy(css = "#addAgency\\3a addAgency_saveId")
    public WebElement saveButton;

    @FindBy(css = "#addAgency\\3a addAgency_submitId")
    public WebElement submitButton;

    @FindBy(xpath = "//span[contains(text(),'Agency Code')]//following::input[1]")
    public WebElement agencyCode;

    public AgencyPage(WebDriver driver, AgencyData data) {
        super(driver);
        refreshFrame();

        if (data.getAgencyName() != null) {
            this.setAgencyName(data.getAgencyName());
        }
        if (data.getAgencyType() != null) {
            this.selectAgencyTypeDropdown(data.getAgencyType());
        }
        if (data.getRegistrationNumber() != null) {
            this.setRegistrationNo(data.getRegistrationNumber());
        }


    }

    /**
     * refresh the default frame of the current page
     */
    public void refreshFrame() {
        switchWindow();
        switchToFrame("botFr");
    }

    public void setAgencyName(String name) {
        this.agencyName.sendKeys(name);
    }

    public void setRegistrationNo(String number) {
        this.registrationNo.sendKeys(number);
    }

    public void selectAgencyTypeDropdown(String option) {
        this.selectFromDropdown(agencyType, option);
    }

    public void clickSaveButton() {
        this.saveButton.click();
    }

    public void clickSearchCustomerButton(){
        this.searchCustomerButton.click();
    }

    public String getAgencyCode(){
        this.switchToFrame("botFr");
        return this.waitForElement(agencyCode).getAttribute("value");
    }

    public void clickSubmitButton(){
        switchToFrame("botFr");
        this.waitForElement(submitButton).click();
    }


}

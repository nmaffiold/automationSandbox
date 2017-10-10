package Models.Pages;

import Models.Data.AgentData;
import Models.Data.AlterationData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class AgentPage extends BasePage {

    @FindBy(css = "#partyNewPowerOfAttorneyCust\\3a partyNewPowerOfAttorneyCust_notificationDateTxtId")
    @CacheLookup
    public WebElement notificationDate;

    @FindBy(css = "#partyNewPowerOfAttorneyCust\\3a partyNewPowerOfAttorneyCust_signingOptionComboId")
    public WebElement signingOption;

    @FindBy(css = "#partyNewPowerOfAttorneyCust\\3a partyNewPowerOfAttorneyCust_saveId")
    @CacheLookup
    public WebElement saveButton;

    public AgentPage(WebDriver driver, AgentData data) {
        super(driver);
        switchToPowerOfAttorneyDetailsFrame();

        if (data.getNotificationDate() != null) {
            this.setNotificationDate(data.getNotificationDate());
        }

        if (data.getSigningOption() != null) {
            this.setSigningOption(data.getSigningOption());
        }
    }

    /**
     * switch to the power of attorney details frame
     */
    public void switchToPowerOfAttorneyDetailsFrame() {
        switchWindow();
        ArrayList<String> framePath = new ArrayList<>();
        framePath.add("botFr");
        framePath.add("partyNewPowerOfAttorneyCustId");
        this.switchToFrame(framePath);
    }

    /**
     * refresh the default frame of the current page
     */
    public void refreshFrame() {
        switchWindow();
        switchToFrame("botFr");
    }

    public void setSigningOption(String option) {
        this.selectFromDropdown(signingOption, option);
    }

    public void setNotificationDate(String date) {
        this.notificationDate.sendKeys(date);
    }

    public void clickSave() {
        this.saveButton.click();
    }
}

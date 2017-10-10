package Models.Pages;

import Models.Data.AlterationData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RequestEvidencePage extends BasePage {

    @FindBy(css = "#maintainRequirement\\3a requirementTabletableId\\3a 0\\3a maintainRequirement_requirementTableeditDataId")
    @CacheLookup
    public WebElement editRequirement;

    @FindBy(css = "#maintainRequestItemStatus\\3a maintainRequestItemStatus_receiptStatusTxtId")
    @CacheLookup
    public WebElement receiptStatus;

    @FindBy(css = "#maintainRequestItemStatus\\3a maintainRequestItemStatus_saveId")
    @CacheLookup
    public WebElement saveButton;

    public RequestEvidencePage(WebDriver driver) {
        super(driver);
        refreshFrame();
    }

    /**
     * refresh the default frame of the page
     */
    public void refreshFrame() {
        switchWindow();
        switchToFrame("botFr");
    }

    public void editRequirement() {
        this.editRequirement.click();
    }

    /**
     * select a receipt status from dropdown
     *
     * @param option the option selected from the dropdown
     */
    public void editReceiptStatus(String option) {
        refreshFrame();
        this.selectFromDropdown(receiptStatus, option);
    }

    public void clickSave() {
        this.saveButton.click();
    }
}

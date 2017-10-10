package Models.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TreatySchedulePage extends BasePage {

    @FindBy(css = "#amendSchedule\\3a amendSchedule_scheduleBusReferenceId")
    public WebElement scheduleReference;

    @FindBy(css = "#amendSchedule\\3a amendSchedule_saveId")
    public WebElement saveButton;

    @FindBy(css = "#scheduleSummary\\3a scheduleSummaryTabletableId\\3a 0\\3a scheduleSummary_scheduleBusinessReferenceId")
    public WebElement latestTreatyItem;

    @FindBy(css = "#navigateTree\\3a tree\\3a n-0-0-1-1\\3a _idJsp20")
    public WebElement treatyNode;

    @FindBy(css = "#amendSchedule\\3a amendSchedule_addRuleId")
    public WebElement addRule;

    public TreatySchedulePage(WebDriver driver) {
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

    public void scheduleReference(String ref) {
        this.scheduleReference.sendKeys(ref);
        this.saveButton.click();
    }

    public void goToTreatyNode() {
        driver.switchTo().defaultContent();
        switchToFrame("topFr");
        this.treatyNode.click();
        switchToFrame("botFr");
    }

    public void addRule() {
        this.addRule.click();
    }
}

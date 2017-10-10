package Models.Dialog;


import Models.Data.WorkItemData;
import Models.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CreateWorkItemDialog extends BasePage {

    @FindBy(css = "#createWorkItems\\3a createWorkItems_customerNoImgId")
    @CacheLookup
    public WebElement searchCustomer;

    @FindBy(css = "#createWorkItems\\3a createWorkItems_saveId")
    @CacheLookup
    public WebElement saveWorkItem;

    @FindBy(css = "#createWorkItems\\3a createWorkItems_worktypeImgId")
    @CacheLookup
    public WebElement searchWorkType;

    @FindBy(css = "#createWorkItems\\3a createWorkItems_commentTextId")
    @CacheLookup
    public WebElement commentInput;

    @FindBy(css = "#createWorkItems\\3a createWorkItems_closeId")
    @CacheLookup
    public WebElement discardButton;


    public CreateWorkItemDialog(WebDriver driver, WorkItemData data) {
        super(driver);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.id("botFr")));
    }

    public void clickSearchCustomer() {
        this.waitForElement(searchCustomer).click();
    }

    public void clickSave() {
        this.waitForElement(saveWorkItem).click();
    }

    public void clickSearchWorkType() {
        this.waitForElement(searchWorkType).click();
    }

    public void setCommentInput(String Comment) {
        this.commentInput.sendKeys(Comment);
    }

    /**
     * discard the current work item
     */
    public void clickDiscardWorkItem() {
        this.waitForElement(discardButton).click();
    }


}

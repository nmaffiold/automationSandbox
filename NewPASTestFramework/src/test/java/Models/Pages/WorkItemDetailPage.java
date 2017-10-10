package Models.Pages;


import Models.Data.WorkItemData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class WorkItemDetailPage extends BasePage {

    @FindBy(css = "#workItemDetail\\3a workItemDetail_actionId")
    public WebElement actionDropdown;

    @FindBy(css = "#workItemDetail\\3a workItemDetail_saveId")
    public WebElement saveButton;

    @FindBy(css = "#workItemDetail\\3a workItemDetail_resetId")
    public WebElement resetButton;

    @FindBy(css = "#referenceData")
    public WebElement referenceDataTab;

    @FindBy(css = "#relatedData\\3a relatedData_wiTeamTextId")
    public WebElement teamField;

    @FindBy(css = "#workItemDetail\\3a workItemDetail_commentextId")
    public WebElement commentField;

    public WorkItemDetailPage(WebDriver driver, WorkItemData data) {
        super(driver);
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.id("botFr")));

        if (data.getComment() != null) {
            this.setCommentField(data.getComment());
        }

    }

    public void selectAction(String actionOption) {
        this.selectFromDropdown(actionDropdown, actionOption);
    }

    /**
     * gets the currently selected item's text from the action dropdown
     *
     * @return the selection's text
     */
    public String getActionSelected() {
        return this.getSelectedFromDropdown(actionDropdown);
    }

    public void clickResetButton() {
        this.resetButton.click();
    }

    public void clickSaveButton() {
        this.saveButton.click();
        this.confirmBrowserPopup();
    }

    public void clickUpdateSaveButton() {
        this.saveButton.click();
    }

    public void clickReferenceDataTab() {
        this.referenceDataTab.click();
    }

    /**
     * get the team attribute value
     *
     * @return team arribute value
     */
    public String getTeam() {
        ArrayList<String> path = new ArrayList<>();
        path.add("botFr");
        path.add("referenceDataframeId");
        this.switchToFrame(path);
        return this.teamField.getAttribute("value");
    }

    public void setCommentField(String comment) {
        this.commentField.sendKeys(comment);
    }

    /**
     * checks if the specified action dropdown is disabled
     *
     * @return true or false
     */
    public boolean isActionDropdownDisbaled() {
        return this.actionDropdown.getAttribute("disabled").equalsIgnoreCase("true");
    }


}

package Models.Dialog;

import Models.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class SearchWorkTypePopupDialog extends BasePage {


    // work item type popup
    @FindBy(css = "#workflowPopup\\3a popup_codeId_1")
    @CacheLookup
    public WebElement workTypeName;

    @FindBy(css = "#workflowPopup\\3a popup_searchBindingId")
    @CacheLookup
    public WebElement searchButton;

    @FindBy(css = "#workflowPopup\\3a workflowPopupTabletableId\\3a 0\\3a popup_codeId")
    @CacheLookup
    public WebElement firstWorkType;

    @FindBy(css = "#workflowPopup\\3a popup_selectBindingId")
    @CacheLookup
    public WebElement selectButton;


    public SearchWorkTypePopupDialog(WebDriver driver) {
        super(driver);

        switchWindow();
    }

    public void setWorkTypeName(String WorkType) {
        this.waitForElement(workTypeName).sendKeys(WorkType);
    }

    public void clickSearchButton() {
        this.searchButton.click();
    }

    /**
     * select the first work item on the list
     */
    public void selectFirstOnList() {
        this.firstWorkType.click();
    }

    public void clickSelect() {
        this.selectButton.click();
    }

    public void searchWorkType(String WorkType) {
        this.setWorkTypeName(WorkType);
        this.clickSearchButton();
        this.selectFirstOnList();
        this.clickSelect();
    }


}

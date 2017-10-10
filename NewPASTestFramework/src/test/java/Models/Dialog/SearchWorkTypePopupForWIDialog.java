package Models.Dialog;

import Models.Data.LoginData;
import Models.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class SearchWorkTypePopupForWIDialog extends BasePage {


    // work item type popup
    @FindBy(css = "#workTypePopupForWI\\3a workTypePopupForWI_workTypeCodeTextId")
    @CacheLookup
    public WebElement workTypeName;

    @FindBy(css = "#workTypePopupForWI\\3a workTypePopupForWI_searchButId")
    @CacheLookup
    public WebElement searchButton;

    @FindBy(css = "#workTypePopupForWI\\3a workTypeListForWItableId\\3a 0\\3a workTypePopupForWI_wrkTypeCodeTextId")
    @CacheLookup
    public WebElement firstWorkType;

    @FindBy(css = "#workTypePopupForWI\\3a workTypePopupForWI_saveButId")
    @CacheLookup
    public WebElement selectButton;


    public SearchWorkTypePopupForWIDialog(WebDriver driver) {
        super(driver);
        switchWindow();
    }

    public void setWorkTypeName(String WorkType) {
        this.waitForElement(workTypeName).sendKeys(WorkType);
    }

    public void clickSearchButton() {
        this.searchButton.click();
    }

    public void selectFirstonList() {
        this.firstWorkType.click();
    }

    public void clickSelect() {
        this.selectButton.click();
    }

    public void searchWorkType(String WorkType) {
        this.setWorkTypeName(WorkType);
        this.clickSearchButton();
        this.selectFirstonList();
        this.clickSelect();
    }


}

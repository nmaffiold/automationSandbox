package Models.Pages;

import Models.Data.LinkedRefactorData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LinkedSchemePage extends BasePage {

    @FindBy(css = "#linkedSchemeAdd\\3a linkedSchemeAdd_schemenofindButId")
    public WebElement searchPartyNumber;


    @FindBy(css = "#linkedSchemeAdd\\3a linkedSchemeAdd_saveButtonId")
    public WebElement saveButton;


    public LinkedSchemePage(WebDriver driver, LinkedRefactorData data) {
        super(driver);
        refreshFrame();
    }

    public void refreshFrame() {
        switchWindow();
        switchToFrame("botFr");
    }

    public void clickSearchPartyNumber() {
        this.searchPartyNumber.click();
    }

    public void clickSave() {
        this.saveButton.click();
    }
}

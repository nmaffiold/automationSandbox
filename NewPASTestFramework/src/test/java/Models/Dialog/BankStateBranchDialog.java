package Models.Dialog;

import Models.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class BankStateBranchDialog extends BasePage {

    protected WebElement element;


    @FindBy(css = "#leBankDetails\\3a leFindTabletableId\\3a 0\\3a leBankDetails_legalEntityId")
    @CacheLookup
    public WebElement MLCLimited;

    @FindBy(css = "#leBankDetails\\3a leBankDetails_selectId")
    @CacheLookup
    public WebElement selectButton;

    public BankStateBranchDialog(WebDriver driver) {
        super(driver);

        switchWindow();
        element = driver.findElement(By.cssSelector("#leBankDetails"));
    }

    /**
     * selects MLC Limited as the BSB option
     */
    public void selectMLCLimited() {
        this.MLCLimited.click();
        this.selectButton.click();
    }

}

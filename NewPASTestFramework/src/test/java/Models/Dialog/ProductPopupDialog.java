package Models.Dialog;

import Models.Data.LoginData;
import Models.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class ProductPopupDialog extends BasePage {

    protected WebElement element;

    public ProductPopupDialog(WebDriver driver) {
        super(driver);

        switchWindow();
        element = driver.findElement(By.cssSelector("#productNamePopup"));

    }

    @FindBy(css = "#productNamePopup\\3a productNamePopupTabletableId\\3a 0\\3a productNamePopup_productNameTxt1Id")
    public WebElement nonSuperProduct;

    @FindBy(css = "#productNamePopup\\3a productNamePopupTabletableId\\3a 1\\3a productNamePopup_productNameTxt1Id")
    public WebElement superProduct;

    @FindBy(css = "#productNamePopup\\3a productNamePopup_selectId")
    public WebElement selectButton;

    /**
     * select the super product option
     */
    public void selectSuperProduct() {
        this.superProduct.click();
        this.selectButton.click();
    }

    /**
     * select the non super product option
     */
    public void selectNonSuperProduct() {
        this.nonSuperProduct.click();
        this.selectButton.click();
    }

}

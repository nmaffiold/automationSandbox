package Models.Dialog;

import Models.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TreatyProductPopupDialog extends BasePage {

    protected WebElement element;

    @FindBy(css = "#productBenefitList\\3a productBenefitListTabletableId\\3a 1\\3a productBenefitList_codeColId")
    public WebElement nonSuperProduct;

    @FindBy(css = "#productBenefitList\\3a productBenefitListTabletableId\\3a 0\\3a productBenefitList_codeColId")
    public WebElement superProduct;

    @FindBy(css = "#productBenefitList\\3a productBenefitList_selectId")
    public WebElement selectButton;

    @FindBy(css = "#productBenefitList\\3a productBenefitListTabletableId\\3a 0\\3a productBenefitList_valueColId")
    public WebElement lifeCover;

    @FindBy(css = "#productBenefitList\\3a productBenefitListTabletableId\\3a 2\\3a productBenefitList_valueColId")
    public WebElement incomeProtection;

    public TreatyProductPopupDialog(WebDriver driver) {
        super(driver);
        switchWindow();
        element = driver.findElement(By.cssSelector("#productBenefitList"));

    }

    /**
     * select the super product from the dialog
     */
    public void selectSuperProduct() {
        this.superProduct.click();
        this.selectButton.click();
    }

    /**
     * select the non super product from the dialog
     */
    public void selectNonSuperProduct() {
        this.nonSuperProduct.click();
        this.selectButton.click();
    }

    /**
     * select the life cover option from the dialog
     */
    public void selectLifeCover() {
        this.lifeCover.click();
        this.selectButton.click();
    }

    /**
     * select the income protection option from the dialog
     */
    public void selectIncomeProtection() {
        this.incomeProtection.click();
        this.selectButton.click();
    }

}

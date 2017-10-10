package Models.Pages;

import Models.Data.NewCategoryData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCategoryPage extends BasePage {

    @FindBy(css = "#schemeNewCategoryAlteration\\3a schemeNewCategoryAlteration_categoryNameTxtId")
    public WebElement categoryName;

    @FindBy(css = "#schemeNewCategoryAlteration\\3a schemeNewCategoryAlteration_categoryNumberTxtId")
    public WebElement categoryNumber;

    @FindBy(css = "#schemeNewCategoryAlteration\\3a schemeNewCategoryAlteration_segregationGrpNumberCmbId")
    public WebElement segregationGroupName;

    @FindBy(css = "#schemeNewCategoryAlteration\\3a schemeNewCategoryAlteration_categoryTemplateCmbId")
    public WebElement categoryTemplate;

    @FindBy(css = "#schemeNewCategoryAlteration\\3a schemeNewCategoryAlteration_eligibilityTermsDescriptionCmbId")
    public WebElement eligibilityTermsDescription;

    @FindBy(css = "#schemeNewCategoryAlteration\\3a schemeNewCategoryAlteration_saveId")
    public WebElement saveButton;

    public NewCategoryPage(WebDriver driver, NewCategoryData data) {
        super(driver);
        refreshFrame();

        if (data.getCategoryName() != null) {
            this.setCategoryName(data.getCategoryName());
        }

        if (data.getCategoryNumber() != null) {
            this.setCategoryNumber(data.getCategoryNumber());
        }

        if (data.getCategoryTemplate() != null) {
            this.setCategoryTemplate(data.getCategoryTemplate());
        }

        if (data.getSegregationGroupName() != null) {
            this.setSegregationGroupName(data.getSegregationGroupName());
        }

        if (data.getEligibilityTermsDescription() != null) {
            this.setEligibilityTermsDescription(data.getEligibilityTermsDescription());
        }
    }

    public void refreshFrame() {
        switchWindow();
        this.switchToFrame("botFr");
    }

    public void setCategoryName(String option) {
        this.categoryName.sendKeys(option);
    }

    public void setCategoryNumber(String option) {
        this.categoryNumber.sendKeys(option);
    }

    public void setCategoryTemplate(String option) {
        this.selectFromDropdown(categoryTemplate, option);
    }

    public void setSegregationGroupName(String option) {
        this.selectFromDropdown(segregationGroupName, option);
    }

    public void setEligibilityTermsDescription(String option) {
        this.selectFromDropdown(eligibilityTermsDescription, option);
    }

    public void clickSave() {
        this.saveButton.click();
        switchWindow();
        refreshFrame();
    }

}

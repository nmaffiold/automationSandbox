package Models.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SchemeViewPage extends BasePage {


    @FindBy(css = "#schemeAlterationRequest\\3a schemeAlterationRequest_altRequestDateTxtId")
    public WebElement alterationRequestDate;

    @FindBy(xpath = "//a[contains(text(),'Scheme Alteration')]")
    public WebElement schemeAlteration;

    @FindBy(css = "#schemeAlterationRequest\\3a schemeAlterationRequest_altEffectiveDateTxtId")
    public WebElement alterationEffectiveDate;

    @FindBy(xpath = "//a[contains(text(),'Initiate Scheme Alteration')]")
    public WebElement initiateScheme;

    @FindBy(css = "#schemeAlterationRequest\\3a schemeAlterationRequest_schemeAlterationLevelCmbId")
    public WebElement schemeAlterationLevel;

    @FindBy(css = "#schemeAlterationRequest\\3a schemeAlterationRequest_proceedId")
    public WebElement proceedButton;

    @FindBy(css = "#schemeAlterationRequest\\3a schemeAlterationTypeTabletableId\\3a 0\\3a schemeAlterationRequest_selectCheckId")
    public WebElement addAlterCategory;

    @FindBy(css = "#schemeAlterationRequest\\3a schemeAlterationRequest_saveId")
    public WebElement saveButton;

    @FindBy(css = "#schemeAlterationRequest\\3a schemeAlterationRequest_schemeAlterationRequestHeader")
    public WebElement schemeAlterationDetailsHeading;

    @FindBy(css = "#schemeAlterationRequest\\3a schemeAlterationRequest_exitId")
    public WebElement exitButton;

    @FindBy(xpath = "//a[contains(text(), 'Work Item')]")
    public WebElement workItem;

    @FindBy(css = "#schemeAlterationRequest\\3a schemeAlterationRequest_altRefNoTxtId")
    public WebElement alterationReferenceNumber;

    @FindBy(css = "#navigateTree\\3a tree\\3a n-0-0-14-0\\3a _idJsp20")
    public WebElement workItemComment;

    @FindBy(css = "#workItemComment\\3a workItemComment_commentTextId")
    public WebElement comment;

    @FindBy(css = "#workItemComment\\3a workItemComment_saveId")
    public WebElement saveComment;

    @FindBy(css = "#schemeCategoryListAlteration\\3a schemeCategoryListAlterationTabletableId\\3a 0\\3a schemeCategoryListAlteration_categoryNameLinkTextId")
    public WebElement defaultCategory;

    @FindBy(xpath = "//a[contains(text(), 'Category List')]")
    public WebElement categoryList;

    @FindBy(xpath = "//a[contains(text(), 'New Category')]")
    public WebElement newCategory;

    @FindBy(xpath = "//a[contains(text(), 'Details')]")
    public WebElement details;

    @FindBy(css = "#existingWorkItemPolCust\\3a existingWorkItemPolTabletableId\\3a 0\\3a existingWorkItemPolCust_workTypePolTableTextId")
    public WebElement latestSchemeAlteration;

    @FindBy(css = "#schemeCategoryListAlteration\\3a schemeCategoryListAlterationTabletableId\\3a 1\\3a schemeCategoryListAlteration_categoryNoTxtId")
    public WebElement latestCategoryCreation;

    @FindBy(css = "#schemeCategoryOverviewAlteration\\3a schemeCategoryOverviewAlteration_categoryNameTxtId")
    public WebElement categoryName;

    @FindBy(xpath = "//*[@value='Submit']")
    public  WebElement submitButton;

    @FindBy(css = "#schemeCategoryListAlteration\\3a schemeCategoryListAlterationTabletableId\\3a 0\\3a schemeCategoryListAlteration_categoryNoTxtId")
    public WebElement alteredSchemeNumber;

    @FindBy(css = "#schemeCategoryListAlteration\\3a schemeCategoryListAlterationTabletableId\\3a 1\\3a schemeCategoryListAlteration_categoryNoTxtId")
    public  WebElement createdSchemeNumber;

    @FindBy(css = "#workItemDetail\\3a workItemDetail_workTypeCodeId")
    public WebElement workType;

    public SchemeViewPage(WebDriver driver) {
        super(driver);
        refreshFrame();
    }

    public void refreshFrame() {
        switchWindow();
        this.switchToFrame("botFr");
    }

    public void setAlterationDates(String date) {
        this.alterationRequestDate.clear();
        this.alterationRequestDate.sendKeys(date);
        this.alterationEffectiveDate.clear();
        this.alterationEffectiveDate.sendKeys(date);
    }

    public void initiateSchemeAlteration() {
        switchToFrame("topFr");
        this.schemeAlteration.click();
        this.initiateScheme.click();
        switchWindow();
        switchToFrame("botFr");
    }

    public void setSchemeAlterationLevel(String option) {
        this.selectFromDropdown(schemeAlterationLevel, option);
    }

    public void addCategory() {
        this.addAlterCategory.click();
        this.waitForElement(saveButton).click();
    }

    public String getSchemeAlterationHeading() {
        switchToFrame("botFr");
        return this.schemeAlterationDetailsHeading.getText();
    }

    public void clickProceed() {
        this.proceedButton.click();
    }

    public void closeAndSubmitCategoryCreation() {
        switchToFrame("topFr");
        this.details.click();
        switchToFrame("botFr");
        this.waitForElement(submitButton).click();
        waitForWindowAndSwitch();
    }

    public String getLatestCategoryCreation() {
        return this.latestCategoryCreation.getAttribute("value");
    }

    public void amendDefaultCategory() {
        switchToFrame("topFr");
        this.categoryList.click();
        switchToFrame("botFr");
        this.defaultCategory.click();
    }

    public void newCategory() {
        switchToFrame("topFr");
        this.categoryList.click();
        this.newCategory.click();
        switchToFrame("botFr");
    }

    public void changeCategoryName(String key) {
        this.categoryName.clear();
        this.categoryName.sendKeys(key);
    }

    public void submitAlteration() {
        this.submitButton.click();
        switchWindow();
    }

    public String getAlteredSchemeNumber() {
        return this.alteredSchemeNumber.getAttribute("value");
    }

    public String getCreatedSchemeNumber() {
        return this.createdSchemeNumber.getAttribute("value");
    }

    public void validateLastWorkFlowItem() {
        switchToFrame("topFr");
        this.workItem.click();
        switchToFrame("botFr");
        this.latestSchemeAlteration.click();
        waitForWindowAndSwitch();
    }

    public String getWorkType() {
        return workItem.getAttribute("value");
    }
}

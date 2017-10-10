package Models.Pages;

import Models.Data.LoginData;
import Models.Data.NewSchemeApplicationData;
import Models.Data.SchemeOverviewData;
import Models.Dialog.LoginDialog;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SchemeOverviewPage extends BasePage {

    @FindBy(css = "#schemeApplicationDetail\\3a schemeApplicationDetail_schemeNameTxtId")
    @CacheLookup
    public WebElement schemeName;

    @FindBy(css = "#schemeApplicationDetail\\3a schemeApplicationDetail_schemeCurrencyCmbId")
    @CacheLookup
    public WebElement schemeCurrencyDropdown;

    @FindBy(css = "#schemeApplicationDetail\\3a schemeApplicationDetail_blockRegularStatementCmbId")
    @CacheLookup
    public WebElement blockRegularStatementDropdown;

    @FindBy(css = "#schemeApplicationDetail\\3a schemeApplicationDetail_businessSegmentCmbId")
    @CacheLookup
    public WebElement businessSegmentDropdown;

    @FindBy(css = "#schemeApplicationDetail\\3a schemeApplicationDetail_schemeFullNameTxtId")
    @CacheLookup
    public WebElement schemeFullName;

    @FindBy(css = "#schemeApplicationDetail\\3a schemeApplicationDetail_schemeClassCmbId")
    @CacheLookup
    public WebElement schemeClass;

    @FindBy(css = "#schemeApplicationDetail\\3a schemeApplicationDetail_schemeAdministratorCodeCmbId")
    @CacheLookup
    public WebElement schemeTier;

    @FindBy(css = "#schemeApplicationDetail\\3a schemeApplicationDetail_schemeCollectionMethodCmbId")
    @CacheLookup
    public WebElement schemeCollectionMethod;

    @FindBy(css = "#schemeApplicationDetail\\3a schemeApplicationDetail_leaverSchemeCmbId")
    @CacheLookup
    public WebElement leaverSchemePersonalDivision;

    @FindBy(css = "#schemeApplicationDetail\\3a schemeApplicationDetail_blockAnnualStatementCmbId")
    @CacheLookup
    public WebElement blockAnnualStatement;

    @FindBy(css = "#schemeApplicationDetail\\3a schemeApplicationDetail_saveId")
    public WebElement saveButton;

    @FindBy(css = "#navigateTree\\3a tree\\3a n-0-0-2\\3a _idJsp18")
    public WebElement schemeSpecificationDetails;

    @FindBy(css = "#schemeApplicationDetail\\3a schemeApplicationDetail_schemeRefNoTxtId")
    public WebElement schemeNumber;

    @FindBy(css = "#schemeApplicationDetail\\3a schemeApplicationDetail_exitId")
    public WebElement exitButton;

    @FindBy(css = "#navigateTree\\3a tree\\3a n-14-0-1\\3a _idJsp18")
    public WebElement alteration;

    public SchemeOverviewPage(WebDriver driver, SchemeOverviewData data) {
        super(driver);
        refreshFrame();

        if (data.getSchemeName() != null) {
            this.setSchemeName(data.getSchemeName());
        }

        if (data.getSchemeCurrency() != null) {
            this.selectSchemeCurrencyFromDropdown(data.getSchemeCurrency());
        }

        if (data.getSchemeFullName() != null) {
            this.setSchemeFullName(data.getSchemeFullName());
        }

        if (data.getSchemeClass() != null) {
            this.selectSchemeClassFromDropdown(data.getSchemeClass());
        }

        if (data.getSchemeTier() != null) {
            this.selectSchemeTierFromDropdown(data.getSchemeTier());
        }

        if (data.getSchemeCollectionMethod() != null) {
            this.selectSchemeCollectionMethodFromDropdown(data.getSchemeCollectionMethod());
        }

        if (data.getBlockRegularStatement() != null) {
            this.selectBlockRegularFromDropdown(data.getBlockRegularStatement());
        }

        if (data.getLeaverSchemePersonalDivision() != null) {
            this.selectLeaverSchemeFromDropdown(data.getLeaverSchemePersonalDivision());
        }

        if (data.getBlockAnnualStatement() != null) {
            this.selectBlockAnnualStatement(data.getBlockAnnualStatement());
        }

        if (data.getBusinessSegment() != null) {
            this.selectBusinessSegmentFromDropdown(data.getBusinessSegment());
        }
    }

    /**
     * refresh the default frame of the page
     */
    public void refreshFrame() {
        switchWindow();
        this.switchToFrame("botFr");
    }

    public void setSchemeName(String schemeName) {
        this.schemeName.sendKeys(schemeName);
    }

    public void selectSchemeCurrencyFromDropdown(String option) {
        this.selectFromDropdown(schemeCurrencyDropdown, option);
    }

    public void setSchemeFullName(String schemeFullName) {
        this.schemeFullName.sendKeys(schemeFullName);
    }

    public void selectSchemeClassFromDropdown(String option) {
        this.selectFromDropdown(schemeClass, option);
    }

    public void selectSchemeTierFromDropdown(String option) {
        this.selectFromDropdown(schemeTier, option);
    }

    public void selectSchemeCollectionMethodFromDropdown(String option) {
        this.selectFromDropdown(schemeCollectionMethod, option);
    }

    public void selectBlockRegularFromDropdown(String option) {
        this.selectFromDropdown(blockAnnualStatement, option);
    }

    public void selectLeaverSchemeFromDropdown(String option) {
        this.selectFromDropdown(leaverSchemePersonalDivision, option);
    }

    public void selectBlockAnnualStatement(String option) {
        this.selectFromDropdown(blockAnnualStatement, option);
    }

    public void selectBusinessSegmentFromDropdown(String option) {
        this.selectFromDropdown(businessSegmentDropdown, option);
    }

    public void clickSchemeSpecificationDetails() {
        waitForWindowAndSwitch();
        switchToFrame("topFr");
        this.waitForElement(schemeSpecificationDetails).click();
    }

    public String getSchemeNumber() {
        return this.schemeNumber.getAttribute("value");
    }

    public void closeSchemeCreation() {
        this.exitButton.click();
        switchWindow();
    }

    public void clickAlteration() {
        waitForWindowAndSwitch();
        switchToFrame("topFr");
        this.alteration.click();
        switchWindow();
    }

    public void clickSave() {
        this.saveButton.click();
    }
}

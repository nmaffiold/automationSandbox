package Models.Pages;

import Models.Data.AddressData;
import Models.Data.RuleData;
import Models.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class RulePage extends BasePage {

    protected WebElement element;

    @FindBy(css = "#addTreatyRules\\3a addTreatyRules_productNameFindButtonId")
    public WebElement productNameSearch;

    @FindBy(css = "#addTreatyRules\\3a addTreatyRules_benefitFindButtonId")
    public WebElement levelValueSearch;

    @FindBy(css = "#addTreatyRules\\3a addTreatyRules_levelTypeCmbId")
    public WebElement levelType;

    @FindBy(css = "#addTreatyRules\\3a addTreatyRules_treatyLimitTextId")
    public WebElement treatyLimit;

    @FindBy(css = "#addTreatyRules\\3a addTreatyRules_renewalCommissionSplitId")
    public WebElement underwritingLimit;

    @FindBy(css = "#addTreatyRules\\3a addTreatyRules_reassurerNameCmbId")
    public WebElement reassurerName;

    @FindBy(css = "#addTreatyRules\\3a addTreatyRules_reassurerSplitId")
    public WebElement reassurerSplit;

    @FindBy(css = "#addTreatyRules\\3a addTreatyRules_retentionLimitValueId")
    public WebElement retentionLimitValue;

    @FindBy(css = "#addTreatyRules\\3a addTreatyRules_upperRetentionLimitTextId")
    public WebElement upperRetentionLimit;

    @FindBy(css = "#addTreatyRules\\3a addTreatyRules_lowerRetentionLimitTextId")
    public WebElement lowerRetentionLimit;

    @FindBy(css = "#addTreatyRules\\3a addTreatyRules_saveId")
    public WebElement saveButton;

    public RulePage(WebDriver driver, RuleData data) {
        super(driver);
        refreshFrame();

        if (data.getLevelType() != null) {
            this.setLevelType(data.getLevelType());
        }

        if (data.getReassurerName() != null) {
            this.setReassurerName(data.getReassurerName());
        }

        if (data.getTreatyLimit() != null) {
            this.setTreatyLimit(data.getTreatyLimit());
        }

        if (data.getUnderwritingLimit() != null) {
            this.setUnderwritingLimit(data.getUnderwritingLimit());
        }

        if (data.getReassurerName() != null) {
            this.setReassurerName(data.getReassurerName());
        }

        if (data.getRetentionLimitValue() != null) {
            this.setRetentionLimitValue(data.getRetentionLimitValue());
        }

        if (data.getLowerRetentionLimit() != null) {
            this.setLowerRetentionLimit(data.getLowerRetentionLimit());
        }

        if (data.getUpperRetentionLimit() != null) {
            this.setUpperRetentionLimit(data.getUpperRetentionLimit());
        }
    }

    /**
     * refresh the default frame of the page
     */
    public void refreshFrame() {
        switchWindow();
        switchToFrame("botFr");
    }

    public void searchProductName() {
        this.productNameSearch.click();
    }

    public void levelValueSearch() {
        this.levelValueSearch.click();
    }

    public void setLevelType(String option) {
        this.selectFromDropdown(levelType, option);
    }

    public void setReassurerName(String option) {
        this.selectFromDropdown(reassurerName, option);
    }

    public void setTreatyLimit(String option) {
        this.treatyLimit.sendKeys(option);
    }

    public void setUnderwritingLimit(String option) {
        this.underwritingLimit.sendKeys(option);
    }

    public void setReassurerSplit(String option) {
        this.reassurerSplit.sendKeys(option);
    }

    public void setRetentionLimitValue(String option) {
        this.retentionLimitValue.sendKeys(option);
    }

    public void setUpperRetentionLimit(String option) {
        this.upperRetentionLimit.sendKeys(option);
    }

    public void setLowerRetentionLimit(String option) {
        this.lowerRetentionLimit.sendKeys(option);
    }

    public void clickSave() {
        this.saveButton.click();
    }
}

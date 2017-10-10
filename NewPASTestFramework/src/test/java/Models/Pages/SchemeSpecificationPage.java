package Models.Pages;

import Models.Data.SchemeSpecificationData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SchemeSpecificationPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Age Criteria')]//following::input[4]")
    public WebElement minimumAgeAtEntry;

    @FindBy(xpath = "//span[contains(text(),'Age Criteria')]//following::input[5]")
    public WebElement maximumAgeAtEntry;

    @FindBy(xpath = "//span[contains(text(),'Age Criteria')]//following::select[1]")
    public WebElement ageCalculationBasis;

    @FindBy(xpath = "//span[contains(text(),'Age Criteria')]//following::input[6]")
    public WebElement ageDay;

    @FindBy(xpath = "//span[contains(text(),'Age Criteria')]//following::input[7]")
    public WebElement ageMonth;

    @FindBy(xpath = "//span[contains(text(),'Allowable Occupational Class Codes')]//following::select[1]")
    public WebElement allowableOccupationalClassCodes;

    @FindBy(xpath = "//span[contains(text(),'Continuation')]//following::select[1]")
    public WebElement continuationOptionApplicable;

    @FindBy(xpath = "//span[contains(text(),'Continuation, Leave of Absence')]//following::input[4]")
    public WebElement continuationOptionSpecifiedNumberOfDays;

    @FindBy(xpath = "//span[contains(text(),'Continuation, Leave of Absence')]//following::input[5]")
    public WebElement leaveOfAbsencePeriodInMonths;

    @FindBy(xpath = "//span[contains(text(),'Continuation, Leave of Absence')]//following::input[6]")
    public WebElement extendedCoverNumberOfDays;

    @FindBy(xpath = "//span[contains(text(),'Transfer of Cover & Life Event')]//following::select[1]")
    public WebElement transferOfCoverApplicable;

    @FindBy(xpath = "//span[contains(text(),'Transfer of Cover & Life Event')]//following::select[2]")
    public WebElement lifeEventsAdditionalCoverApplicable;

    @FindBy(xpath = "//span[contains(text(),'Other Scheme')]//following::select[1]")
    public WebElement commissionAtSource;

    @FindBy(xpath = "//span[contains(text(),'Other Scheme')]//following::select[2]")
    public WebElement takeoverTermsApply;

    @FindBy(xpath = "//span[contains(text(),'Other Scheme')]//following::select[3]")
    public WebElement profitShareApplicable;

    @FindBy(xpath = "//span[contains(text(),'Other Scheme')]//following::select[4]")
    public WebElement isReassuranceApplicable;

    @FindBy(xpath = "//span[contains(text(),'Leaver Rules')]//following::select[1]")
    public WebElement defaultLeaverOption;

    @FindBy(xpath = "//span[contains(text(),'Leaver Rules')]//following::input[4]")
    public WebElement leaverDefaultPeriodInDays;

    @FindBy(xpath = "//span[contains(text(),'Leaver Rules')]//following::select[2]")
    public WebElement schemeAssociationOnLeaver;

    @FindBy(xpath = "//span[contains(text(),'Allowable Leaver')]//following::select[1]")
    public WebElement allowableLeaverOption;

    @FindBy(xpath = "//span[contains(text(),'Contributions Test Details')]//following::select[1]")
    public WebElement atWorkRequirementApplies;

    @FindBy(xpath = "//span[contains(text(),'Contributions Test Details')]//following::select[2]")
    public WebElement contributionsTestWindow;

    @FindBy(xpath = "//span[contains(text(),'Contributions Test Details')]//following::select[3]")
    public WebElement contributionsTestWindowUnit;

    @FindBy(xpath = "//span[contains(text(),'Contributions Test Details')]//following::select[4]")
    public WebElement contributionsTestNonPaymentRule;

    @FindBy(css = "#schemeNBProductSpecification\\3a schemeNBProductSpecification_saveId")
    public WebElement saveButton;

    @FindBy(css = "#navigateTree\\3a tree\\3a n-0-0-3\\3a _idJsp18")
    public WebElement processParameters;

    public SchemeSpecificationPage(WebDriver driver, SchemeSpecificationData data) {
        super(driver);
        refreshFrame();

        if (data.getAllowableOccupationalClassCodes() != null) {
            this.setAllowableOccupationalClassCodes(data.getAllowableOccupationalClassCodes());
        }

        if (data.getCommissionAtSource() != null) {
            this.setCommissionAtSource(data.getCommissionAtSource());
        }

        if (data.getAgeCalculationBasis() != null) {
            this.setAgeCalculationBasis(data.getAgeCalculationBasis());
        }

        if (data.getAgeDay() != null) {
            this.setAgeDay(data.getAgeDay());
        }

        if (data.getAgeMonth() != null) {
            this.setAgeMonth(data.getAgeMonth());
        }

        if (data.getTakeoverTermsApply() != null) {
            this.setTakeoverTermsApply(data.getTakeoverTermsApply());
        }

        if (data.getContinuationOptionApplicable() != null) {
            this.setContinuationOptionApplicable(data.getContinuationOptionApplicable());
        }

        if (data.getContinuationOptionSpecifiedNumberOfDays() != null) {
            this.setContinuationOptionSpecifiedNumberOfDays(data.getContinuationOptionSpecifiedNumberOfDays());
        }

        if (data.getLeaveOfAbsencePeriodInMonths() != null) {
            this.setLeaveOfAbsencePeriodInMonths(data.getLeaveOfAbsencePeriodInMonths());
        }

        if (data.getProfitShareApplicable() != null) {
            this.setProfitShareApplicable(data.getProfitShareApplicable());
        }

        if (data.getTransferOfCoverApplicable() != null) {
            this.setTransferOfCoverApplicable(data.getTransferOfCoverApplicable());
        }

        if (data.getLifeEventsAdditionalCoverApplicable() != null) {
            this.setLifeEventsAdditionalCoverApplicable(data.getLifeEventsAdditionalCoverApplicable());
        }

        if (data.getExtendedCoverNumberOfDays() != null) {
            this.setExtendedCoverNumberOfDays(data.getExtendedCoverNumberOfDays());
        }

        if (data.getDefaultLeaverOption() != null) {
            this.setDefaultLeaverOption(data.getDefaultLeaverOption());
        }

        if (data.getSchemeAssociationOnLeaver() != null) {
            this.setSchemeAssociationOnLeaver(data.getSchemeAssociationOnLeaver());
        }

        if (data.getAllowableLeaverOption() != null) {
            this.setAllowableLeaverOption(data.getAllowableLeaverOption());
        }

        if (data.getLeaverDefaultPeriodInDays() != null) {
            this.setLeaverDefaultPeriodInDays(data.getLeaverDefaultPeriodInDays());
        }
    }

    /**
     * refresh the default frame of the page
     */
    public void refreshFrame() {
        switchWindow();
        this.switchToFrame("botFr");
    }

    public void setLeaverDefaultPeriodInDays(String keys) {
        this.leaverDefaultPeriodInDays.sendKeys(keys);
    }

    public void setCommissionAtSource(String keys) {
        this.selectFromDropdown(commissionAtSource, keys);
    }

    public void setAllowableOccupationalClassCodes(String keys) {
        this.allowableOccupationalClassCodes.sendKeys(keys);
    }

    public void setAgeCalculationBasis(String keys) {
        this.ageCalculationBasis.sendKeys(keys);
    }

    public void setAgeDay(String keys) {
        this.ageDay.sendKeys(keys);
    }

    public void setAgeMonth(String keys) {
        this.ageMonth.sendKeys(keys);
    }

    public void setTakeoverTermsApply(String keys) {
        this.selectFromDropdown(takeoverTermsApply, keys);
    }

    public void setContinuationOptionApplicable(String keys) {
        this.selectFromDropdown(continuationOptionApplicable, keys);
    }

    public void setContinuationOptionSpecifiedNumberOfDays(String keys) {
        this.continuationOptionSpecifiedNumberOfDays.sendKeys(keys);
    }

    public void setLeaveOfAbsencePeriodInMonths(String keys) {
        this.leaveOfAbsencePeriodInMonths.sendKeys(keys);
    }

    public void setProfitShareApplicable(String keys) {
        this.selectFromDropdown(profitShareApplicable, keys);
    }

    public void setTransferOfCoverApplicable(String keys) {
        this.selectFromDropdown(transferOfCoverApplicable, keys);
    }

    public void setLifeEventsAdditionalCoverApplicable(String keys) {
        this.selectFromDropdown(lifeEventsAdditionalCoverApplicable, keys);
    }

    public void setExtendedCoverNumberOfDays(String keys) {
        this.extendedCoverNumberOfDays.sendKeys(keys);
    }

    public void setDefaultLeaverOption(String keys){
        this.selectFromDropdown(defaultLeaverOption, keys);
    }

    public void setSchemeAssociationOnLeaver(String keys) {
        this.selectFromDropdown(schemeAssociationOnLeaver, keys);
    }

    public void setAllowableLeaverOption(String keys) {
        this.selectFromDropdown(allowableLeaverOption, keys);
    }

    public void clickSave() {
        this.saveButton.click();
    }

    public void clickProcessParameters() {
        switchToFrame("topFr");
        this.processParameters.click();
    }
}


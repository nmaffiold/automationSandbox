package Models.Pages;

import Models.Data.ProcessParametersData;
import Models.Data.SchemeSpecificationData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProcessParametersPage extends BasePage {

    @FindBy(css = "#schemeProcessparameter\\3a schemeProcessparameter_renewalNoticeApplicableCmbId")
    public WebElement renewableNoticeApplicable;

    @FindBy(css = "#schemeProcessparameter\\3a schemeProcessparameter_auditStatementApplicableCmbId")
    public WebElement auditStatementApplicable;

    @FindBy(css = "#schemeProcessparameter\\3a schemeProcessparameter_billingScheduleApplicableCmbId")
    public WebElement billingScheduleApplicable;

    @FindBy(css = "#schemeProcessparameter\\3a schemeProcessparameter_renewalDueDateTxtId")
    public WebElement nextRenewalDueDate;

    @FindBy(css = "#schemeProcessparameter\\3a schemeProcessparameter_scheduleFrequencyCmbId")
    public WebElement scheduleFrequency;

    @FindBy(css = "#schemeProcessparameter\\3a schemeProcessparameter_rateReviewTriggerCmbCmbId")
    public WebElement rateReviewTrigger;

    @FindBy(css = "#schemeProcessparameter\\3a schemeProcessparameter_nxtPremiumRerateDateTxtId")
    public WebElement nextPremiumRerateDate;

    @FindBy(css = "#schemeProcessparameter\\3a schemeProcessparameter_rateReviewNoOfClaimsTxtId")
    public WebElement rateReviewSpecifiedNoClaims;

    @FindBy(css = "#schemeProcessparameter\\3a schemeProcessparameter_adminFeeApplicableCmbId")
    public WebElement adminFeeApplicable;

    @FindBy(css = "#schemeProcessparameter\\3a schemeProcessparameter_adminFeeLevelCmbId")
    public WebElement adminFeeLevel;

    @FindBy(css = "#schemeProcessparameter\\3a schemeProcessparameter_adminFeeAtSourceCmbId")
    public WebElement adminFeeAtSource;

    @FindBy(css = "#schemeProcessparameter\\3a schemeProcessparameter_adminFeeAmountTxtId")
    public WebElement adminFeeAmount;

    @FindBy(css = "#schemeProcessparameter\3a schemeProcessparameter_adminFeePercentageTxtId")
    public WebElement adminFeePercentage;

    @FindBy(css = "#schemeProcessparameter\\3a schemeProcessparameter_leadTimeForScheduleTxtId")
    public WebElement leadTimeForSchedule;

    @FindBy(css = "#schemeProcessparameter\\3a schemeProcessparameter_scheduleDueDateTxtId")
    public WebElement scheduleDueDate;

    @FindBy(css = "#schemeProcessparameter\\3a schemeProcessparameter_saveId")
    public WebElement saveButton;

    @FindBy(css = "#schemeProcessparameter\\3a schemeProcessparameter_submitId")
    public WebElement submitButton;

    public ProcessParametersPage(WebDriver driver, ProcessParametersData data) {
        super(driver);
        refreshFrame();

        if (data.getRenewalNoticeApplicable() != null) {
            this.setRenewableNoticeApplicable(data.getRenewalNoticeApplicable());
        }

        if (data.getAuditStatementApplicable() != null) {
            this.setAuditStatementApplicable(data.getAuditStatementApplicable());
        }

        if (data.getBillingScheduleApplicable() != null) {
            this.setBillingScheduleApplicable(data.getBillingScheduleApplicable());
        }

        if (data.getNextRenewalDueDate() != null) {
            this.setNextRenewalDueDate(data.getNextRenewalDueDate());
        }

        if (data.getScheduleFrequency() != null) {
            this.setScheduleFrequency(data.getScheduleFrequency());
        }

        if (data.getRateReviewTrigger() != null) {
            this.setRateReviewTrigger(data.getRateReviewTrigger());
        }

        if (data.getNextPremiumRerateDate() != null) {
            this.setNextPremiumRerateDate(data.getNextPremiumRerateDate());
        }

        if (data.getRateReviewSpecifiedNoClaims() != null) {
            this.setRateReviewSpecifiedNoClaims(data.getRateReviewSpecifiedNoClaims());
        }

        if (data.getAdminFeeApplicable() != null) {
            this.setAdminFeeApplicable(data.getAdminFeeApplicable());
        }

        if (data.getAdminFeeLevel() != null) {
            this.setAdminFeeLevel(data.getAdminFeeLevel());
        }

        if (data.getAdminFeeAtSource() != null) {
            this.setAdminFeeAtSource(data.getAdminFeeAtSource());
        }

        if (data.getAdminFeeAmount() != null) {
            this.setAdminFeeAmount(data.getAdminFeeAmount());
        }

        if (data.getAdminFeePercentage() != null) {
            this.setAdminFeePercentage(data.getAdminFeePercentage());
        }

        if (data.getLeadTimeForSchedule() != null) {
            this.setLeadTimeForSchedule(data.getLeadTimeForSchedule());
        }

        if (data.getScheduleDueDate() != null) {
            this.setScheduleDueDate(data.getScheduleDueDate());
        }
    }

    /**
     * refresh the default frame of the page
     */
    public void refreshFrame() {
        switchWindow();
        this.switchToFrame("botFr");
    }

    public void setRenewableNoticeApplicable(String keys) {
        this.selectFromDropdown(renewableNoticeApplicable, keys);
    }

    public void setAuditStatementApplicable(String keys) {
        this.selectFromDropdown(auditStatementApplicable, keys);
    }

    public void setBillingScheduleApplicable(String keys) {
        this.selectFromDropdown(billingScheduleApplicable, keys);
    }

    public void setScheduleFrequency(String keys) {
        this.selectFromDropdown(scheduleFrequency, keys);
    }

    public void setAdminFeeApplicable(String keys) {
        this.selectFromDropdown(adminFeeApplicable, keys);
    }

    public void setAdminFeeLevel(String keys) {
        this.selectFromDropdown(adminFeeLevel, keys);
    }

    public void setAdminFeeAtSource(String keys) {
        this.selectFromDropdown(adminFeeAtSource, keys);
    }

    public void setNextRenewalDueDate(String keys) {
        this.nextRenewalDueDate.sendKeys(keys);
    }

    public void setRateReviewTrigger(String keys) {
        this.rateReviewTrigger.sendKeys(keys);
    }

    public void setNextPremiumRerateDate(String keys) {
        this.nextPremiumRerateDate.sendKeys(keys);
    }

    public void setRateReviewSpecifiedNoClaims(String keys) {
        this.rateReviewSpecifiedNoClaims.sendKeys(keys);
    }

    public void setAdminFeeAmount(String keys) {
        this.adminFeeAmount.sendKeys(keys);
    }

    public void setAdminFeePercentage(String keys) {
        this.adminFeePercentage.clear();
        this.adminFeePercentage.sendKeys(keys);
    }

    public void setLeadTimeForSchedule(String keys) {
        this.leadTimeForSchedule.sendKeys(keys);
    }

    public void setScheduleDueDate(String keys) {
        this.scheduleDueDate.sendKeys(keys);
    }

    public void clickSave() {
        this.saveButton.click();
    }

    public void clickSubmit() {
        this.submitButton.click();
    }
}


package Models.Dialog;

import Models.Data.TaxFormData;
import Models.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class TaxFormDialog extends BasePage {

    protected WebElement element;

    @FindBy(css = "#miscellaneousSupplementaryDetails\\3a miscellaneousSupplementaryDetails_taxFileNumberId")
    @CacheLookup
    public WebElement taxFileNumber;

    @FindBy(css = "#miscellaneousSupplementaryDetails\\3a miscellaneousSupplementaryDetails_australianBusNumberId")
    @CacheLookup
    public WebElement australianBusinessNumber;

    @FindBy(css = "#miscellaneousSupplementaryDetails\\3a miscellaneousSupplementaryDetails_newTaxFileNumberId")
    @CacheLookup
    public WebElement newTaxFileNumber;

    @FindBy(css = "#miscellaneousSupplementaryDetails\\3a miscellaneousSupplementaryDetails_abnStatusComboId")
    @CacheLookup
    public WebElement ABNStatus;

    @FindBy(css = "#miscellaneousSupplementaryDetails\\3a miscellaneousSupplementaryDetails_tfnExmpReasonId")
    @CacheLookup
    public WebElement TFNExemptionReason;

    @FindBy(css = "#miscellaneousSupplementaryDetails\\3a miscellaneousSupplementaryDetails_tfnStatusComboId")
    @CacheLookup
    public WebElement TFNStatus;

    @FindBy(css = "#miscellaneousSupplementaryDetails\\3a miscellaneousSupplementaryDetails_tfnStartDateId")
    @CacheLookup
    public WebElement TFNApplyDate;

    @FindBy(css = "#miscellaneousSupplementaryDetails\\3a miscellaneousSupplementaryDetails_residencyStatusComboId")
    @CacheLookup
    public WebElement residencyStatus;

    @FindBy(css = "#miscellaneousSupplementaryDetails\\3a miscellaneousSupplementaryDetails_taxFreeThresholdClaimedId")
    @CacheLookup
    public WebElement taxFreeThresholdClaimed;

    @FindBy(css = "#miscellaneousSupplementaryDetails\\3a miscellaneousSupplementaryDetails_sptoComboId")
    @CacheLookup
    public WebElement seniorPensionerTaxOffsetClaimed;

    @FindBy(css = "#miscellaneousSupplementaryDetails\\3a miscellaneousSupplementaryDetails_typeOfSPTOComboId")
    @CacheLookup
    public WebElement typeOfSPTO;

    @FindBy(css = "#miscellaneousSupplementaryDetails\\3a miscellaneousSupplementaryDetails_debtOutstandingId")
    @CacheLookup
    public WebElement HELPDebtOutstanding;

    @FindBy(css = "#miscellaneousSupplementaryDetails\\3a miscellaneousSupplementaryDetails_fslDebtOutstandingId")
    @CacheLookup
    public WebElement FSLDebtOutstanding;

    @FindBy(css = "#miscellaneousSupplementaryDetails\\3a miscellaneousSupplementaryDetails_taxOffsetClaimedId")
    @CacheLookup
    public WebElement taxOffsetsClaimed;

    @FindBy(css = "#miscellaneousSupplementaryDetails\\3a miscellaneousSupplementaryDetails_annTaxOffsetAmtId")
    @CacheLookup
    public WebElement annualTaxOffsetAmount;

    public TaxFormDialog(WebDriver driver, TaxFormData data) {
        super(driver);
        refreshFrameTaxFileForm();

        if (data.getTaxFileNumber() != null) {
            this.setTaxFileNumber(data.getTaxFileNumber());
        }

        if (data.getAustralianBusinessNumber() != null) {
            this.setAustralianBusinessNumber(data.getAustralianBusinessNumber());
        }

        if (data.getNewTaxFileNumber() != null) {
            this.setNewTaxFileNumber(data.getNewTaxFileNumber());
        }

        if (data.getABNStatus() != null) {
            this.setABNStatus(data.getABNStatus());
        }

        if (data.getTFNExemptionReason() != null) {
            this.setTFNExemptionReason(data.getTFNExemptionReason());
        }

        if (data.getTFNStatus() != null) {
            this.setTFNStatus(data.getTFNStatus());
        }

        if (data.getTFNApplyDate() != null) {
            this.setTFNApplyDate(data.getTFNApplyDate());
        }

        if (data.getResidencyStatus() != null) {
            this.setResidencyStatus(data.getResidencyStatus());
        }

        if (data.getTaxFreeThresholdClaimed() != null) {
            this.setTaxFreeThresholdClaimed(data.getTaxFreeThresholdClaimed());
        }

        if (data.getSeniorPensionerTaxOffsetClaimed() != null) {
            this.setSeniorPensionerTaxOffsetClaimed(data.getSeniorPensionerTaxOffsetClaimed());
        }

        if (data.getTypeOfSPTO() != null) {
            this.setTypeOfSPTO(data.getTypeOfSPTO());
        }

        if (data.getHelpDebtOustanding() != null) {
            this.setHELPDebtOutstanding(data.getHelpDebtOustanding());
        }

        if (data.getFSLDebtOutstanding() != null) {
            this.setFSLDebtOutstanding(data.getFSLDebtOutstanding());
        }

        if (data.getTaxOffsetsClaimed() != null) {
            this.setTaxOffsetsClaimed(data.getTaxOffsetsClaimed());
        }

        if (data.getAnnualTaxOffsetAmount() != null) {
            this.setAnnualTaxOffsetAmount(data.getAnnualTaxOffsetAmount());
        }
    }

    public void refreshFrameTaxFileForm() {
        this.switchToFrame("botFr");
        this.switchToFrameByIndex(1);

    }

    public void setTaxFileNumber(String option) {
        this.taxFileNumber.sendKeys(option);
    }

    public void setAustralianBusinessNumber(String option) {
        this.australianBusinessNumber.sendKeys(option);
    }

    public void setNewTaxFileNumber(String option) {
        this.newTaxFileNumber.sendKeys(option);
    }

    public void setTFNExemptionReason(String option) {
        this.TFNExemptionReason.sendKeys(option);
    }

    public void setTFNApplyDate(String option) {
        this.TFNApplyDate.sendKeys(option);
    }

    public void setAnnualTaxOffsetAmount(String option) {
        this.annualTaxOffsetAmount.sendKeys(option);
    }

    public void setABNStatus(String option) {
        this.selectFromDropdown(ABNStatus, option);
    }

    public void setTFNStatus(String option) {
        this.selectFromDropdown(TFNStatus, option);
    }

    public void setResidencyStatus(String option) {
        this.selectFromDropdown(residencyStatus, option);
    }

    public void setTaxFreeThresholdClaimed(String option) {
        this.selectFromDropdown(taxFreeThresholdClaimed, option);
    }

    public void setSeniorPensionerTaxOffsetClaimed(String option) {
        this.selectFromDropdown(seniorPensionerTaxOffsetClaimed, option);
    }

    public void setTypeOfSPTO(String option) {
        this.selectFromDropdown(typeOfSPTO, option);
    }

    public void setHELPDebtOutstanding(String option) {
        this.selectFromDropdown(HELPDebtOutstanding, option);
    }

    public void setFSLDebtOutstanding(String option) {
        this.selectFromDropdown(FSLDebtOutstanding, option);
    }

    public void setTaxOffsetsClaimed(String option) {
        this.selectFromDropdown(taxOffsetsClaimed, option);
    }
}

package Models.Data;

public class TaxFormData {

    private String taxFileNumber = null;
    private String australianBusinessNumber = null;
    private String newTaxFileNumber = null;
    private String ABNStatus = null;
    private String TFNExemptionReason = null;
    private String TFNStatus = null;
    private String TFNApplyDate = null;
    private String residencyStatus = null;
    private String taxFreeThresholdClaimed = null;
    private String seniorPensionerTaxOffsetClaimed = null;
    private String typeOfSPTO = null;
    private String helpDebtOffsetsClaimed = null;
    private String FSLDebtOutstanding = null;
    private String taxOffsetsClaimed = null;
    private String annualTaxOffsetAmount = null;

    public TaxFormData() {
    }

    public TaxFormData withTaxFileNumber(String number) {
        this.setTaxFileNumber(number);
        return this;
    }

    public TaxFormData withAustralianBusinessNumber(String number) {
        this.setAustralianBusinessNumber(number);
        return this;
    }

    public TaxFormData withNewTaxFileNumber(String number) {
        this.setNewTaxFileNumber(number);
        return this;
    }

    public TaxFormData withABNStatus(String status) {
        this.setABNStatus(status);
        return this;
    }

    public TaxFormData withTFNExemptionReason(String reason) {
        this.setTFNExemptionReason(reason);
        return this;
    }

    public TaxFormData withTFNStatus(String status) {
        this.setTFNStatus(status);
        return this;
    }

    public TaxFormData withTFNApplyDate(String date) {
        this.setTFNApplyDate(date);
        return this;
    }

    public TaxFormData withResidencyStatus(String status) {
        this.setResidencyStatus(status);
        return this;
    }

    public TaxFormData withTaxFreeThresholdClaimed(String claimed) {
        this.setTaxFreeThresholdClaimed(claimed);
        return this;
    }

    public TaxFormData withSeniorPensionerTaxOffsetClaimed(String claimed) {
        this.setSeniorPensionerTaxOffsetClaimed(claimed);
        return this;
    }

    public TaxFormData withTypeOfSPTO(String type) {
        this.setTypeOfSPTO(type);
        return this;
    }

    public TaxFormData withHelpDebtOutstanding(String debtOutstanding) {
        this.setHelpDebtOffsetsClaimed(debtOutstanding);
        return this;
    }

    public TaxFormData withFSLDebtOutstanding(String debtOutstanding) {
        this.setFSLDebtOutstanding(debtOutstanding);
        return this;
    }

    public TaxFormData withTaxOffsetsClaimed(String claimed) {
        this.setTaxOffsetsClaimed(claimed);
        return this;
    }

    public TaxFormData withAnnualTaxOffsetAmount(String amount) {
        this.setAnnualTaxOffsetAmount(amount);
        return this;
    }

    public String getTaxFileNumber() {
        return taxFileNumber;
    }

    public void setTaxFileNumber(String taxFileNumber) {
        this.taxFileNumber = taxFileNumber;
    }

    public String getAustralianBusinessNumber() {
        return australianBusinessNumber;
    }

    public void setAustralianBusinessNumber(String australianBusinessNumber) {
        this.australianBusinessNumber = australianBusinessNumber;
    }

    public String getNewTaxFileNumber() {
        return newTaxFileNumber;
    }

    public void setNewTaxFileNumber(String newTaxFileNumber) {
        this.newTaxFileNumber = newTaxFileNumber;
    }

    public String getABNStatus() {
        return ABNStatus;
    }

    public void setABNStatus(String ABNStatus) {
        this.ABNStatus = ABNStatus;
    }

    public String getTFNExemptionReason() {
        return TFNExemptionReason;
    }

    public void setTFNExemptionReason(String TFNExemptionReason) {
        this.TFNExemptionReason = TFNExemptionReason;
    }

    public String getTFNStatus() {
        return TFNStatus;
    }

    public void setTFNStatus(String TFNStatus) {
        this.TFNStatus = TFNStatus;
    }

    public String getTFNApplyDate() {
        return TFNApplyDate;
    }

    public void setTFNApplyDate(String TFNApplyDate) {
        this.TFNApplyDate = TFNApplyDate;
    }

    public String getResidencyStatus() {
        return residencyStatus;
    }

    public void setResidencyStatus(String residencyStatus) {
        this.residencyStatus = residencyStatus;
    }

    public String getTaxFreeThresholdClaimed() {
        return taxFreeThresholdClaimed;
    }

    public void setTaxFreeThresholdClaimed(String taxFreeThresholdClaimed) {
        this.taxFreeThresholdClaimed = taxFreeThresholdClaimed;
    }

    public String getSeniorPensionerTaxOffsetClaimed() {
        return seniorPensionerTaxOffsetClaimed;
    }

    public void setSeniorPensionerTaxOffsetClaimed(String seniorPensionerTaxOffsetClaimed) {
        this.seniorPensionerTaxOffsetClaimed = seniorPensionerTaxOffsetClaimed;
    }

    public String getTypeOfSPTO() {
        return typeOfSPTO;
    }

    public void setTypeOfSPTO(String typeOfSPTO) {
        this.typeOfSPTO = typeOfSPTO;
    }

    public String getHelpDebtOustanding() {
        return helpDebtOffsetsClaimed;
    }

    public void setHelpDebtOffsetsClaimed(String helpDebtOffsetsClaimed) {
        this.helpDebtOffsetsClaimed = helpDebtOffsetsClaimed;
    }

    public String getFSLDebtOutstanding() {
        return FSLDebtOutstanding;
    }

    public void setFSLDebtOutstanding(String FSLDebtOutstanding) {
        this.FSLDebtOutstanding = FSLDebtOutstanding;
    }

    public String getTaxOffsetsClaimed() {
        return taxOffsetsClaimed;
    }

    public void setTaxOffsetsClaimed(String taxOffsetsClaimed) {
        this.taxOffsetsClaimed = taxOffsetsClaimed;
    }

    public String getAnnualTaxOffsetAmount() {
        return annualTaxOffsetAmount;
    }

    public void setAnnualTaxOffsetAmount(String annualTaxOffsetAmount) {
        this.annualTaxOffsetAmount = annualTaxOffsetAmount;
    }
}

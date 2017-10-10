package Models.Data;

public class SchemeSpecificationData {

    private String minimumAgeAtEntry = null;
    private String maximumAgeAtEntry = null;
    private String ageCalculationBasis = null;
    private String ageDay = null;
    private String ageMonth = null;
    private String allowableOccupationalClassCodes = null;
    private String continuationOptionApplicable = null;
    private String continuationOptionSpecifiedNumberOfDays = null;
    private String leaveOfAbsencePeriodInMonths = null;
    private String extendedCoverNumberOfDays = null;
    private String transferOfCoverApplicable = null;
    private String lifeEventsAdditionalCoverApplicable = null;
    private String commissionAtSource = null;
    private String takeoverTermsApply = null;
    private String profitShareApplicable = null;
    private String isReassuranceApplicable = null;
    private String defaultLeaverOption = null;
    private String leaverDefaultPeriodInDays = null;
    private String schemeAssociationOnLeaver = null;
    private String allowableLeaverOption = null;
    private String atWorkRequirementApplies = null;
    private String contributionsTestWindow = null;
    private String getContributionsTestWindowUnit = null;
    private String contributionsTestNonPaymentRule = null;

    public SchemeSpecificationData() {

    }

    public SchemeSpecificationData withCommissionAtSource(String source) {
        this.setCommissionAtSource(source);
        return this;
    }

    public SchemeSpecificationData withDefaultLeaverOption(String option) {
        this.setDefaultLeaverOption(option);
        return this;
    }

    public SchemeSpecificationData withLeaverDefaultPeriodInDays(String days) {
        this.setLeaverDefaultPeriodInDays(days);
        return this;
    }

    public SchemeSpecificationData withSchemeAssociationOnLeaver(String leaver) {
        this.setSchemeAssociationOnLeaver(leaver);
        return this;
    }

    public SchemeSpecificationData withAllowableLeaverOption(String option) {
        this.setAllowableLeaverOption(option);
        return this;
    }

    public SchemeSpecificationData withAllowableOccupationClassCodes(String codes) {
        this.setAllowableOccupationalClassCodes(codes);
        return this;
    }

    public SchemeSpecificationData withAgeCalculationBasis(String basis) {
        this.setAgeCalculationBasis(basis);
        return this;
    }

    public SchemeSpecificationData withAgeDay(String date) {
        this.setAgeDay(date);
        return this;
    }

    public SchemeSpecificationData withAgeMonth(String month) {
        this.setAgeMonth(month);
        return this;
    }

    public SchemeSpecificationData withTakeoverTermsApply(String apply) {
        this.setTakeoverTermsApply(apply);
        return this;
    }

    public SchemeSpecificationData withContinuationOptionApplicable(String applicable) {
        this.setContinuationOptionApplicable(applicable);
        return this;
    }

    public SchemeSpecificationData withContinuationOptionSpecifiedNumberOfDays(String days) {
        this.setContinuationOptionSpecifiedNumberOfDays(days);
        return this;
    }

    public SchemeSpecificationData withLeaveOfAbsencePeriodInMonths(String months) {
        this.setLeaveOfAbsencePeriodInMonths(months);
        return this;
    }

    public SchemeSpecificationData withProfitShareApplicable(String applicable) {
        this.setProfitShareApplicable(applicable);
        return this;
    }

    public SchemeSpecificationData withTransferOfCoverApplicable(String applicable) {
        this.setTransferOfCoverApplicable(applicable);
        return this;
    }

    public SchemeSpecificationData withLifeEventsAdditionalCoverApplicable(String lifecover) {
        this.setLifeEventsAdditionalCoverApplicable(lifecover);
        return this;
    }

    public SchemeSpecificationData withExtendedCoverNumberOfDays(String days) {
        this.setExtendedCoverNumberOfDays(days);
        return this;
    }

    public String getMinimumAgeAtEntry() {
        return minimumAgeAtEntry;
    }

    public void setMinimumAgeAtEntry(String minimumAgeAtEntry) {
        this.minimumAgeAtEntry = minimumAgeAtEntry;
    }

    public String getMaximumAgeAtEntry() {
        return maximumAgeAtEntry;
    }

    public void setMaximumAgeAtEntry(String maximumAgeAtEntry) {
        this.maximumAgeAtEntry = maximumAgeAtEntry;
    }

    public String getAgeCalculationBasis() {
        return ageCalculationBasis;
    }

    public void setAgeCalculationBasis(String ageCalculationBasis) {
        this.ageCalculationBasis = ageCalculationBasis;
    }

    public String getAgeDay() {
        return ageDay;
    }

    public void setAgeDay(String ageDay) {
        this.ageDay = ageDay;
    }

    public String getAgeMonth() {
        return ageMonth;
    }

    public void setAgeMonth(String ageMonth) {
        this.ageMonth = ageMonth;
    }

    public String getAllowableOccupationalClassCodes() {
        return allowableOccupationalClassCodes;
    }

    public void setAllowableOccupationalClassCodes(String allowableOccupationalClassCodes) {
        this.allowableOccupationalClassCodes = allowableOccupationalClassCodes;
    }

    public String getContinuationOptionApplicable() {
        return continuationOptionApplicable;
    }

    public void setContinuationOptionApplicable(String continuationOptionApplicable) {
        this.continuationOptionApplicable = continuationOptionApplicable;
    }

    public String getContinuationOptionSpecifiedNumberOfDays() {
        return continuationOptionSpecifiedNumberOfDays;
    }

    public void setContinuationOptionSpecifiedNumberOfDays(String continuationOptionSpecifiedNumberOfDays) {
        this.continuationOptionSpecifiedNumberOfDays = continuationOptionSpecifiedNumberOfDays;
    }

    public String getLeaveOfAbsencePeriodInMonths() {
        return leaveOfAbsencePeriodInMonths;
    }

    public void setLeaveOfAbsencePeriodInMonths(String leaveOfAbsencePeriodInMonths) {
        this.leaveOfAbsencePeriodInMonths = leaveOfAbsencePeriodInMonths;
    }

    public String getExtendedCoverNumberOfDays() {
        return extendedCoverNumberOfDays;
    }

    public void setExtendedCoverNumberOfDays(String extendedCoverNumberOfDays) {
        this.extendedCoverNumberOfDays = extendedCoverNumberOfDays;
    }

    public String getTransferOfCoverApplicable() {
        return transferOfCoverApplicable;
    }

    public void setTransferOfCoverApplicable(String transferOfCoverApplicable) {
        this.transferOfCoverApplicable = transferOfCoverApplicable;
    }

    public String getLifeEventsAdditionalCoverApplicable() {
        return lifeEventsAdditionalCoverApplicable;
    }

    public void setLifeEventsAdditionalCoverApplicable(String lifeEventsAdditionalCoverApplicable) {
        this.lifeEventsAdditionalCoverApplicable = lifeEventsAdditionalCoverApplicable;
    }

    public String getCommissionAtSource() {
        return commissionAtSource;
    }

    public void setCommissionAtSource(String commissionAtSource) {
        this.commissionAtSource = commissionAtSource;
    }

    public String getTakeoverTermsApply() {
        return takeoverTermsApply;
    }

    public void setTakeoverTermsApply(String takeoverTermsApply) {
        this.takeoverTermsApply = takeoverTermsApply;
    }

    public String getProfitShareApplicable() {
        return profitShareApplicable;
    }

    public void setProfitShareApplicable(String profitShareApplicable) {
        this.profitShareApplicable = profitShareApplicable;
    }

    public String getIsReassuranceApplicable() {
        return isReassuranceApplicable;
    }

    public void setIsReassuranceApplicable(String isReassuranceApplicable) {
        this.isReassuranceApplicable = isReassuranceApplicable;
    }

    public String getDefaultLeaverOption() {
        return defaultLeaverOption;
    }

    public void setDefaultLeaverOption(String defaultLeaverOption) {
        this.defaultLeaverOption = defaultLeaverOption;
    }

    public String getLeaverDefaultPeriodInDays() {
        return leaverDefaultPeriodInDays;
    }

    public void setLeaverDefaultPeriodInDays(String leaverDefaultPeriodInDays) {
        this.leaverDefaultPeriodInDays = leaverDefaultPeriodInDays;
    }

    public String getSchemeAssociationOnLeaver() {
        return schemeAssociationOnLeaver;
    }

    public void setSchemeAssociationOnLeaver(String schemeAssociationOnLeaver) {
        this.schemeAssociationOnLeaver = schemeAssociationOnLeaver;
    }

    public String getAllowableLeaverOption() {
        return allowableLeaverOption;
    }

    public void setAllowableLeaverOption(String allowableLeaverOption) {
        this.allowableLeaverOption = allowableLeaverOption;
    }

    public String getAtWorkRequirementApplies() {
        return atWorkRequirementApplies;
    }

    public void setAtWorkRequirementApplies(String atWorkRequirementApplies) {
        this.atWorkRequirementApplies = atWorkRequirementApplies;
    }

    public String getContributionsTestWindow() {
        return contributionsTestWindow;
    }

    public void setContributionsTestWindow(String contributionsTestWindow) {
        this.contributionsTestWindow = contributionsTestWindow;
    }

    public String getGetContributionsTestWindowUnit() {
        return getContributionsTestWindowUnit;
    }

    public void setGetContributionsTestWindowUnit(String getContributionsTestWindowUnit) {
        this.getContributionsTestWindowUnit = getContributionsTestWindowUnit;
    }

    public String getContributionsTestNonPaymentRule() {
        return contributionsTestNonPaymentRule;
    }

    public void setContributionsTestNonPaymentRule(String contributionsTestNonPaymentRule) {
        this.contributionsTestNonPaymentRule = contributionsTestNonPaymentRule;
    }
}

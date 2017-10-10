package Models.Data;

import org.junit.Rule;

public class TreatyData {

    private String treatyReference = null;
    private String treatyCommencementDate = null;
    private String treatyExpiryDate = null;
    private String treatyBasis = null;
    private String treatyContactLevel = null;
    private String reassurerName = null;
    private String reinsurancePaymentFrequency = null;
    private String reassurerSplit = null;
    private String treatyType = null;
    private String scheduleReference = null;
    private Boolean isRule = false;
    private SearchPolicyData searchPolicyData = null;
    private RuleData ruleData = null;
    private CreateCustomerData createCustomerData = null;

    public TreatyData() {
    }

    public TreatyData withTreatyReference(String ref) {
        this.setTreatyReference(ref);
        return this;
    }

    public TreatyData withTreatyCommencementDate(String date) {
        this.setTreatyCommencementDate(date);
        return this;
    }

    public TreatyData treatyExpiryDate(String date) {
        this.setTreatyExpiryDate(date);
        return this;
    }

    public TreatyData withTreatyBasis(String basis) {
        this.setTreatyBasis(basis);
        return this;
    }

    public TreatyData withTreatyContactLevel(String level) {
        this.setTreatyContactLevel(level);
        return this;
    }

    public TreatyData withReassurerName(String name) {
        this.setReassurerName(name);
        return this;
    }

    public TreatyData withReinsurancePaymentFrequency(String frequency) {
        this.setReinsurancePaymentFrequency(frequency);
        return this;
    }

    public TreatyData withScheduleReference(String ref) {
        this.setScheduleReference(ref);
        return this;
    }

    public TreatyData withReassurerSplit(String split) {
        this.setReassurerSplit(split);
        return this;
    }

    public TreatyData withTreatyType(String type) {
        this.setTreatyType(type);
        return this;
    }

    public TreatyData isRule() {
        this.setRule(true);
        return this;
    }

    public TreatyData withSearchPolicyData(SearchPolicyData data) {
        this.setSearchPolicyData(data);
        return this;
    }

    public SearchPolicyData getSearchPolicyData() {
        return searchPolicyData;
    }

    public void setSearchPolicyData(SearchPolicyData searchPolicyData) {
        this.searchPolicyData = searchPolicyData;
    }

    public TreatyData withRuleData(RuleData data) {
        this.setRuleData(data);
        return this;
    }

    public RuleData getRuleData() {
        return ruleData;
    }

    public void setRuleData(RuleData ruleData) {
        this.ruleData = ruleData;
    }

    public TreatyData withCreateCustomerData(CreateCustomerData data) {
        this.setCreateCustomerData(data);
        return this;
    }

    public CreateCustomerData getCreateCustomerData() {
        return createCustomerData;
    }

    public void setCreateCustomerData(CreateCustomerData createCustomerData) {
        this.createCustomerData = createCustomerData;
    }

    public String getTreatyReference() {
        return treatyReference;
    }

    public void setTreatyReference(String treatyReference) {
        this.treatyReference = treatyReference;
    }

    public String getTreatyCommencementDate() {
        return treatyCommencementDate;
    }

    public void setTreatyCommencementDate(String treatyCommencementDate) {
        this.treatyCommencementDate = treatyCommencementDate;
    }

    public String getTreatyExpiryDate() {
        return treatyExpiryDate;
    }

    public void setTreatyExpiryDate(String treatyExpiryDate) {
        this.treatyExpiryDate = treatyExpiryDate;
    }

    public String getTreatyBasis() {
        return treatyBasis;
    }

    public void setTreatyBasis(String treatyBasis) {
        this.treatyBasis = treatyBasis;
    }

    public String getTreatyContactLevel() {
        return treatyContactLevel;
    }

    public void setTreatyContactLevel(String treatyContactLevel) {
        this.treatyContactLevel = treatyContactLevel;
    }

    public String getReassurerName() {
        return reassurerName;
    }

    public void setReassurerName(String reassurerName) {
        this.reassurerName = reassurerName;
    }

    public String getReinsurancePaymentFrequency() {
        return reinsurancePaymentFrequency;
    }

    public void setReinsurancePaymentFrequency(String reinsurancePaymentFrequency) {
        this.reinsurancePaymentFrequency = reinsurancePaymentFrequency;
    }

    public String getReassurerSplit() {
        return reassurerSplit;
    }

    public void setReassurerSplit(String reassurerSplit) {
        this.reassurerSplit = reassurerSplit;
    }

    public String getTreatyType() {
        return treatyType;
    }

    public void setTreatyType(String treatyType) {
        this.treatyType = treatyType;
    }

    public Boolean getRule() {
        return isRule;
    }

    public void setRule(Boolean rule) {
        isRule = rule;
    }

    public String getScheduleReference() {
        return scheduleReference;
    }

    public void setScheduleReference(String scheduleReference) {
        this.scheduleReference = scheduleReference;
    }

    @Override
    public String toString() {
        return "TreatyData{" +
                "treatyReference='" + treatyReference + '\'' +
                ", treatyCommencementDate='" + treatyCommencementDate + '\'' +
                ", treatyExpiryDate='" + treatyExpiryDate + '\'' +
                ", treatyBasis='" + treatyBasis + '\'' +
                ", treatyContactLevel='" + treatyContactLevel + '\'' +
                ", reassurerName='" + reassurerName + '\'' +
                ", reinsurancePaymentFrequency='" + reinsurancePaymentFrequency + '\'' +
                ", reassurerSplit='" + reassurerSplit + '\'' +
                ", treatyType='" + treatyType + '\'' +
                ", isRule=" + isRule +
                ", searchPolicyData=" + searchPolicyData.toString() +
                ", ruleData=" + ruleData.toString() +
                ", createCustomerData=" + createCustomerData.toString() +
                '}';
    }
}

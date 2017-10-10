package Models.Data;

public class RuleData {

    private String operatingCompany = null;
    private String levelType = null;
    private String reassurerName = null;
    private String reassurerSplit = null;
    private String treatyLimit = null;
    private String underwritingLimit = null;
    private String retentionLimitValue = null;
    private String upperRetentionLimit = null;
    private String lowerRetentionLimit = null;


    public RuleData() {
    }

    public RuleData withOperatingCompany(String company) {
        this.setOperatingCompany(company);
        return this;
    }

    public RuleData withLevelType(String type) {
        this.setLevelType(type);
        return this;
    }

    public RuleData withReassurerName(String name) {
        this.setReassurerName(name);
        return this;
    }

    public RuleData withReassurerSplit(String split) {
        this.setReassurerSplit(split);
        return this;
    }

    public RuleData withTreatyLimit(String limit) {
        this.setTreatyLimit(limit);
        return this;
    }

    public RuleData withUnderwritingLimit(String limit) {
        this.setUnderwritingLimit(limit);
        return this;
    }

    public RuleData withRetentionLimitValue(String value) {
        this.setRetentionLimitValue(value);
        return this;
    }

    public RuleData withUpperRetentionLimit(String limit) {
        this.setUpperRetentionLimit(limit);
        return this;
    }

    public RuleData withLowerRetentionLimit(String limit) {
        this.setLowerRetentionLimit(limit);
        return this;
    }

    public String getOperatingCompany() {
        return operatingCompany;
    }

    public void setOperatingCompany(String operatingCompany) {
        this.operatingCompany = operatingCompany;
    }

    public String getLevelType() {
        return levelType;
    }

    public void setLevelType(String levelType) {
        this.levelType = levelType;
    }

    public String getReassurerName() {
        return reassurerName;
    }

    public void setReassurerName(String reassurerName) {
        this.reassurerName = reassurerName;
    }

    public String getReassurerSplit() {
        return reassurerSplit;
    }

    public void setReassurerSplit(String reassurerSplit) {
        this.reassurerSplit = reassurerSplit;
    }

    public String getTreatyLimit() {
        return treatyLimit;
    }

    public void setTreatyLimit(String treatyLimit) {
        this.treatyLimit = treatyLimit;
    }

    public String getUnderwritingLimit() {
        return underwritingLimit;
    }

    public void setUnderwritingLimit(String underwritingLimit) {
        this.underwritingLimit = underwritingLimit;
    }

    public String getRetentionLimitValue() {
        return retentionLimitValue;
    }

    public void setRetentionLimitValue(String retentionLimitValue) {
        this.retentionLimitValue = retentionLimitValue;
    }

    public String getUpperRetentionLimit() {
        return upperRetentionLimit;
    }

    public void setUpperRetentionLimit(String upperRetentionLimit) {
        this.upperRetentionLimit = upperRetentionLimit;
    }

    public String getLowerRetentionLimit() {
        return lowerRetentionLimit;
    }

    public void setLowerRetentionLimit(String lowerRetentionLimit) {
        this.lowerRetentionLimit = lowerRetentionLimit;
    }

    @Override
    public String toString() {
        return "RuleData{" +
                "operatingCompany='" + operatingCompany + '\'' +
                ", levelType='" + levelType + '\'' +
                ", reassurerName='" + reassurerName + '\'' +
                ", reassurerSplit='" + reassurerSplit + '\'' +
                ", treatyLimit='" + treatyLimit + '\'' +
                ", underwritingLimit='" + underwritingLimit + '\'' +
                ", retentionLimitValue='" + retentionLimitValue + '\'' +
                ", upperRetentionLimit='" + upperRetentionLimit + '\'' +
                ", lowerRetentionLimit='" + lowerRetentionLimit + '\'' +
                '}';
    }
}

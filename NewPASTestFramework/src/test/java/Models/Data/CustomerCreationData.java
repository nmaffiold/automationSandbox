package Models.Data;

public class CustomerCreationData {

    private String customerType = null;
    private String title = null;
    private String firstName = null;
    private String secondName = null;
    private String otherInitials = null;
    private String surname = null;
    private String dateOfBirth = null;
    private String NINumber = null;
    private String maritalStatus = null;
    private String gender = null;
    private String companyIdentifier = null;
    private String previousName = null;
    private String preferredName = null;
    private String goneAwayRiskIndicator = null;
    private String smokerStatus = null;
    private String preferredMethodOfCommunication = null;
    private String websiteAddress = null;
    private String bonusStatementPreference = null;
    private String decoration = null;
    private String investorStatus = null;
    private String sanctionedEntity = null;
    private String dateOfLastSanctionsScreening = null;
    private Boolean governmentEntity = false;
    private String occupation = null;
    private String employmentStatus = null;
    private String totalGrossYearlySalary = null;
    private String totalNetMonthlyIncome = null;
    private String incomeCurrency = null;
    private String taxThresholdAmount = null;
    private String taxThresholdCurrency = null;

    public CustomerCreationData() {
    }

    public CustomerCreationData withCustomerType(String customerType) {
        this.setCustomerType(customerType);
        return this;
    }

    public CustomerCreationData withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    public CustomerCreationData withFirstName(String firstName) {
        this.setFirstName(firstName);
        return this;
    }

    public CustomerCreationData withSecondName(String secondName) {
        this.setSecondName(secondName);
        return this;
    }

    public CustomerCreationData withOtherInitials(String initials) {
        this.setOtherInitials(initials);
        return this;
    }

    public CustomerCreationData withSurname(String surname) {
        this.setSurname(surname);
        return this;
    }

    public CustomerCreationData withDateOfBirth(String date) {
        this.setDateOfBirth(date);
        return this;
    }

    public CustomerCreationData withNINumber(String number) {
        this.setNINumber(number);
        return this;
    }

    public CustomerCreationData withMaritalStatus(String status) {
        this.setMaritalStatus(status);
        return this;
    }

    public CustomerCreationData withGender(String gender) {
        this.setGender(gender);
        return this;
    }

    public CustomerCreationData withCompanyIdentifier(String identifier) {
        this.setCompanyIdentifier(identifier);
        return this;
    }

    public CustomerCreationData withPreviousName(String name) {
        this.setPreviousName(name);
        return this;
    }

    public CustomerCreationData withPreferredName(String preferredName) {
        this.setPreferredName(preferredName);
        return this;
    }

    public CustomerCreationData withGoneAwayRiskIndicator(String riskIndicator) {
        this.setGoneAwayRiskIndicator(riskIndicator);
        return this;
    }

    public CustomerCreationData withSmokerStatus(String smokerStatus) {
        this.setSmokerStatus(smokerStatus);
        return this;
    }

    public CustomerCreationData withPreferredMethodOfCommunication(String method) {
        this.setPreferredMethodOfCommunication(method);
        return this;
    }

    public CustomerCreationData withWebsiteAddress(String websiteAddress) {
        this.setWebsiteAddress(websiteAddress);
        return this;
    }

    public CustomerCreationData withBonusStatementPreference(String preference) {
        this.setBonusStatementPreference(preference);
        return this;
    }

    public CustomerCreationData withDecoration(String decoration) {
        this.setDecoration(decoration);
        return this;
    }

    public CustomerCreationData withInvestorStatus(String status) {
        this.setInvestorStatus(status);
        return this;
    }

    public CustomerCreationData withSanctionedEntity(String entity) {
        this.setSanctionedEntity(entity);
        return this;
    }

    public CustomerCreationData withDateOfLastSanctionsScreening(String date) {
        this.setDateOfBirth(date);
        return this;
    }

    public CustomerCreationData isGovernmentEntity() {
        this.setGovernmentEntity(true);
        return this;
    }

    public CustomerCreationData withOccupation(String occupation) {
        this.setOccupation(occupation);
        return this;
    }

    public CustomerCreationData withEmploymentStatus(String status) {
        this.setEmploymentStatus(status);
        return this;
    }

    public CustomerCreationData withTotalGrossYearlySalary(String status) {
        this.setTotalGrossYearlySalary(status);
        return this;
    }

    public CustomerCreationData withTotalNetMonthlyIncome(String income) {
        this.setTotalNetMonthlyIncome(income);
        return this;
    }

    public CustomerCreationData withIncomeCurrency(String currency) {
        this.setIncomeCurrency(currency);
        return this;
    }

    public CustomerCreationData withTaxThresholdAmount(String amount) {
        this.setTaxThresholdAmount(amount);
        return this;
    }

    public CustomerCreationData withTaxThresholdCurrency(String currency) {
        this.setTaxThresholdCurrency(currency);
        return this;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getOtherInitials() {
        return otherInitials;
    }

    public void setOtherInitials(String otherInitials) {
        this.otherInitials = otherInitials;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNINumber() {
        return NINumber;
    }

    public void setNINumber(String NINumber) {
        this.NINumber = NINumber;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCompanyIdentifier() {
        return companyIdentifier;
    }

    public void setCompanyIdentifier(String companyIdentifier) {
        this.companyIdentifier = companyIdentifier;
    }

    public String getPreviousName() {
        return previousName;
    }

    public void setPreviousName(String previousName) {
        this.previousName = previousName;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public String getGoneAwayRiskIndicator() {
        return goneAwayRiskIndicator;
    }

    public void setGoneAwayRiskIndicator(String goneAwayRiskIndicator) {
        this.goneAwayRiskIndicator = goneAwayRiskIndicator;
    }

    public String getSmokerStatus() {
        return smokerStatus;
    }

    public void setSmokerStatus(String smokerStatus) {
        this.smokerStatus = smokerStatus;
    }

    public String getPreferredMethodOfCommunication() {
        return preferredMethodOfCommunication;
    }

    public void setPreferredMethodOfCommunication(String preferredMethodOfCommunication) {
        this.preferredMethodOfCommunication = preferredMethodOfCommunication;
    }

    public String getWebsiteAddress() {
        return websiteAddress;
    }

    public void setWebsiteAddress(String websiteAddress) {
        this.websiteAddress = websiteAddress;
    }

    public String getBonusStatementPreference() {
        return bonusStatementPreference;
    }

    public void setBonusStatementPreference(String bonusStatementPreference) {
        this.bonusStatementPreference = bonusStatementPreference;
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    public String getInvestorStatus() {
        return investorStatus;
    }

    public void setInvestorStatus(String investorStatus) {
        this.investorStatus = investorStatus;
    }

    public String getSanctionedEntity() {
        return sanctionedEntity;
    }

    public void setSanctionedEntity(String sanctionedEntity) {
        this.sanctionedEntity = sanctionedEntity;
    }

    public String getDateOfLastSanctionsScreening() {
        return dateOfLastSanctionsScreening;
    }

    public void setDateOfLastSanctionsScreening(String dateOfLastSanctionsScreening) {
        this.dateOfLastSanctionsScreening = dateOfLastSanctionsScreening;
    }

    public Boolean getGovernmentEntity() {
        return governmentEntity;
    }

    public void setGovernmentEntity(Boolean governmentEntity) {
        this.governmentEntity = governmentEntity;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getTotalGrossYearlySalary() {
        return totalGrossYearlySalary;
    }

    public void setTotalGrossYearlySalary(String totalGrossYearlySalary) {
        this.totalGrossYearlySalary = totalGrossYearlySalary;
    }

    public String getTotalNetMonthlyIncome() {
        return totalNetMonthlyIncome;
    }

    public void setTotalNetMonthlyIncome(String totalNetMonthlyIncome) {
        this.totalNetMonthlyIncome = totalNetMonthlyIncome;
    }

    public String getIncomeCurrency() {
        return incomeCurrency;
    }

    public void setIncomeCurrency(String incomeCurrency) {
        this.incomeCurrency = incomeCurrency;
    }

    public String getTaxThresholdAmount() {
        return taxThresholdAmount;
    }

    public void setTaxThresholdAmount(String taxThresholdAmount) {
        this.taxThresholdAmount = taxThresholdAmount;
    }

    public String getTaxThresholdCurrency() {
        return taxThresholdCurrency;
    }

    public void setTaxThresholdCurrency(String taxThresholdCurrency) {
        this.taxThresholdCurrency = taxThresholdCurrency;
    }
}

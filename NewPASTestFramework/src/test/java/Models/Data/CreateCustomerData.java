package Models.Data;

public class CreateCustomerData {

    private String customerType = null;
    private String organisationType = null;
    private String nameOfBusiness = null;
    private String contactName = null;
    private String natureOfBusiness = null;
    private String taxReferenceNumber = null;
    private String taxDistrict = null;
    private String preferredMethodOfCommunication = null;
    private String companyIdentifier = null;
    private String websiteAddress = null;
    private String investorStatus = null;
    private String sanctionedEntity = null;
    private String dateOfLastSanctionsScreening = null;
    private Boolean isGovernmentEntity = false;

    public CreateCustomerData() {
    }

    public CreateCustomerData withCustomerType(String customerType) {
        this.setCustomerType(customerType);
        return this;
    }

    public CreateCustomerData withOrganisationType(String organisationType) {
        this.setOrganisationType(organisationType);
        return this;
    }

    public CreateCustomerData withNameOfBusiness(String nameOfBusiness) {
        this.setNameOfBusiness(nameOfBusiness);
        return this;
    }

    public CreateCustomerData withContactName(String contactName) {
        this.setContactName(contactName);
        return this;
    }

    public CreateCustomerData natureOfBusiness(String natureOfBusiness) {
        this.setNatureOfBusiness(natureOfBusiness);
        return this;
    }

    public CreateCustomerData withTaxReferenceNumber(String taxReferenceNumber) {
        this.setTaxReferenceNumber(taxReferenceNumber);
        return this;
    }

    public CreateCustomerData withTaxDistrict(String taxDistrict) {
        this.setTaxDistrict(taxDistrict);
        return this;
    }

    public CreateCustomerData withPreferredMethodOfCommunication(String preferredMethodOfCommunication) {
        this.setPreferredMethodOfCommunication(preferredMethodOfCommunication);
        return this;
    }

    public CreateCustomerData withCompanyIdentifier(String companyIdentifier) {
        this.setCompanyIdentifier(companyIdentifier);
        return this;
    }

    public CreateCustomerData withWebsiteAddress(String websiteAddress) {
        this.setWebsiteAddress(websiteAddress);
        return this;
    }

    public CreateCustomerData withInvestorStatus(String investorStatus) {
        this.setInvestorStatus(investorStatus);
        return this;
    }

    public CreateCustomerData withSanctionedEntity(String sanctionedEntity) {
        this.setSanctionedEntity(sanctionedEntity);
        return this;
    }

    public CreateCustomerData withDateOfLastSanctionsScreening(String sanctionedEntity) {
        this.setDateOfLastSanctionsScreening(sanctionedEntity);
        return this;
    }

    public CreateCustomerData isGovernmentEntity(String governmentEntity) {
        this.setIsGovernmentEntity(true);
        return this;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getOrganisationType() {
        return organisationType;
    }

    public void setOrganisationType(String organisationType) {
        this.organisationType = organisationType;
    }

    public String getNameOfBusiness() {
        return nameOfBusiness;
    }

    public void setNameOfBusiness(String nameOfBusiness) {
        this.nameOfBusiness = nameOfBusiness;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getNatureOfBusiness() {
        return natureOfBusiness;
    }

    public void setNatureOfBusiness(String natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }

    public String getTaxReferenceNumber() {
        return taxReferenceNumber;
    }

    public void setTaxReferenceNumber(String taxReferenceNumber) {
        this.taxReferenceNumber = taxReferenceNumber;
    }

    public String getTaxDistrict() {
        return taxDistrict;
    }

    public void setTaxDistrict(String taxDistrict) {
        this.taxDistrict = taxDistrict;
    }

    public String getPreferredMethodOfCommunication() {
        return preferredMethodOfCommunication;
    }

    public void setPreferredMethodOfCommunication(String preferredMethodOfCommunication) {
        this.preferredMethodOfCommunication = preferredMethodOfCommunication;
    }

    public String getCompanyIdentifier() {
        return companyIdentifier;
    }

    public void setCompanyIdentifier(String companyIdentifier) {
        this.companyIdentifier = companyIdentifier;
    }

    public String getWebsiteAddress() {
        return websiteAddress;
    }

    public void setWebsiteAddress(String websiteAddress) {
        this.websiteAddress = websiteAddress;
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

    public Boolean getIsGovernmentEntity() {
        return isGovernmentEntity;
    }

    public void setIsGovernmentEntity(Boolean governmentEntity) {
        isGovernmentEntity = governmentEntity;
    }

    @Override
    public String toString() {
        return "CreateCustomerData{" +
                "customerType='" + customerType + '\'' +
                ", organisationType='" + organisationType + '\'' +
                ", nameOfBusiness='" + nameOfBusiness + '\'' +
                ", contactName='" + contactName + '\'' +
                ", natureOfBusiness='" + natureOfBusiness + '\'' +
                ", taxReferenceNumber='" + taxReferenceNumber + '\'' +
                ", taxDistrict='" + taxDistrict + '\'' +
                ", preferredMethodOfCommunication='" + preferredMethodOfCommunication + '\'' +
                ", companyIdentifier='" + companyIdentifier + '\'' +
                ", websiteAddress='" + websiteAddress + '\'' +
                ", investorStatus='" + investorStatus + '\'' +
                ", sanctionedEntity='" + sanctionedEntity + '\'' +
                ", dateOfLastSanctionsScreening='" + dateOfLastSanctionsScreening + '\'' +
                ", isGovernmentEntity=" + isGovernmentEntity +
                '}';
    }
}

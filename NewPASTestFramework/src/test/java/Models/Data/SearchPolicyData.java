package Models.Data;


public class SearchPolicyData {


    private String policyToSearch = null;
    private String partyToSearch = null;
    private String searchType = null;
    private String partyTypeID = null;

    private Boolean byCustomerDetails = false;
    private String firstName = null;
    private String surnameBusinessName = null;
    private String dateOfBirth = null;
    private String postCode = null;
    private String houseNumberHouseName = null;
    private String nationalInsuranceNumber = null;
    private String genderDropdown = null;
    private String typeDropdown = null;
    private String organisationType = null;
    private String schemeToSearch = null;



    public SearchPolicyData() {

    }

    public SearchPolicyData withScheme(String Scheme) {
        this.setSchemeToSearch(Scheme);
        return this;
    }
    public SearchPolicyData withPolicy(String policy) {
        this.setPolicyToSearch(policy);
        return this;
    }

    public SearchPolicyData withParty(String party) {
        this.setPartyToSearch(party);
        return this;
    }

    public SearchPolicyData withSearchType(String searchType) {
        this.setSearchType(searchType);
        return this;
    }

    public SearchPolicyData withPartyTypeID(String type) {
        this.setPartyTypeID(type);
        return this;
    }

    public SearchPolicyData byCustomerDetails() {
        setByCustomerDetails(true);
        return this;
    }

    public SearchPolicyData withFirstName(String firstName) {
        this.setFirstName(firstName);
        return this;
    }

    public SearchPolicyData withSurnameBusinessName(String surnameBusinessName) {
        this.setSurnameBusinessName(surnameBusinessName);
        return this;
    }

    public SearchPolicyData withDateOfBirth(String dateOfBirth) {
        this.setDateOfBirth(dateOfBirth);
        return this;
    }

    public SearchPolicyData withPostCode(String postCode) {
        this.setPostCode(postCode);
        return this;
    }

    public SearchPolicyData withHouseNumberHouseName(String houseNumberHouseName) {
        this.setHouseNumberHouseName(houseNumberHouseName);
        return this;
    }

    public SearchPolicyData withNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.setNationalInsuranceNumber(nationalInsuranceNumber);
        return this;
    }

    public SearchPolicyData withGender(String genderDropdown) {
        this.setGenderDropdown(genderDropdown);
        return this;
    }

    public SearchPolicyData withType(String typeDropdown) {
        this.setTypeDropdown(typeDropdown);
        return this;
    }

    public SearchPolicyData withOrganisationType(String organisationType) {
        this.setOrganisationType(organisationType);
        return this;
    }

    public String getPolicyToSearch() {
        return policyToSearch;
    }

    public void setPolicyToSearch(String policyToSearch) {
        this.policyToSearch = policyToSearch;
    }

    public String getPartyToSearch() {
        return partyToSearch;
    }

    public void setPartyToSearch(String partyToSearch) {
        this.partyToSearch = partyToSearch;
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchtype) {
        this.searchType = searchtype;
    }

    public String getPartyTypeID() {
        return partyTypeID;
    }

    public void setPartyTypeID(String partyTypeID) {
        this.partyTypeID = partyTypeID;
    }

    public Boolean getByCustomerDetails() {
        return byCustomerDetails;
    }

    public void setByCustomerDetails(Boolean byCustomerDetails) {
        this.byCustomerDetails = byCustomerDetails;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurnameBusinessName() {
        return surnameBusinessName;
    }

    public void setSurnameBusinessName(String surnameBusinessName) {
        this.surnameBusinessName = surnameBusinessName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getHouseNumberHouseName() {
        return houseNumberHouseName;
    }

    public void setHouseNumberHouseName(String houseNumberHouseName) {
        this.houseNumberHouseName = houseNumberHouseName;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public String getGenderDropdown() {
        return genderDropdown;
    }

    public void setGenderDropdown(String genderDropdown) {
        this.genderDropdown = genderDropdown;
    }

    public String getTypeDropdown() {
        return typeDropdown;
    }

    public void setTypeDropdown(String typeDropdown) {
        this.typeDropdown = typeDropdown;
    }

    public String getOrganisationType() {
        return organisationType;
    }

    public void setOrganisationType(String organisationType) {
        this.organisationType = organisationType;
    }

    public String getSchemeToSearch() {
        return schemeToSearch;
    }

    public void setSchemeToSearch(String schemeToSearch) {
        this.schemeToSearch = schemeToSearch;
    }

    @Override
    public String toString() {
        return "SearchPolicyData{" +
                "policyToSearch='" + policyToSearch + '\'' +
                ", partyToSearch='" + partyToSearch + '\'' +
                ", searchType='" + searchType + '\'' +
                ", partyTypeID='" + partyTypeID + '\'' +
                ", byCustomerDetails=" + byCustomerDetails +
                ", firstName='" + firstName + '\'' +
                ", surnameBusinessName='" + surnameBusinessName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", postCode='" + postCode + '\'' +
                ", houseNumberHouseName='" + houseNumberHouseName + '\'' +
                ", nationalInsuranceNumber='" + nationalInsuranceNumber + '\'' +
                ", genderDropdown='" + genderDropdown + '\'' +
                ", typeDropdown='" + typeDropdown + '\'' +
                ", organisationType='" + organisationType + '\'' +
                ", schemeToSearch='" + schemeToSearch + '\'' +
                '}';
    }
}

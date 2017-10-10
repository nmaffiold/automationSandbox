package Models.Data;

public class AgencyData {
    
    
    private String legalEntity = null;
    private String registrationType = null;
    private String agencyStartDate = null;
    private String agencyEndDate = null;
    private String agencyName = null;
    private String registrationNumber = null;
    private String agencyType = null;
    private SearchPolicyData searchPolicyData=null;



    public AgencyData(){

    }

    public AgencyData withLegalEntity(String legalEntity){
        this.setLegalEntity(legalEntity);
        return this;
    }
    public AgencyData withRegistrationType(String type){
        this.setRegistrationType(type);
        return this;
    }
    public AgencyData withAgencyStartDate (String date){
        this.setAgencyStartDate(date);
        return this;
    }
    public AgencyData withAgencyName (String name){
        this.setAgencyName(name);
        return this;
    }
    public AgencyData withRegistrationNumber(String number){
        this.setRegistrationNumber(number);
        return this;
    }
    public AgencyData withAgencyType(String type){
        this.setAgencyType(type);
        return this;
    }
    public AgencyData withSearchPolicyData(SearchPolicyData spdata){
        this.setSearchPolicyData(spdata);
        return this;
    }
    
    
    public String getLegalEntity() {
        return legalEntity;
    }

    public void setLegalEntity(String legalEntity) {
        this.legalEntity = legalEntity;
    }

    public String getRegistrationType() {
        return registrationType;
    }

    public void setRegistrationType(String registrationType) {
        this.registrationType = registrationType;
    }

    public String getAgencyStartDate() {
        return agencyStartDate;
    }

    public void setAgencyStartDate(String agencyStartDate) {
        this.agencyStartDate = agencyStartDate;
    }

    public String getAgencyEndDate() {
        return agencyEndDate;
    }

    public void setAgencyEndDate(String agencyEndDate) {
        this.agencyEndDate = agencyEndDate;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getAgencyType() {
        return agencyType;
    }

    public void setAgencyType(String agencyType) {
        this.agencyType = agencyType;
    }

    public SearchPolicyData getSearchPolicyData() {
        return searchPolicyData;
    }

    public void setSearchPolicyData(SearchPolicyData searchPolicyData) {
        this.searchPolicyData = searchPolicyData;
    }
}

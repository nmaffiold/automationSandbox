package Models.Data;

public class BusinessPartyDetailData {

    private String sanctionedEntity = null;
    private String dateOfLastSanctionScreening = null;
    private Boolean isGovernmentEntity = false;

    public BusinessPartyDetailData() {
    }

    public BusinessPartyDetailData withSanctionedEntity(String sanctionedEntity) {
        this.setSanctionedEntity(sanctionedEntity);
        return this;
    }

    public BusinessPartyDetailData withDateOfLastSanctionScreening(String date) {
        this.setDateOfLastSanctionScreening(date);
        return this;
    }

    public BusinessPartyDetailData isGovernmentEntity() {
        this.setIsGovernmentEntity(true);
        return this;
    }

    public String getSanctionedEntity() {
        return sanctionedEntity;
    }

    public void setSanctionedEntity(String sanctionedEntity) {
        this.sanctionedEntity = sanctionedEntity;
    }

    public String getDateOfLastSanctionScreening() {
        return dateOfLastSanctionScreening;
    }

    public void setDateOfLastSanctionScreening(String dateOfLastSanctionScreening) {
        this.dateOfLastSanctionScreening = dateOfLastSanctionScreening;
    }

    public Boolean getIsGovernmentEntity() {
        return isGovernmentEntity;
    }

    public void setIsGovernmentEntity(Boolean isGovernmentEntity) {
        this.isGovernmentEntity = isGovernmentEntity;
    }
}

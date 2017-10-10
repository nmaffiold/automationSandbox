package Models.Data;

public class AlterationData {

    private String alterationRequestDate = null;
    private Boolean thirdPartyAppointedRole = false;
    private String reasonForChange = null;


    public AlterationData() {
    }

    public AlterationData withAlterationRequestDate(String date) {
        this.setAlterationRequestDate(date);
        return this;
    }

    public AlterationData isThirdPartyAppointedRole() {
        this.setThirdPartyAppointedRole(true);
        return this;
    }

    public AlterationData withReasonForChange(String reason) {
        this.setReasonForChange(reason);
        return this;
    }

    public String getAlterationRequestDate() {
        return alterationRequestDate;
    }

    public void setAlterationRequestDate(String alterationRequestDate) {
        this.alterationRequestDate = alterationRequestDate;
    }

    public Boolean getThirdPartyAppointedRole() {
        return thirdPartyAppointedRole;
    }

    public void setThirdPartyAppointedRole(Boolean thirdPartyAppointedRole) {
        this.thirdPartyAppointedRole = thirdPartyAppointedRole;
    }

    public String getReasonForChange() {
        return reasonForChange;
    }

    public void setReasonForChange(String reasonForChange) {
        this.reasonForChange = reasonForChange;
    }
}

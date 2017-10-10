package Models.Data;

public class AgentData {

    private String notificationDate = null;
    private String lawType = null;
    private String attorneyType = null;
    private String courtName = null;
    private String controlOption = null;
    private String courtReference = null;
    private String signingOption = null;
    private String courtOrderDate = null;

    public AgentData() {
    }

    public AgentData withNotificationDate(String date) {
        this.setNotificationDate(date);
        return this;
    }

    public AgentData withLawType(String type) {
        this.setLawType(type);
        return this;
    }

    public AgentData withAttorneyType(String type) {
        this.setAttorneyType(type);
        return this;
    }

    public AgentData withCourtName(String name) {
        this.setCourtName(name);
        return this;
    }

    public AgentData withControlOption(String option) {
        this.setControlOption(option);
        return this;
    }

    public AgentData withCourtReference(String reference) {
        this.setCourtReference(reference);
        return this;
    }

    public AgentData withCourtOrderDate(String date) {
        this.setCourtOrderDate(date);
        return this;
    }

    public AgentData withSigningOption(String option) {
        this.setSigningOption(option);
        return this;
    }
    //Getters/Setters

    public String getNotificationDate() {
        return notificationDate;
    }

    public void setNotificationDate(String notificationDate) {
        this.notificationDate = notificationDate;
    }

    public String getLawType() {
        return lawType;
    }

    public void setLawType(String lawType) {
        this.lawType = lawType;
    }

    public String getAttorneyType() {
        return attorneyType;
    }

    public void setAttorneyType(String attorneyType) {
        this.attorneyType = attorneyType;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public String getControlOption() {
        return controlOption;
    }

    public void setControlOption(String controlOption) {
        this.controlOption = controlOption;
    }

    public String getCourtReference() {
        return courtReference;
    }

    public void setCourtReference(String courtReference) {
        this.courtReference = courtReference;
    }

    public String getCourtOrderDate() {
        return courtOrderDate;
    }

    public void setCourtOrderDate(String courtOrderDate) {
        this.courtOrderDate = courtOrderDate;
    }

    public String getSigningOption() {
        return signingOption;
    }

    public void setSigningOption(String signingOption) {
        this.signingOption = signingOption;
    }
}

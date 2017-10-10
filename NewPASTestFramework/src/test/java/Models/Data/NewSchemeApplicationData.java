package Models.Data;

public class NewSchemeApplicationData {

    private String requestDate = null;
    private String effectiveDate = null;
    private String commencementDate = null;

    public NewSchemeApplicationData() {

    }

    public NewSchemeApplicationData withRequestDate(String requestDate) {
        this.setRequestDate(requestDate);
        return this;
    }

    public NewSchemeApplicationData withEffectiveDate(String effectiveDate) {
        this.setEffectiveDate(effectiveDate);
        return this;
    }

    public NewSchemeApplicationData withCommencementDate(String commencementDate) {
        this.setCommencementDate(commencementDate);
        return this;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getCommencementDate() {
        return commencementDate;
    }

    public void setCommencementDate(String commencementDate) {
        this.commencementDate = commencementDate;
    }

}

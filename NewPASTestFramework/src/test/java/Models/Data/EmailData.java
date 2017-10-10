package Models.Data;

public class EmailData {

    private String emailType = null;
    private String emailAddress = null;
    private String preferred = null;
    private String startDate = null;
    private String endDate = null;
    private String remarks = null;

    public EmailData() {
    }

    public EmailData withEmailType(String type) {
        this.setEmailType(type);
        return this;
    }

    public EmailData withEmailAddress(String address) {
        this.setEmailAddress(address);
        return this;
    }

    public EmailData withPreferred(String type) {
        this.setPreferred(type);
        return this;
    }

    public EmailData withStartDate(String date) {
        this.setStartDate(date);
        return this;
    }

    public EmailData withEndDate(String date) {
        this.setEndDate(date);
        return this;
    }

    public EmailData withRemarks(String type) {
        this.setRemarks(type);
        return this;
    }

    public String getEmailType() {
        return emailType;
    }

    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPreferred() {
        return preferred;
    }

    public void setPreferred(String preferred) {
        this.preferred = preferred;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}

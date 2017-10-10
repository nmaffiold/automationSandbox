package Models.Data;

public class TelephoneData {

    private String type = null;
    private String telephoneType = null;
    private String IDC = null;
    private String areaCode = null;
    private String faxTelephoneNumber = null;
    private String extensionNumber = null;
    private String preferred = null;
    private String telephoneFeature = null;
    private String startDate = null;
    private String endDate = null;
    private String remarks = null;

    public TelephoneData() {
    }

    public TelephoneData withType(String type) {
        this.setType(type);
        return this;
    }

    public TelephoneData withTelephoneType(String type) {
        this.setTelephoneType(type);
        return this;
    }

    public TelephoneData withIDC(String IDC) {
        this.setIDC(IDC);
        return this;
    }

    public TelephoneData withAreaCode(String code) {
        this.setAreaCode(code);
        return this;
    }

    public TelephoneData withFaxTelephoneNumber(String number) {
        this.setFaxTelephoneNumber(number);
        return this;
    }


    public TelephoneData withExtensionNumber(String number) {
        this.setExtensionNumber(number);
        return this;
    }

    public TelephoneData withPreferred(String preferred) {
        this.setPreferred(preferred);
        return this;
    }


    public TelephoneData withTelephoneFeature(String feature) {
        this.setTelephoneFeature(feature);
        return this;
    }

    public TelephoneData withStartDate(String date) {
        this.setStartDate(date);
        return this;
    }

    public TelephoneData withEndDate(String date) {
        this.setEndDate(date);
        return this;
    }

    public TelephoneData withRemarks(String remarks) {
        this.setRemarks(remarks);
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTelephoneType() {
        return telephoneType;
    }

    public void setTelephoneType(String telephoneType) {
        this.telephoneType = telephoneType;
    }

    public String getIDC() {
        return IDC;
    }

    public void setIDC(String IDC) {
        this.IDC = IDC;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getFaxTelephoneNumber() {
        return faxTelephoneNumber;
    }

    public void setFaxTelephoneNumber(String faxTelephoneNumber) {
        this.faxTelephoneNumber = faxTelephoneNumber;
    }

    public String getExtensionNumber() {
        return extensionNumber;
    }

    public void setExtensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
    }

    public String getPreferred() {
        return preferred;
    }

    public void setPreferred(String preferred) {
        this.preferred = preferred;
    }

    public String getTelephoneFeature() {
        return telephoneFeature;
    }

    public void setTelephoneFeature(String telephoneFeature) {
        this.telephoneFeature = telephoneFeature;
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

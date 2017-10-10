package Models.Data;

public class DirectPaymentData {

    //Search Parameters
    private SearchPolicyData searchPolicyData= null;


    private String payerName = null;
    private String LEBSB = null;
    private String LEBankAccountNumber = null;
    private String LEBankName = null;
    private String collectOn = null;
    private String collectOnDate = null;
    private String startDate = null;
    private String expiryDate = null;
    private String collectionFrequency = null;
    private String subType = null;
    private String action = null;
    private String currency = null;

    public DirectPaymentData() {

    }

    public DirectPaymentData withPayerName(String payerName) {
        this.setPayerName(payerName);
        return this;
    }

    public DirectPaymentData withLEBSB(String lebsb) {
        this.setLEBSB(lebsb);
        return this;
    }

    public DirectPaymentData withLEBankAccountNumber(String bankAccountNumber) {
        this.setLEBankAccountNumber(bankAccountNumber);
        return this;
    }
    public DirectPaymentData withLEBankName(String bankName) {
        this.setLEBankName(bankName);
        return this;
    }

    public DirectPaymentData withCollectOn(String collectOn) {
        this.setCollectOn(collectOn);
        return this;
    }

    public DirectPaymentData withCollectOnDate(String date) {
        this.setCollectOnDate(date);
        return this;
    }

    public DirectPaymentData withStartDate(String date) {
        this.setStartDate(date);
        return this;
    }

    public DirectPaymentData withExpiryDate(String date) {
        this.setExpiryDate(date);
        return this;
    }

    public DirectPaymentData withSubType(String type) {
        this.setSubType(type);
        return this;
    }

    public DirectPaymentData withCollectionFrequency(String frequency) {
        this.setCollectionFrequency(frequency);
        return this;
    }

    public DirectPaymentData withCurrency(String currency) {
        this.setCurrency(currency);
        return this;
    }

    public DirectPaymentData withActions(String action) {
        this.setAction(action);
        return this;
    }

    public DirectPaymentData withSearchPolicy(SearchPolicyData data){
        this.setSearchPolicyData(data);
        return this;
    }

    public SearchPolicyData getSearchPolicyData() {
        return searchPolicyData;
    }

    public void setSearchPolicyData(SearchPolicyData searchPolicyData) {
        this.searchPolicyData = searchPolicyData;
    }


    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getLEBSB() {
        return LEBSB;
    }

    public void setLEBSB(String LEBSB) {
        this.LEBSB = LEBSB;
    }

    public String getLEBankAccountNumber() {
        return LEBankAccountNumber;
    }

    public void setLEBankAccountNumber(String LEBankAccountNumber) {
        this.LEBankAccountNumber = LEBankAccountNumber;
    }

    public String getLEBankName() {
        return LEBankName;
    }

    public void setLEBankName(String LEBankName) {
        this.LEBankName = LEBankName;
    }

    public String getCollectOn() {
        return collectOn;
    }

    public void setCollectOn(String collectOn) {
        this.collectOn = collectOn;
    }

    public String getCollectOnDate() {
        return collectOnDate;
    }

    public void setCollectOnDate(String collectOndate) {
        this.collectOnDate = collectOndate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCollectionFrequency() {
        return collectionFrequency;
    }

    public void setCollectionFrequency(String collectionFrequency) {
        this.collectionFrequency = collectionFrequency;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}

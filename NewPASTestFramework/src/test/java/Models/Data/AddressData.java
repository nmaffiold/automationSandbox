package Models.Data;

public class AddressData {

    private String postCode = null;
    private String addressStatus = null;
    private String houseNumber = null;
    private String addressType = null;
    private String houseName = null;
    private String preferredAddress = null;
    private String street = null;
    private String COAConfirmation = null;
    private String district = null;
    private String startDate = null;
    private String endDate = null;
    private String townCitySuburb = null;
    private String state = null;
    private String country = null;

    public AddressData() {
    }

    public AddressData withPostCode(String postCode) {
        this.setPostCode(postCode);
        return this;
    }

    public AddressData withAddressStatus(String addressStatus) {
        this.setAddressStatus(addressStatus);
        return this;
    }

    public AddressData withHouseNumber(String houseNumber) {
        this.setHouseNumber(houseNumber);
        return this;
    }

    public AddressData withAddressType(String addressType) {
        this.setAddressType(addressType);
        return this;
    }

    public AddressData withHouseName(String houseName) {
        this.setHouseName(houseName);
        return this;
    }

    public AddressData withPreferredAddress(String preferredAddress) {
        this.setPreferredAddress(preferredAddress);
        return this;
    }

    public AddressData withStreet(String street) {
        this.setStreet(street);
        return this;
    }

    public AddressData withCOAConfirmation(String COAConfirmation) {
        this.setCOAConfirmation(COAConfirmation);
        return this;
    }

    public AddressData withDistrict(String district) {
        this.setDistrict(district);
        return this;
    }

    public AddressData withStartDate(String startDate) {
        this.setStartDate(startDate);
        return this;
    }

    public AddressData withEndDate(String endDate) {
        this.setEndDate(endDate);
        return this;
    }

    public AddressData withTownCitySuburb(String townCitySuburb) {
        this.setTownCitySuburb(townCitySuburb);
        return this;
    }

    public AddressData withState(String state) {
        this.setState(state);
        return this;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getAddressStatus() {
        return addressStatus;
    }

    public void setAddressStatus(String addressStatus) {
        this.addressStatus = addressStatus;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getPreferredAddress() {
        return preferredAddress;
    }

    public void setPreferredAddress(String preferredAddress) {
        this.preferredAddress = preferredAddress;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCOAConfirmation() {
        return COAConfirmation;
    }

    public void setCOAConfirmation(String COAConfirmation) {
        this.COAConfirmation = COAConfirmation;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
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

    public String getTownCitySuburb() {
        return townCitySuburb;
    }

    public void setTownCitySuburb(String townCitySuburb) {
        this.townCitySuburb = townCitySuburb;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

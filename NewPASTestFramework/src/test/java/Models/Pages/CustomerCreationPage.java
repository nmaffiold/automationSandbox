package Models.Pages;

import Models.Data.CustomerCreationData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomerCreationPage extends BasePage {

    @FindBy(css = "#createParty\\3a createParty_partyTypeId")
    @CacheLookup
    public WebElement customerType;

    @FindBy(css = "#createParty\\3a createParty_titleId")
    @CacheLookup
    public WebElement title;

    @FindBy(css = "#createParty\\3a createParty_firstNameId")
    @CacheLookup
    public WebElement firstName;

    @FindBy(css = "#createParty\\3a createParty_secondNameId")
    @CacheLookup
    public WebElement secondName;

    @FindBy(css = "#createParty\\3a createParty_otherInitialsId")
    @CacheLookup
    public WebElement otherInitials;

    @FindBy(css = "#createParty\\3a createParty_surnameId")
    @CacheLookup
    public WebElement surname;

    @FindBy(css = "#createParty\\3a createParty_dateOfBirthId")
    @CacheLookup
    public WebElement dateOfBirth;

    @FindBy(css = "#createParty\\3a createParty_niNumberId")
    @CacheLookup
    public WebElement NINumber;

    @FindBy(css = "#createParty\\3a createParty_maritalStatusId")
    @CacheLookup
    public WebElement maritalStatus;

    @FindBy(css = "#createParty\\3a createParty_genderId")
    @CacheLookup
    public WebElement gender;

    @FindBy(css = "#createParty\\3a createParty_companyIdentifierId")
    @CacheLookup
    public WebElement companyIdentifier;

    @FindBy(css = "#createParty\\3a createParty_previousNameTxtId")
    @CacheLookup
    public WebElement previousName;

    @FindBy(css = "#createParty\\3a createParty_preferredNameTxtId")
    @CacheLookup
    public WebElement preferredName;

    @FindBy(css = "#createParty\\3a createParty_goneAwayRiskIndicatorCmbId")
    @CacheLookup
    public WebElement goneAwayRiskIndicator;

    @FindBy(css = "#createParty\\3a createParty_smokerStatusId")
    @CacheLookup
    public WebElement smokerStatus;

    @FindBy(css = "#createParty\\3a createParty_preferredMethodOfCommCmbId")
    @CacheLookup
    public WebElement preferredMethodOfCommunication;

    @FindBy(css = "#createParty\\3a createParty_webSiteAddressTextId")
    @CacheLookup
    public WebElement websiteAddress;

    @FindBy(css = "#createParty\\3a createParty_bonusStatementPreferenceCmbId")
    @CacheLookup
    public WebElement bonusStatementPreference;

    @FindBy(css = "#createParty\\3a createParty_decorationId")
    @CacheLookup
    public WebElement decoration;

    @FindBy(css = "#createParty\\3a createParty_investorStatusCmbId")
    @CacheLookup
    public WebElement investorStatus;

    @FindBy(xpath = "//td[.='Sanctioned Entity']//following::select[1]")
    @CacheLookup
    public WebElement sanctionedEntity;

    @FindBy(css = "#createParty\\3a createParty_sanctionScreeningDateId")
    @CacheLookup
    public WebElement dateOfLastSanctionScreening;

    @FindBy(css = "#createParty\\3a createParty_governmentEntityIndId")
    @CacheLookup
    public WebElement isGovernmentEntity;

    @FindBy(css = "#createParty\\3a createParty_occupationId")
    @CacheLookup
    public WebElement occupation;

    @FindBy(css = "#createParty\\3a createParty_employmentStatusId")
    @CacheLookup
    public WebElement employmentStatus;

    @FindBy(css = "#createParty\\3a createParty_grossYearlySalaryId")
    @CacheLookup
    public WebElement totalGrossYearlySalary;

    @FindBy(css = "#createParty\\3a createParty_netMonthlyIncomeId")
    @CacheLookup
    public WebElement totalNetMonthlyIncome;

    @FindBy(css = "#createParty\\3a createParty_currencyCodeId")
    @CacheLookup
    public WebElement incomeCurrency;

    @FindBy(css = "#createParty\\3a createParty_taxThresholdAmountId")
    @CacheLookup
    public WebElement taxThresholdAmount;

    @FindBy(css = "#createParty\\3a createParty_taxThresholdCurrencyId")
    @CacheLookup
    public WebElement taxThresholdCurrency;

    @FindBy(css = "#createParty\\3a createParty_suppressAllContactsId")
    @CacheLookup
    public WebElement suppressAllContacts;

    @FindBy(css = "#createParty\\3a createParty_suppressPhoneId")
    @CacheLookup
    public WebElement suppressPhone;

    @FindBy(css = "#createParty\\3a createParty_suppressFaxId")
    @CacheLookup
    public WebElement suppressFax;

    @FindBy(css = "#createParty\\3a createParty_suppressLetterId")
    @CacheLookup
    public WebElement suppressLetter;

    @FindBy(css = "#createParty\\3a createParty_suppressEmailId")
    @CacheLookup
    public WebElement suppressEmail;

    @FindBy(css = "#createParty\\3a createParty_suppressFaceToFaceId")
    @CacheLookup
    public WebElement suppressFaceToFace;

    @FindBy(css = "#createParty\\3a createParty_saveId")
    @CacheLookup
    public WebElement submitButton;

    @FindBy(css = "#partyContactDetail\\3a partyContactDetail_addAddressId")
    @CacheLookup
    public WebElement addAddress;

    @FindBy(css = "#partyContactDetail\\3a partyContactDetail_addTelephoneId")
    @CacheLookup
    public WebElement addTelephone;

    @FindBy(css = "#partyContactDetail\\3a partyContactDetail_addemailId")
    @CacheLookup
    public WebElement addEmail;

    @FindBy(css = "#createParty\\3a createParty_partyNoId")
    public WebElement customerID;

    @FindBy(css = "#miscellaneousSupplementaryDetails\\3a miscellaneousSupplementaryDetails_saveId")
    @CacheLookup
    public WebElement saveButton;

    @FindBy(css = "#partyContactDetail\\3a partyContactAddresstableId\\3a 0\\3a partyContactDetail_addressDetailId")
    public WebElement addressDetail;

    public CustomerCreationPage(WebDriver driver, CustomerCreationData data) {
        super(driver);
        refreshFrame();

        if (data.getCustomerType() != null) {
            this.setCustomerType(data.getCustomerType());
        }

        if (data.getGender() != null) {
            this.setGender(data.getGender());
        }

        if (data.getCompanyIdentifier() != null) {
            this.setCompanyIdentifier(data.getCompanyIdentifier());
        }

        if (data.getGoneAwayRiskIndicator() != null) {
            this.setGoneAwayRiskIndicator(data.getGoneAwayRiskIndicator());
        }

        if (data.getSmokerStatus() != null) {
            this.setSmokerStatus(data.getSmokerStatus());
        }

        if (data.getPreferredMethodOfCommunication() != null) {
            this.setPreferredMethodOfCommunication(data.getPreferredMethodOfCommunication());
        }

        if (data.getBonusStatementPreference() != null) {
            this.setBonusStatementPreference(data.getBonusStatementPreference());
        }

        if (data.getSanctionedEntity() != null) {
            this.setSanctionedEntity(data.getSanctionedEntity());
        }

        if (data.getEmploymentStatus() != null) {
            this.setEmploymentStatus(data.getEmploymentStatus());
        }

        if (data.getIncomeCurrency() != null) {
            this.setIncomeCurrency(data.getIncomeCurrency());
        }

        if (data.getTaxThresholdCurrency() != null) {
            this.setTaxThresholdCurrency(data.getTaxThresholdCurrency());
        }

        if (data.getTitle() != null) {
            this.setTitle(data.getTitle());
        }

        if (data.getFirstName() != null) {
            this.setFirstName(data.getFirstName());
        }

        if (data.getSecondName() != null) {
            this.setSecondName(data.getSecondName());
        }

        if (data.getOtherInitials() != null) {
            this.setOtherInitials(data.getOtherInitials());
        }

        if (data.getSurname() != null) {
            this.setSurname(data.getSurname());
        }

        if (data.getDateOfBirth() != null) {
            this.setDateOfBirth(data.getDateOfBirth());
        }

        if (data.getNINumber() != null) {
            this.setNINumber(data.getNINumber());
        }

        if (data.getMaritalStatus() != null) {
            this.setMaritalStatus(data.getMaritalStatus());
        }

        if (data.getPreviousName() != null) {
            this.setPreviousName(data.getPreviousName());
        }

        if (data.getPreferredName() != null) {
            this.setPreferredName(data.getPreferredName());
        }

        if (data.getWebsiteAddress() != null) {
            this.setWebsiteAddress(data.getWebsiteAddress());
        }

        if (data.getDecoration() != null) {
            this.setDecoration(data.getDecoration());
        }

        if (data.getDateOfLastSanctionsScreening() != null) {
            this.setDateOfLastSanctionScreening(data.getDateOfLastSanctionsScreening());
        }

        if (data.getGovernmentEntity()) {
            this.setIsGovernmentEntity();
        }

        if (data.getOccupation() != null) {
            this.setOccupation(data.getOccupation());
        }

        if (data.getTotalGrossYearlySalary() != null) {
            this.setTotalGrossYearlySalary(data.getTotalGrossYearlySalary());
        }

        if (data.getTotalNetMonthlyIncome() != null) {
            this.setTotalNetMonthlyIncome(data.getTotalNetMonthlyIncome());
        }

        if (data.getTaxThresholdAmount() != null) {
            this.setTaxThresholdAmount(data.getTaxThresholdAmount());
        }
    }

    /**
     * refresh the default frame of the current page
     */
    public void refreshFrame() {
        switchWindow();
        switchToFrame("botFr");
    }

    /**
     * switch to the party contact frame
     */
    public void refreshFramePartyContact() {
        this.switchToFrame("botFr");
        this.switchToFrameByIndex(0);

    }

    public void setCustomerType(String option) {
        this.selectFromDropdown(customerType, option);
    }

    public void setGender(String option) {
        this.selectFromDropdown(gender, option);
    }

    public void setCompanyIdentifier(String option) {
        this.selectFromDropdown(companyIdentifier, option);
    }

    public void setGoneAwayRiskIndicator(String option) {
        this.selectFromDropdown(goneAwayRiskIndicator, option);
    }

    public void setSmokerStatus(String option) {
        this.selectFromDropdown(smokerStatus, option);
    }

    public void setPreferredMethodOfCommunication(String option) {
        this.selectFromDropdown(preferredMethodOfCommunication, option);
    }

    public void setBonusStatementPreference(String option) {
        this.selectFromDropdown(bonusStatementPreference, option);
    }

    public void setSanctionedEntity(String option) {
        this.selectFromDropdown(sanctionedEntity, option);
    }

    public void setEmploymentStatus(String option) {
        this.selectFromDropdown(employmentStatus, option);
    }

    public void setIncomeCurrency(String option) {
        this.selectFromDropdown(incomeCurrency, option);
    }

    public void setTaxThresholdCurrency(String option) {
        this.selectFromDropdown(taxThresholdAmount, option);
    }

    public void setTitle(String title) {
        this.title.sendKeys(title);
    }

    public void setFirstName(String name) {
        this.firstName.sendKeys(name);
    }

    public void setSecondName(String secondName) {
        this.secondName.sendKeys(secondName);
    }

    public void setOtherInitials(String initials) {
        this.otherInitials.sendKeys(initials);
    }

    public void setSurname(String surname) {
        this.surname.sendKeys(surname);
    }

    public void setDateOfBirth(String date) {
        this.dateOfBirth.sendKeys(date);
    }

    public void setNINumber(String number) {
        this.NINumber.sendKeys(number);
    }

    public void setMaritalStatus(String status) {
        this.maritalStatus.sendKeys(status);
    }

    public void setPreviousName(String name) {
        this.previousName.sendKeys(name);
    }

    public void setPreferredName(String name) {
        this.preferredName.sendKeys(name);
    }

    public void setWebsiteAddress(String address) {
        this.websiteAddress.sendKeys(address);
    }

    public void setDecoration(String decoration) {
        this.decoration.sendKeys(decoration);
    }

    public void setDateOfLastSanctionScreening(String date) {
        this.dateOfLastSanctionScreening.sendKeys(date);
    }

    public void setOccupation(String occupation) {
        this.occupation.sendKeys(occupation);
    }

    public void setTotalGrossYearlySalary(String salary) {
        this.totalGrossYearlySalary.sendKeys(salary);
    }

    public void setTotalNetMonthlyIncome(String income) {
        this.totalNetMonthlyIncome.sendKeys(income);
    }

    public void setTaxThresholdAmount(String amount) {
        this.taxThresholdAmount.sendKeys(amount);
    }

    public void setIsGovernmentEntity() {
        this.isGovernmentEntity.click();
    }

    public void clickSubmit() {
        this.submitButton.click();
    }

    public void clickAddAddress() {
        refreshFramePartyContact();
        this.addAddress.click();
    }

    public void clickAddTelephone() {
        refreshFramePartyContact();
        this.addTelephone.click();
    }

    public void clickAddEmail() {
        refreshFramePartyContact();
        this.addEmail.click();
    }

    public String getCustomerID() {
        return this.customerID.getAttribute("value");
    }

    public void returnToDefaultPage() {
        waitForWindowAndSwitch();
    }

    public void clickSave() {
        this.saveButton.click();
    }

    public String retrieveAddress() {
        return this.addressDetail.getAttribute("value");
    }
}

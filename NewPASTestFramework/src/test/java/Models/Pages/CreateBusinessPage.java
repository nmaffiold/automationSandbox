package Models.Pages;

import Models.Data.BusinessPartyDetailData;
import Models.Data.CreateCustomerData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class CreateBusinessPage extends BasePage {

    @FindBy(css = "#createParty\\3a createParty_partyTypeId")
    @CacheLookup
    public WebElement customerType;

    @FindBy(css = "#createParty\\3a createParty_organisationTypeId")
    @CacheLookup
    public WebElement organisationType;

    @FindBy(css = "#createParty\\3a createParty_nameOfBusinessId")
    @CacheLookup
    public WebElement nameOfBusiness;

    @FindBy(css = "#createParty\\3a createParty_contactNameId")
    @CacheLookup
    public WebElement contactName;

    @FindBy(css = "#createParty\\3a createParty_natureOfBusinessId")
    @CacheLookup
    public WebElement natureOfBusiness;

    @FindBy(css = "#createParty\\3a createParty_taxReferenceNumberId")
    @CacheLookup
    public WebElement taxReferenceNumber;

    @FindBy(css = "#createParty\\3a createParty_taxDistrictId")
    @CacheLookup
    public WebElement taxDistrict;

    @FindBy(css = "#createParty\\3a createParty_preferredMethodOfCommCmbId")
    @CacheLookup
    public WebElement preferredMethodOfCommunicationDropdown;

    @FindBy(id = "createParty:createParty_companyIdentifierId")
    @CacheLookup
    public WebElement companyIdentifierDropdown;

    @FindBy(css = "#createParty\\3a createParty_companyIdentifierId")
    @CacheLookup
    public WebElement websiteAddress;

    @FindBy(css = "#createParty\\3a createParty_investorStatusCmbId")
    @CacheLookup
    public WebElement investorStatus;

    @FindBy(css = "#createParty\\3a createParty_sanctionedEntityCmbId")
    @CacheLookup
    public WebElement sanctionedEntity;

    @FindBy(css = "#createParty\\3a createParty_sanctionScreeningDateId")
    @CacheLookup
    public WebElement dateOfLastSanctionsScreening;

    @FindBy(css = "#createParty\\3a createParty_governmentEntityIndId")
    @CacheLookup
    public WebElement isGovernmentEntity;

    @FindBy(css = "#createParty\\3a createParty_saveId")
    @CacheLookup
    public WebElement submitButton;

    @FindBy(css = "#partyContactDetail\\3a partyContactDetail_addAddressId")
    @CacheLookup
    public WebElement addAddress;

    @FindBy(css = "#miscellaneousSupplementaryDetails\\3a miscellaneousSupplementaryDetails_saveId")
    @CacheLookup
    public WebElement saveButton;

    @FindBy(css = "#createParty\\3a createParty_activateId")
    public WebElement activateButton;

    @FindBy(css = "#createParty\\3a createParty_addSanctionedListId")
    public WebElement addSanctionedEntityList;

    @FindBy(css = "#createParty\\3a createParty_partyNoId")
    public WebElement customerNumber;

    @FindBy(css = "#miscellaneousSupplementaryDetails\\3a miscellaneousSupplementaryDetails_abnStatusComboId")
    public WebElement ABNStatus;

    @FindBy(css = "#miscellaneousSupplementaryDetails\\3a miscellaneousSupplementaryDetails_australianBusNumberId")
    public WebElement australianBusinessNumber;

    public CreateBusinessPage(WebDriver driver, CreateCustomerData data) {
        super(driver);

        this.driver.switchTo().defaultContent();
        switchWindow();
        this.switchToFrame("botFr");

        if (data.getCustomerType() != null) {
            this.selectCustomerTypeFromDropdown(data.getCustomerType());
        }

        if (data.getOrganisationType() != null) {
            this.selectOrganisationType(data.getOrganisationType());
        }

        if (data.getNameOfBusiness() != null) {
            this.setNameOfBusiness(data.getNameOfBusiness());
        }

        if (data.getContactName() != null) {
            this.setContactName(data.getContactName());
        }

        if (data.getNatureOfBusiness() != null) {
            this.setNatureOfBusiness(data.getNatureOfBusiness());
        }

        if (data.getTaxReferenceNumber() != null) {
            this.setTaxReferenceNumber(data.getTaxReferenceNumber());
        }
        if (data.getTaxDistrict() != null) {
            this.setTaxDistrict(data.getTaxDistrict());
        }

        if (data.getPreferredMethodOfCommunication() != null) {
            this.selectPreferredMethodOfCommunicationDropdown(data.getPreferredMethodOfCommunication());
        }

        if (data.getCompanyIdentifier() != null) {
            this.selectCompanyIdentifierFromDropdown(data.getCompanyIdentifier());
        }

        if (data.getWebsiteAddress() != null) {
            this.setWebsiteAddress(data.getWebsiteAddress());
        }

        if (data.getSanctionedEntity() != null) {
            this.selectSanctionedEntityFromDropdown(data.getSanctionedEntity());
        }

        if (data.getDateOfLastSanctionsScreening() != null) {
            this.setDateOfLastSanctionsScreening(data.getDateOfLastSanctionsScreening());
        }

        if (data.getIsGovernmentEntity()) {
            this.setIsGovernmentEntity();
        }
    }

    /**
     * refresh the default frame of the current page
     */
    public void refreshFrame() {
        if (!this.isThisFrame("botFr")) {
            switchWindow();
            this.switchToFrame("botFr");
        }
    }

    /**
     * switch to the party contact frame
     */
    public void refreshFramePartyContact() {
        if (!this.isThisFrame("createPartyContact")) {
            switchWindow();
            ArrayList<String> path = new ArrayList<>();
            path.add("botFr");
            path.add("createPartyContact");
            this.switchToFrame(path);
        }
    }

    /**
     * switch to the party contact frame
     */
    public void refreshFramePartyTax() {
        this.switchToFrame("botFr");
        this.switchToFrameByIndex(1);

    }

    public void clickSubmitButton() {
        this.submitButton.click();
    }

    public void selectCustomerTypeFromDropdown(String option) {
        this.selectFromDropdown(customerType, option);
    }

    public void selectOrganisationType(String option) {
        this.selectFromDropdown(organisationType, option);
    }

    public void setNameOfBusiness(String name) {
        this.nameOfBusiness.sendKeys(name);
    }

    public void setContactName(String name) {
        this.contactName.sendKeys(name);
    }

    public void setNatureOfBusiness(String nature) {
        this.natureOfBusiness.sendKeys(nature);
    }

    public void setTaxReferenceNumber(String taxNumber) {
        this.taxReferenceNumber.sendKeys(taxNumber);
    }

    public void setTaxDistrict(String district) {
        this.taxDistrict.sendKeys(district);
    }

    public void selectPreferredMethodOfCommunicationDropdown(String option) {
        this.selectFromDropdown(preferredMethodOfCommunicationDropdown, option);
    }

    public void selectCompanyIdentifierFromDropdown(String option) {
        this.selectFromDropdown(companyIdentifierDropdown, option);
    }

    public void setWebsiteAddress(String address) {
        this.websiteAddress.sendKeys(address);
    }

    public void setInvestorStatus(String status) {
        this.selectFromDropdown(investorStatus, status);
    }

    public void selectSanctionedEntityFromDropdown(String option) {
        this.selectFromDropdown(sanctionedEntity, option);
    }

    public void setDateOfLastSanctionsScreening(String date) {
        this.dateOfLastSanctionsScreening.sendKeys(date);
    }

    public void setIsGovernmentEntity() {
        this.dateOfLastSanctionsScreening.click();
    }

    public void clickSave() {
        this.saveButton.click();
    }

    public void clickActivate() {
        waitForWindowAndSwitch();
        this.activateButton.click();
    }

    public String getCustomerNumber() {
        return this.customerNumber.getAttribute("value");
    }

    public void clickAddSanctionedEntityList() {
        this.addSanctionedEntityList.click();
    }

    public void clickAddAddress() {
        this.refreshFramePartyContact();
        this.addAddress.click();
    }

    public void setABNEmpty() {
        refreshFramePartyTax();
        this.australianBusinessNumber.clear();
        refreshFrame();
    }

    public String getValueFromABN() {
        return this.getSelectedFromDropdown(ABNStatus);
    }
}


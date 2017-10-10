package Models.Pages;

import Models.Data.AlterationData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class AlterationPage extends BasePage {

    @FindBy(css = "#partyAlterationDetails\\3a partyAlterationDetailsTabletableId\\3a 6\\3a partyAlterationDetails_effectiveChangeDateTxtIdBut")
    public WebElement effectiveDate;

    @FindBy(css = "#partyAlterationDetails\\3a partyAlterationDetailsTabletableId\\3a 6\\3a partyAlterationDetails_toBeChangedChkId")
    public WebElement thirdPartyAppointedRole;

    @FindBy(xpath = "//*[.='1']")
    public WebElement firstDayDate;

    @FindBy(css = "#partyAlterationDetails\\3a partyAlterationDetails_saveId")
    @CacheLookup
    public WebElement saveButton;

    @FindBy(xpath = "//a[contains(text(),'Appointed Roles')]")
    public WebElement appointedRoles;

    @FindBy(xpath = "//a[contains(text(),'Add New Role')]")
    @CacheLookup
    public WebElement addNewRole;

    @FindBy(css = "#newAppointedRolesParent\\3a newAppointedRolesParent_roleTypeCmbId")
    @CacheLookup
    public WebElement roleList;

    @FindBy(css = "#newAppointedRolesParent\\3a newAppointedRolesParent_proceedId")
    @CacheLookup
    public WebElement proceedButton;

    @FindBy(xpath = "//a[contains(text(),'Correspondence')]")
    public WebElement correspondence;

    @FindBy(xpath = "//a[contains(text(),'Party Detail')]")
    public WebElement partyDetail;

    @FindBy(xpath = "//a[contains(text(),'Requirement')]")
    public WebElement requirement;

    @FindBy(xpath = "//a[contains(text(),'Request Evidence')]")
    public WebElement requestEvidence;

    @FindBy(css = "#partyAppointedRolesView\\3a partyAppointedRolesView_submitId")
    public WebElement submitButton;

    @FindBy(xpath = "//input[@value='OK']")
    public WebElement confirmExternalPending;

    @FindBy(css = "#partyAlterationDetails\\3a partyAlterationDetailsTabletableId\\3a 3\\3a partyAlterationDetails_toBeChangedChkId")
    public WebElement smokerStatusCheckbox;

    @FindBy(css = "#partyPersonalDetail\\3a partyPersonalDetail_smokerStatusId")
    public WebElement smokerStatus;

    @FindBy(css = "#organizationalCustomerDetail\\3a organizationalCustomerDetail_submitId")
    public WebElement organisationCustomerSubmitButton;

    @FindBy(css = "#partyPersonalDetail\\3a partyPersonalDetail_submitId")
    public WebElement partyDetailSubmitButton;

    @FindBy(css = "#partyAlterationDetails\\3a partyAlterationDetails_alterationNumberTxtId")
    public WebElement partyAlterationNumber;

    @FindBy(xpath = "//*[contains(@class, 'headerOfSection')][1]")
    public WebElement alterationHeading;

    @FindBy(css = "#partyAlterationDetails\\3a partyAlterationDetails_alterationRequestDateTxtId")
    public WebElement recordedDate;

    @FindBy(css = "#partyAlterationDetails\\3a partyAlterationDetailsTabletableId\\3a 6\\3a partyAlterationDetails_typeOfChangeTxtId")
    public WebElement thirdPartyAppointedRoleText;

    @FindBy(xpath = "//span[contains(text(), 'Role Type')]")
    public WebElement roleTypeText;

    @FindBy(css = "#partyAlterationDetails\\3a partyAlterationDetailsTabletableId\\3a 1\\3a partyAlterationDetails_toBeChangedChkId")
    public WebElement otherTypeOfChange;

    @FindBy(css = "#organizationalCustomerDetail\\3a organizationalCustomerDetail_preferredMethodOfCommCmbId")
    public WebElement preferredMethodOfCommunication;

    @FindBy(css = "#partyAlterationDetails\\3a partyAlterationDetails_alterationStatusTxtId")
    public WebElement alterationStatus;

    public AlterationPage(WebDriver driver, AlterationData data) {
        super(driver);
        refreshFrame();
    }

    /**
     * refresh the default frame of the current page
     */
    public void refreshFrame() {
        switchWindow();
        switchToFrame("botFr");
    }

    public void refreshFramePersonalDetail() {
        switchWindow();
        ArrayList<String> framePath = new ArrayList<>();
        framePath.add("botFr");
        framePath.add("partyPersonalDetailFrame");
        this.switchToFrame(framePath);
    }

    public void refreshFrameBusinessDetail() {
        switchWindow();
        ArrayList<String> framePath = new ArrayList<>();
        framePath.add("botFr");
        framePath.add("orgCustomerDetailFrame");
        this.switchToFrame(framePath);
    }



    /**
     * apply the third party role item to an individual user
     */
    public void setThirdPartyAppointedRole() {
        this.waitForElement(thirdPartyAppointedRole).click();
        this.waitForElement(effectiveDate).click();
        switchWindow();
        this.scrollIntoView(firstDayDate);
        this.waitForElement(firstDayDate).click();
        refreshFrame();
    }

    public void changeAppointedRoles() {
        switchToFrame("topFr");
        this.appointedRoles.click();
        this.addNewRole.click();
        switchToFrame("botFr");
    }

    /**
     * initiate the process for adding a role to a party
     *
     * @param role the role to add to the user
     */
    public void addNewRole(String role) {
        this.selectFromDropdown(roleList, role);
        this.proceedButton.click();
    }

    public void clickSave() {
        this.saveButton.click();
    }

    /**
     * navigate through the menus to the evidence request page of alteration
     */
    public void navigateToRequestEvidence() {
        switchToFrame("topFr");
        this.correspondence.click();
        this.requirement.click();
        this.requestEvidence.click();
        switchToFrame("botFr");
    }

    /**
     * finalise and submit alteration request details
     */
    public void submitAlteration() {
        switchWindow();
        switchToFrame("topFr");
        this.waitForElement(appointedRoles).click();
        switchToFrame("botFr");
        this.waitForElement(submitButton).click();
        waitForWindowAndSwitch();
    }

    public String getPartyAlterationNumber() {
        return this.partyAlterationNumber.getAttribute("value");
    }

    public String verifySmokerStatus() {
        switchToFrame("topFr");
        partyDetail.click();
        refreshFramePersonalDetail();
        return getSelectedFromDropdown(waitForElement(smokerStatus));
    }

    public String initiateSmokerStatusAlterationRequest() {
        this.smokerStatusCheckbox.click();
        this.saveButton.click();
        return getPartyAlterationNumber();
    }

    public void initiateOtherAlterationRequest() {
        this.otherTypeOfChange.click();
        this.saveButton.click();
    }

    public String retrieveRecordedDate() {
        return this.recordedDate.getAttribute("value");
    }

    public void navigateToPartyDetail() {
        switchToFrame("topFr");
        this.partyDetail.click();
    }

    public String getAlterationHeading() {
        switchToFrame("botFr");
        return this.alterationHeading.getText();
    }

    public String changeSmokerStatus() {
        String newValue;
        refreshFramePersonalDetail();
        if (getSelectedFromDropdown(smokerStatus).equalsIgnoreCase("Yes")) {
            this.selectFromDropdown(smokerStatus, "No");
            newValue = "No";
        } else {
            this.selectFromDropdown(smokerStatus, "Yes");
            newValue = "Yes";
        }
        this.partyDetailSubmitButton.click();
        switchWindow();
        return newValue;
    }

    public void changeCommunicationMethod() {
        refreshFrameBusinessDetail();
        if (getSelectedFromDropdown(preferredMethodOfCommunication).equalsIgnoreCase("Paper")) {
            this.selectFromDropdown(preferredMethodOfCommunication, "Electronic");
        } else {
            this.selectFromDropdown(preferredMethodOfCommunication, "Paper");
        }
        this.organisationCustomerSubmitButton.click();
        switchWindow();
    }

    public String verifyThirdPartyOption() {
        try {
            return this.thirdPartyAppointedRoleText.getAttribute("value");
        } catch (Exception e) {
            System.out.print("Third Party Role is unavailable for this user");
            return null;
        }
    }

    public String getAlterationStatus() {
        return this.alterationStatus.getAttribute("value");
    }

    public String verifyRoleTypeChangeable() {
        return this.roleTypeText.getText();
    }
}

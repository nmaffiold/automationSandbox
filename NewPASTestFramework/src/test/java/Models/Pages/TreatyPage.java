package Models.Pages;

import Models.Data.TreatyData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class TreatyPage extends BasePage {

    protected WebElement element;

    @FindBy(css = "#treatyDetails\\3a treatyDetails_splitLevelCmbId")
    public WebElement splitLevel;

    @FindBy(css = "#treatyDetails\\3a treatyDetails_proceedId")
    public WebElement proceedButton;

    @FindBy(css = "#treatyDetails\\3a treatyDetails_treatyReferenceId")
    public WebElement treatyReference;

    @FindBy(css = "#treatyDetails\\3a treatyDetails_treatyCommencementDateId")
    public WebElement treatyCommencementDate;

    @FindBy(css = "#treatyDetails\\3a treatyDetails_treatyBasisCmbId")
    public WebElement treatyBasis;

    @FindBy(css = "#treatyDetails\\3a treatyDetails_treatyContactLevelCmbId")
    public WebElement treatyContactLevel;

    @FindBy(css = "#treatyDetails\\3a treatyDetails_reassurerNameId")
    public WebElement reassurerName;

    @FindBy(css = "#treatyDetails\\3a treatyDetails_reassurerNameFindButtonId")
    public WebElement searchReassurerName;

    @FindBy(css = "#treatyDetails\\3a treatyDetails_paymentFrequencyCmbId")
    public WebElement reinsurancePaymentFrequency;

    @FindBy(css = "#treatyDetails\\3a treatyDetails_addId")
    public WebElement addButton;

    @FindBy(css = "#treatyDetails\\3a treatyDetails_saveId")
    public WebElement saveButton;

    @FindBy(css = "#treatyCommonContactDetails\\3a treatyCommonContactDetails_saveId")
    public WebElement saveReassurer;

    @FindBy(xpath = "//input[@value='OK']")
    public WebElement proceedWithUnvalidatedAssurer;

    @FindBy(xpath = "//a[contains(@title,'Details')]")
    public WebElement details;

    @FindBy(xpath = "//a[contains(@title,'Schedule')]")
    public WebElement schedule;

    @FindBy(xpath = "//a[contains(@title,'New Schedule')]")
    public WebElement newSchedule;

    @FindBy(xpath = "//a[contains(@title,'Reassurers')]")
    public WebElement reassurers;

    @FindBy(css = "#treatyDetails\\3a treatyDetails_reassurerSplitId")
    public WebElement reassurerSplit;

    @FindBy(css = "#navigateTree\\3a tree\\3a n-0-0-2-0\\3a _idJsp20")
    public WebElement firstReassurer;

    @FindBy(css = "#treatyCommonContactDetails\\3a treatyCommonContactDetails_underwritingContactFindButtonId")
    public WebElement underwritingContactSearch;

    @FindBy(css = "#treatyCommonContactDetails\\3a treatyCommonContactDetails_claimContactFindButtonId")
    public WebElement claimContactSearch;

    @FindBy(css = "#treatyDetails\\3a treatyDetails_submitId")
    public WebElement submitButton;

    @FindBy(css = "#searchTreatyAccount\\3a searchTreatyAccount_treatyRefNoId")
    public WebElement treatyReferenceSearch;

    @FindBy(xpath = "//a[contains(text(), 'Search Treaty/Account')]")
    public WebElement searchTreaty;

    @FindBy(css = "#searchTreatyAccount\\3a searchTreatyAccount_resetId")
    public WebElement resetButton;

    @FindBy(css = "#searchTreatyAccount\\3a searchTreatyAccount_searchId")
    public WebElement searchButton;

    @FindBy(css = "#searchTreatyAccount\\3a searchTreatyAccountTabletableId\\3a 0\\3a searchTreatyAccount_treatyReferenceTextId")
    public WebElement treatyNumber;

    @FindBy(css = "#treatyDetails\\3a treatyDetails_accountReferenceNoId")
    public WebElement treatyAccountReference;

    @FindBy(css = "#workItemDetail\\3a workItemDetail_cancelId")
    public WebElement discard;

    @FindBy(css = "#searchWorkItem\\3a workItemTabletableId\\3a 0\\3a searchWorkItem_actionTakenId")
    public WebElement actionTaken;

    @FindBy(css = "#searchTreatyAccount\\3a searchTreatyAccount_treatyCommDateFromId")
    public WebElement commenceDateFromSearch;

    @FindBy(css = "#searchTreatyAccount\\3a searchTreatyAccount_treatyCommDateToId")
    public WebElement commenceDateToSearch;

    @FindBy(css = "#searchTreatyAccount\\3a searchTreatyAccount_reassurerNameLovId")
    public WebElement reassurerNameSearch;

    @FindBy(css = "#searchTreatyAccount\\3a searchTreatyAccountTabletableId\\3a 0\\3a searchTreatyAccount_accountIdentifierHiddenId")
    public  WebElement latestWorkItemAccountReference;

    @FindBy(css = "#searchTreatyAccount\\3a searchTreatyAccount_scheduleEffectiveDateId")
    public  WebElement scheduleEffectiveDate;

    @FindBy(xpath = "//*[contains(@class, 'info')][2]")
    public  WebElement recordNotFoundMessage;

    @FindBy(css = "#searchTreatyAccount\\3a searchTreatyAccountTabletableId\\3a 0\\3a searchTreatyAccount_treatyReferenceId")
    public  WebElement latestTreatyReferenceID;

    @FindBy(css = "#treatyDetails\\3a treatyDetails_treatyReferenceId")
    public  WebElement retrieveTreatyReference;

    public TreatyPage(WebDriver driver, TreatyData data) {
        super(driver);
        refreshFrame();

        if (data.getTreatyReference() != null) {
            this.setTreatyReference(data.getTreatyReference());
        }

        if (data.getTreatyCommencementDate() != null) {
            this.setTreatCommencementDate(data.getTreatyCommencementDate());
        }

        if (data.getTreatyBasis() != null) {
            this.setTreatyBasis(data.getTreatyBasis());
        }

        if (data.getTreatyContactLevel() != null) {
            this.setTreatyContactLevel(data.getTreatyContactLevel());
        }

        if (data.getReinsurancePaymentFrequency() != null) {
            this.setReinsurancePaymentFrequency(data.getReinsurancePaymentFrequency());
        }

        if (data.getReassurerSplit() != null) {
            this.setReassurerSplit(data.getReassurerSplit());
        }
    }

    /**
     * refresh the default frame of the page
     */
    public void refreshFrame() {
        switchWindow();
        switchToFrame("botFr");
    }

    /**
     * select the split level for the treaty creation process
     *
     * @param option rule or treaty for creation
     */
    public void selectSplitLevel(String option) {
        this.selectFromDropdown(splitLevel, option);
    }

    public String retrieveTreatyReference() {
        return this.retrieveTreatyReference.getAttribute("value");
    }

    public void clickProceed() {
        this.waitForElement(proceedButton).click();
    }

    public void setTreatyReference(String ref) {
        this.treatyReference.sendKeys(ref);
    }

    public void setTreatCommencementDate(String date) {
        this.treatyCommencementDate.sendKeys(date);
    }

    public void setReassurerSplit(String split) {
        this.reassurerSplit.sendKeys(split);
    }

    public void setTreatyBasis(String option) {
        this.selectFromDropdown(treatyBasis, option);
    }

    public void setTreatyContactLevel(String option) {
        this.selectFromDropdown(treatyContactLevel, option);
    }

    public void setReinsurancePaymentFrequency(String frequency) {
        this.selectFromDropdown(reinsurancePaymentFrequency, frequency);
    }

    /**
     * open a search instance for reassurer
     */
    public void searchReassurerName() {
        this.searchReassurerName.click();
    }

    public void clickAdd() {
        this.addButton.click();
    }

    /**
     * save an unvalidated assurer
     */
    public void clickSave() {
        this.saveButton.click();
        switchWindow();
        try {
            //Try to proceed with an unvalidated user
            this.proceedWithUnvalidatedAssurer.click();
        } catch (Exception e) {
            //User is validated, ignore unvalidated step
        }
        waitForWindowAndSwitch();
    }

    /**
     * navigate to the schedule setup page
     */
    public void setupSchedule() {
        driver.switchTo().defaultContent();
        switchToFrame("topFr");
        this.schedule.click();
        this.newSchedule.click();
    }

    /**
     * setup a new reassurer
     */
    public void setupReassurer() {
        driver.switchTo().defaultContent();
        switchToFrame("topFr");
        this.reassurers.click();
        this.firstReassurer.click();
        switchToFrame("botFr");
    }

    /**
     * open a search instance for underwriting contact
     */
    public void searchUnderwritingContact() {
        this.underwritingContactSearch.click();
    }

    /**
     * open a search instance for a claim contact
     */
    public void searchClaimContact() {
        this.claimContactSearch.click();
    }

    public void clickSaveReassurer() {
        this.saveReassurer.click();
    }

    /**
     * save and submit all treaty information
     */
    public void submitTreaty() {
        driver.switchTo().defaultContent();
        switchToFrame("topFr");
        this.details.click();
        switchToFrame("botFr");
        this.submitButton.click();
        waitForWindowAndSwitch();
    }

    /**
     * search for the recently created treaty
     *
     * @param treaty the treaty ID randomly generated during the treaty creation process
     */
    public void searchTreatyByReference(String treaty) {
        driver.switchTo().defaultContent();
        switchToFrame("topFr");
        this.searchTreaty.click();
        switchToFrame("botFr");
        this.resetButton.click();
        this.treatyReferenceSearch.sendKeys(treaty);
        this.searchButton.click();
    }

    public void clickSearch() {
        refreshFrame();
        this.searchButton.click();
    }

    public void searchTreatyReference(String keys) {
        this.treatyReferenceSearch.sendKeys(keys);
    }

    public void submitTreatyAsAnotherUser() {
        refreshFrame();
        this.waitForElement(submitButton,3).click();
        waitForWindowAndSwitch();
        discard.click();
        waitForWindowAndSwitch();
    }

    public void searchReassurerByName() {
        this.reassurerNameSearch.click();
    }

    public String getReassurerName() {
        return this.reassurerName.getAttribute("value");
    }

    /**
     * get the treaty number of the most recently created treaty item
     *
     * @return the treaty number generated during the creation process
     */
    public String getTreatyNumber() {
        return this.treatyNumber.getText();
    }

    public String verifyActionTakenComplete() {
        return this.actionTaken.getAttribute("value");
    }

    public void searchTreatyByDates(String date, String date2) {
        resetButton.click();
        this.commenceDateFromSearch.sendKeys(date);
        this.commenceDateToSearch.sendKeys(date2);
    }

    public String verifyAccountReference() {
        if (!isThisFrame("botFr")) {
            switchToFrame("botFr");
        }
        return this.latestWorkItemAccountReference.getAttribute("value");
    }

    public void openLatestWorkItem() {
        refreshFrame();
        this.latestTreatyReferenceID.click();
        refreshFrame();
    }

    public void setScheduleEffectiveDate(String date) {
        switchWindow();
        refreshFrame();
        this.scheduleEffectiveDate.sendKeys(date);
    }

    public String retrieveRecordNotFoundMessage() {
        return this.recordNotFoundMessage.getText();
    }

    public void resetSearch() {
        this.resetButton.click();
    }
}

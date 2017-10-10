package Models.Pages;

import Models.Data.IndividualPartyDetailData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class IndividualPartyDetailsPage extends BasePage {

    @FindBy(xpath = "//td[.='Sanctioned Entity']//following::select[1]")
    @CacheLookup
    public WebElement sanctionedEntity;

    @FindBy(css = "#partyPersonalDetail\\3a partyPersonalDetail_sanctionScreeningDateId")
    @CacheLookup
    public WebElement dateOfLastSanctionScreening;

    @FindBy(css = "#partyPersonalDetail\\3a partyPersonalDetail_governmentEntityIndId")
    @CacheLookup
    public WebElement isGovernmentEntity;

    @FindBy(css = "#partyPersonalDetail\\3a partyPersonalDetail_returnWithresultId")
    @CacheLookup
    public WebElement returnWithResult;

    @FindBy(css = "#partyPersonalDetail\\3a partyPersonalDetail_identifyCustomerId")
    public WebElement identifyCreateContact;

    @FindBy(xpath = "//a[contains(@name,'toolbarEndCall')]")
    public WebElement endCall;

    @FindBy(css = "#recentActivitySummary\\3a recentActivitySummary_goContactHistoryId > span")
    public WebElement callHistory;

    @FindBy(css = "#maintainRelatedContact\\3a maintainRelatedContact_commentsId")
    public WebElement comments;

    @FindBy(css = "#maintainRelatedContact\\3a maintainRelatedContact_saveButId")
    public WebElement saveButton;

    @FindBy(css = "#contactHistoryCustPol\\3a contactHistoryCustTabletableId\\3a 0\\3a showCustomerCHCommentButton")
    public WebElement itemCommentButton;

    @FindBy(xpath = "//*[@id='ui-id-1']")
    public WebElement itemComment;

    @FindBy(xpath = "//a[contains(text(),'SAR')]")
    public WebElement SAR;

    @FindBy(xpath = "//a[contains(text(),'Initiate New SAR')]")
    public WebElement initiateSAR;

    @FindBy(css = "#sarDetails\\3a sarDetails_requestDateTxtId")
    public WebElement requestDate;

    @FindBy(css = "#sarDetails\\3a sarDetails_requestDateTxtIdBut")
    public WebElement requestDateSearch;

    @FindBy(xpath = "//*[.='1']")
    public WebElement firstDayOfMonth;

    @FindBy(css = "#sarDetails\\3a sarDetails_saveId")
    public WebElement saveSARDetails;

    @FindBy(css = "#sarDetails\\3a sarDetails_submitId")
    public WebElement submitSARDetails;

    @FindBy(xpath = "//a[contains(text(),'Work Items')]")
    public WebElement workItems;

    @FindBy(css = "#workItemDetail\\3a workItemDetail_customerNameId")
    public WebElement workItemCustomer;

    @FindBy(css = "#existingWorkItemPolCust\\3a existingWorkItemCustTabletableId\\3a 0\\3a existingWorkItemPolCust_workTypeCustTableTextId")
    public WebElement workType;

    @FindBy(xpath = "//a[contains(text(), 'Alteration')]")
    public WebElement alteration;

    @FindBy(xpath = "//a[contains(text(), 'Initiate Alteration')]")
    public WebElement initiateAlteration;

    @FindBy(css = "#alteration\\3a alteration_alterationReferenceNumberId")
    public  WebElement alterationReferenceSearch;

    @FindBy(css = "#alteration\\3a alteration_searchId")
    public WebElement alterationSearch;

    @FindBy(css = "#alteration\\3a alterationTabletableId\\3a 0\\3a alteration_alterationReferenceNoId")
    public WebElement searchResult;

    @FindBy(css = "#existingWorkItemPolCust\\3a existingWorkItemCustTabletableId\\3a 0\\3a existingWorkItemPolCust_editDataId1")
    public WebElement editLatestWorkitem;

    public IndividualPartyDetailsPage(WebDriver driver, IndividualPartyDetailData data) {
        super(driver);

        refreshFrame();

        if (data.getSanctionedEntity() != null) {
            this.selectSanctionedEntityFromDropdown(data.getSanctionedEntity());
        }

        if (data.getDateOfLastSanctionScreening() != null) {
            this.setDateOfLastSanctionScreening(data.getDateOfLastSanctionScreening());
        }

        if (data.getIsGovernmentEntity()) {
            this.setIsGovernmentEntity();
        }
    }

    /**
     * refresh the default frame of the current page
     */
    public void refreshFrame() {
        switchWindow();
        ArrayList<String> framePath = new ArrayList<>();
        framePath.add("botFr");
        framePath.add("partyPersonalDetailFrame");
        this.switchToFrame(framePath);
    }

    /**
     * refresh the frame for the call history page
     */
    public void refreshFrameCallHistory() {
        switchWindow();
        ArrayList<String> framePath = new ArrayList<>();
        framePath.add("botFr");
        framePath.add("contactHistory");
        this.switchToFrame(framePath);
    }

    public void refreshFrameWorkItems() {
        switchWindow();
        ArrayList<String> framePath = new ArrayList<>();
        framePath.add("botFr");
        framePath.add("partyRecentActivityFrame");
        this.switchToFrame(framePath);
    }

    public void refreshFrameWorkHistory() {
        switchWindow();
        ArrayList<String> framePath = new ArrayList<>();
        framePath.add("botFr");
        framePath.add("existingWorkItemPolCust");
        this.switchToFrame(framePath);
    }

    public void refreshFrameAlterationHistory() {
        switchWindow();
        ArrayList<String> framePath = new ArrayList<>();
        framePath.add("botFr");
        framePath.add("alterationHistory");
        this.switchToFrame(framePath);
    }

    public void initiateAlteration() {
        switchToFrame("topFr");
        this.alteration.click();
        this.initiateAlteration.click();
    }

    public void selectSanctionedEntityFromDropdown(String option) {
        this.selectFromDropdown(sanctionedEntity, option);
    }

    public void setDateOfLastSanctionScreening(String key) {
        this.dateOfLastSanctionScreening.sendKeys(key);
    }

    public void setIsGovernmentEntity() {
        this.dateOfLastSanctionScreening.click();
    }

    public void clickReturnWithResult() {
        this.returnWithResult.click();
    }

    public void clickIdentifyCreateContact() {
        this.identifyCreateContact.click();
    }

    /**
     * navigate to the end call wrap up page
     */
    public void clickEndCall() {
        driver.switchTo().defaultContent();
        switchToFrame("bannerFrame");
        this.endCall.click();
        switchToFrame("botFr");
    }

    public String getUniqueComment() {
        this.itemCommentButton.click();
        switchWindow();
        ArrayList<String> path = new ArrayList<>();
        path.add("botFr");
        path.add("contactHistory");
        switchToFrame(path);
        return this.itemComment.getText();
    }

    public void initiateSAR() {
        switchToFrame("topFr");
        this.waitForElement(SAR).click();
        this.waitForElement(initiateSAR).click();
        switchWindow();
        switchToFrame("botFr");
    }

    public void submitSAR() {
        this.waitForElement(saveSARDetails).click();
        this.waitForElement(submitSARDetails).click();
    }

    public void viewWorkItems() {
        switchWindow();
        switchToFrame("topFr");
        this.waitForElement(workItems).click();
        switchToFrame("botFr");
    }

    public String getWorkType() {
        return this.workType.getText();
    }

    public String verifyWorkItemCustomer() {
        waitForWindowAndSwitch();
        switchToFrame("botFr");
        return this.workItemCustomer.getAttribute("value");
    }

    public void setRequestDate(String date) {
        this.requestDate.clear();
        this.requestDate.sendKeys(date);
    }

    public void setRequestDateSearch() {
        this.requestDateSearch.click();
        switchWindow();
        this.scrollIntoView(firstDayOfMonth);
        this.waitForElement(firstDayOfMonth).click();
        switchWindow();
        switchToFrame("botFr");
    }

    public void viewLatestWorkItem() {
        this.waitForElement(workType).click();
    }

    public void setComment(String comment) {
        this.comments.sendKeys(comment);
    }

    public void clickSave() {
        this.saveButton.click();
        waitForWindowAndSwitch();
    }

    public void alterationSearch(String key) {
        switchToFrame("topFr");
        this.alteration.click();
        refreshFrameAlterationHistory();
        this.alterationReferenceSearch.sendKeys(key);
        this.alterationSearch.click();
        switchWindow();
    }

    public void clickLatestWorkItem() {
        refreshFrameWorkHistory();
        this.editLatestWorkitem.click();
    }

    public void clickCallHistory() {
        this.waitForElement(callHistory).click();
    }
}

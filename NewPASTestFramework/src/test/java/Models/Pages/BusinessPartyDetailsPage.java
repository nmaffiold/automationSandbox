package Models.Pages;

import Models.Data.BusinessPartyDetailData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class BusinessPartyDetailsPage extends BasePage {

    @FindBy(css = "#organizationalCustomerDetail\\3a organizationalCustomerDetail_sanctionedEntityCmbId")
    public WebElement sanctionedEntity;

    @FindBy(css = "#organizationalCustomerDetail\\3a organizationalCustomerDetail_sanctionScreeningDateId")
    public WebElement dateOfLastSanctionScreening;

    @FindBy(css = "#organizationalCustomerDetail\\3a organizationalCustomerDetail_governmentEntityIndId")
    public WebElement isGovernmentEntity;

    @FindBy(css = "#organizationalCustomerDetail\\3a organizationalCustomerDetail_returnWithresultId")
    public WebElement returnWithResult;

    @FindBy(xpath = "//a[contains(text(), 'Alteration')]")
    public WebElement alteration;

    @FindBy(xpath = "//a[contains(text(), 'Initiate Alteration')]")
    public WebElement initiateAlteration;

    @FindBy(xpath = "//a[contains(text(),'Work Items')]")
    public WebElement workItems;

    @FindBy(css = "#existingWorkItemPolCust\\3a existingWorkItemCustTabletableId\\3a 0\\3a existingWorkItemPolCust_editDataId1")
    public WebElement editLatestWorkitem;

    @FindBy(css = "#existingWorkItemPolCust\\3a existingWorkItemCustTabletableId\\3a 0\\3a existingWorkItemPolCust_workTypeCustTableTextId")
    public WebElement workType;

    @FindBy(css = "#workItemDetail\\3a workItemDetail_workTypeCodeId")
    public WebElement workTypeCode;

    @FindBy(css = "#workItemHist\\3a workItemHistorySelectTabletableId\\3a 0\\3a workItemHist_statusTextId")
    public  WebElement workItemStatus;

    public BusinessPartyDetailsPage(WebDriver driver, BusinessPartyDetailData data) {
        super(driver);
        refreshFrameCustomerDetails();

        if (data.getSanctionedEntity() != null) {
            this.selectSanctionedEntityFromDropdown(data.getSanctionedEntity());
        }

        if (data.getDateOfLastSanctionScreening() != null) {
            this.setDateOfLastSanctionScreening(data.getDateOfLastSanctionScreening());
        }

        if (data.getIsGovernmentEntity()){
            this.setIsGovernmentEntity();
        }
    }

    /**
     * refresh the default frame of the current page
     */
    public void refreshFrame() {
        switchWindow();
        switchToFrame("botFr");
    }

    public void refreshFrameCustomerDetails() {
        switchWindow();
        ArrayList<String> framePath = new ArrayList<>();
        framePath.add("botFr");
        framePath.add("orgCustomerDetailFrame");
        this.switchToFrame(framePath);
    }

    public void refreshFrameWorkHistory() {
        switchWindow();
        ArrayList<String> framePath = new ArrayList<>();
        framePath.add("botFr");
        framePath.add("existingWorkItemPolCust");
        this.switchToFrame(framePath);
    }

    public void refreshFrameWorkItemHistory() {
        switchWindow();
        ArrayList<String> framePath = new ArrayList<>();
        framePath.add("botFr");
        framePath.add("workItemHistoryframeId");
        this.switchToFrame(framePath);
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

    public void initiateAlteration() {
        switchToFrame("topFr");
        this.alteration.click();
        this.initiateAlteration.click();
    }

    public void clickLatestWorkItem() {
        refreshFrameWorkHistory();
        this.editLatestWorkitem.click();
        waitForWindowAndSwitch();
        refreshFrame();
    }

    public void viewWorkItems() {
        switchWindow();
        switchToFrame("topFr");
        this.waitForElement(workItems).click();
        switchToFrame("botFr");
    }

    public String getWorkType() {
        return this.workTypeCode.getAttribute("value");
    }

    public String getWorkItemStatus() {
        refreshFrameWorkItemHistory();
        return this.workItemStatus.getAttribute("value");
    }
}

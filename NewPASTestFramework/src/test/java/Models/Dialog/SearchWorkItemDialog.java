package Models.Dialog;


import Models.Data.WorkItemData;
import Models.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class SearchWorkItemDialog extends BasePage {

    @FindBy(css = "#searchWorkItem\\3a searchWorkItem_createWorkItemId")
    public WebElement createWorkItem;

    @FindBy(css = "#searchWorkItem\\3a searchWorkItem_worktypeImgId")
    public WebElement searchWorkType;

    @FindBy(css = "#searchWorkItem\\3a searchWorkItem_customerNumberImgId")
    public WebElement searchCustomer;

    @FindBy(css = "#searchWorkItem\\3a searchWorkItem_customerNumberId")
    public WebElement customerNumber;

    @FindBy(css = "#searchWorkItem\\3a searchWorkItem_searchId")
    public WebElement searchButton;

    @FindBy(css = "#workItemHist\\3a workItemHist_histCommentsId")
    public WebElement workHistoryCommentsInput;

    @FindBy(css = "#searchWorkItem\\3a workItemTabletableId\\3a 0\\3a searchWorkItem_startDateId")
    public WebElement workItemStartDate;

    @FindBy(css = "#searchWorkItem\\3a workItemTabletableId\\3a 0\\3a searchWorkItem_editDataId")
    public WebElement editWorkItemButton;

    @FindBy(css = "#searchWorkItem\\3a workItemTabletableId\\3a 0\\3a searchWorkItem_queueId")
    public WebElement queueStatus;

    @FindBy(css = "#searchWorkItem\\3a searchWorkItem_workItemStatuscomboId")
    public WebElement workItemStateDropdown;

    @FindBy(css = "#searchWorkItem\\3a searchWorkItem_workItemRefId")
    public WebElement workItemReferenceInput;

    @FindBy(css = "#workItemDetail\\3a workItemDetail_openTransactionButtonId")
    public WebElement openTransactionButton;

    @FindBy(css = "#searchWorkItem\\3a searchWorkItem_referenceTypeComboId")
    public WebElement workItemType;

    @FindBy(css = "#searchWorkItem\\3a searchWorkItem_indexReferenceNumberTextId")
    public WebElement referenceNumber;

    @FindBy(css = "#referenceData")
    public WebElement referenceDataTab;

    @FindBy(xpath = "//span[contains(text(),'Current Queue')]//following::input[1]")
    public WebElement currentQueue;



    public SearchWorkItemDialog(WebDriver driver, WorkItemData data) {
        super(driver);

        this.refreshFrame();


        if (data.getWorkItemRef() != null) {
            this.setWorkItemReference(data.getWorkItemRef());
        }

        if (data.getCustomerNumber() != null)
            this.setCustomerNumber(data.getCustomerNumber());

        if (data.getType()!=null)
            this.selectWorkitemType(data.getType());
        if(data.getReferenceNumber()!=null)
            this.setReferenceNumber(data.getReferenceNumber());

    }

    public void refreshFrame() {
        this.switchWindow();
        this.switchToFrame("botFr");
    }

    public void clickCreateWorkItem() {
        this.waitForElement(createWorkItem).click();
    }

    public void clickSearchWorkType() {
        this.searchWorkType.click();
    }

    public void clickSearchCustomer() {
        this.searchCustomer.click();
    }

    public void clickSearchButton() {
        this.searchButton.click();
    }

    /**
     * get the work history's comments
     *
     * @return comment text as a string
     */
    public String getWorkHistoryComments() {
        ArrayList<String> path = new ArrayList<>();
        path.add("botFr");
        path.add("searchWorkItem_workItemHistoryFrameId");
        this.switchToFrame(path);
        return this.waitForElement(workHistoryCommentsInput).getText();
    }

    /**
     * get the start date of a work item
     *
     * @return the date of the work item as a string
     */
    public String getWorkItemStartDate() {
        this.switchToFrame("botFr");

        String date = this.waitForElement(workItemStartDate).getAttribute("value");
        try {
            date = date.substring(0, 10);
        } catch (IndexOutOfBoundsException e) {
            date = "date not found";
        }
        return date;
    }

    public void clickEditWorkItem() {
        this.editWorkItemButton.click();
    }

    /**
     * get the status of the queue
     *
     * @return the queue status as a string
     */
    public String getQueueStatus() {
        this.switchToFrame("botFr");
        return this.waitForElement(queueStatus).getAttribute("value");
    }

    /**
     * select the work item state from a dropdown
     *
     * @param state the state of the work item
     */
    public void selectWorkItemState(String state) {
        this.selectFromDropdown(workItemStateDropdown, state);
    }

    /**
     * get the text of the current work item's state
     *
     * @param state the state
     */
    public void getWorkItemState(String state) {
        this.workItemStateDropdown.getText();
    }

    public void setWorkItemReference(String workItemReference) {
        this.workItemReferenceInput.sendKeys(workItemReference);
    }

    public void setCustomerNumber(String key) {
        this.customerNumber.sendKeys(key);
    }

    /**
     * get the work item's reference text
     *
     * @return the work item's reference
     */
    public String getWorkItemReference() {
        this.switchToFrame("botFr");
        return this.waitForElement(workItemReferenceInput).getText();
    }


    public void clickReferenceDataTab(){
        this.referenceDataTab.click();
        ArrayList<String> path = new ArrayList<>();
        path.add("botFr");
        path.add("referenceDataframeId");
        this.switchToFrame(path);
    }

    public String getCurrentQueue(){

       return this.currentQueue.getAttribute("Value");
    }

    public void clickOpenTransaction() {
        this.openTransactionButton.click();
    }

    public void selectWorkitemType(String option){
        this.selectFromDropdown(workItemType,option);
    }

    public void setReferenceNumber(String reference){
        this.referenceNumber.sendKeys(reference);
    }
}

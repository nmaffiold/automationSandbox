package Models.Data;


public class WorkItemData {


    private String Type = null;
    private String referenceNumber = null;
    private String workItemRef = null;
    private String workType = null;
    private String customerNumber = null;
    private String customerReference = null;
    private String workItemState = null;
    private String status = null;
    private String comment = null;


    public WorkItemData() {

    }

    public WorkItemData withType(String type) {
        this.setType(type);
        return this;
    }

    public WorkItemData withReferenceNumber(String referenceNumber) {
        this.setReferenceNumber(referenceNumber);
        return this;
    }

    public WorkItemData withWorkItemRef(String workItemRef) {
        this.setWorkItemRef(workItemRef);
        return this;
    }

    public WorkItemData withWorkType(String workType) {
        this.setWorkType(workType);
        return this;
    }

    public WorkItemData withCustomerReference(String customerReference) {
        this.setCustomerReference(customerReference);
        return this;
    }

    public WorkItemData withWorkItemState(String workItemState) {
        this.setWorkItemState(workItemState);
        return this;
    }

    public WorkItemData withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    public WorkItemData withComments(String comment) {
        this.setComment(comment);
        return this;
    }

    public WorkItemData withCustomerNumber(String number) {
        this.setCustomerNumber(number);
        return this;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getWorkItemRef() {
        return workItemRef;
    }

    public void setWorkItemRef(String workItemRef) {
        this.workItemRef = workItemRef;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getCustomerReference() {
        return customerReference;
    }

    public void setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
    }

    public String getWorkItemState() {
        return workItemState;
    }

    public void setWorkItemState(String workItemState) {
        this.workItemState = workItemState;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
}

package Models.Data;

public class LinkedRefactorData {

    private String policyNumber;

    public LinkedRefactorData(){

    }

    public LinkedRefactorData withPolicyNumber(String policy){
        this.setPolicyNumber(policy);
        return this;
    }
    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumer) {
        this.policyNumber = policyNumer;
    }
}

package Models.Data;

public class NewCategoryData {

    private String categoryName = null;
    private String categoryNumber = null;
    private String segregationGroupName = null;
    private String categoryTemplate = null;
    private String eligibilityTermsDescription = null;

    public NewCategoryData() {
    }

    public NewCategoryData withCategoryName (String key) {
        this.setCategoryName(key);
        return this;
    }

    public NewCategoryData withCategoryNumber(String key) {
        this.setCategoryNumber(key);
        return this;
    }

    public NewCategoryData withSegregationGroupName(String key) {
        this.setSegregationGroupName(key);
        return this;
    }

    public NewCategoryData withCategoryTemplate(String key) {
        this.setCategoryTemplate(key);
        return this;
    }

    public NewCategoryData withEligibilityTermsDescription(String key) {
        this.setCategoryName(key);
        return this;
    }


    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryNumber() {
        return categoryNumber;
    }

    public void setCategoryNumber(String categoryNumber) {
        this.categoryNumber = categoryNumber;
    }

    public String getSegregationGroupName() {
        return segregationGroupName;
    }

    public void setSegregationGroupName(String segregationGroupName) {
        this.segregationGroupName = segregationGroupName;
    }

    public String getCategoryTemplate() {
        return categoryTemplate;
    }

    public void setCategoryTemplate(String categoryTemplate) {
        this.categoryTemplate = categoryTemplate;
    }

    public String getEligibilityTermsDescription() {
        return eligibilityTermsDescription;
    }

    public void setEligibilityTermsDescription(String eligibilityTermsDescription) {
        this.eligibilityTermsDescription = eligibilityTermsDescription;
    }
}

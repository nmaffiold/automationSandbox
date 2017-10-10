package Models.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuDialoguePage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Party')]")
    public WebElement partyMenu;

    @FindBy(xpath = "//a[contains(text(),'Party / Policy')]")
    public WebElement partyPolicy;

    @FindBy(xpath = "//a[contains(text(),'Scheme')]")
    public WebElement schemeMenu;

    @FindBy(xpath = "//a[contains(text(),'Individual Life Application')]")
    public WebElement individualLifeSchemeApplication;

    @FindBy(xpath = "//a[contains(text(),'New Scheme')]")
    public WebElement newScheme;

    @FindBy(css = "#navigateTree\\3a tree\\3a n-4-0\\3a _idJsp20")
    public WebElement moneyMenu;

    @FindBy(xpath = "//a[contains(text(),'Direct Payment')]")
    public WebElement directPayment;

    @FindBy(xpath = "//a[contains(text(),'Contact')]")
    public WebElement partyContact;

    @FindBy(xpath = "//a[contains(text(), 'New Treaty')]")
    public WebElement newTreaty;

    @FindBy(css = "#createTreaty\\3a createTreaty_treatyTypeCmbId")
    public WebElement treatyType;

    @FindBy(css = "#createTreaty\\3a createTreaty_proceedId")
    public WebElement proceedWithTreatyCreation;

    @FindBy(xpath = "(//a[@title='Agency And Commission'])[2]")
    public WebElement agencyCommission;

    @FindBy(xpath = "//a[contains(text(),'New Agency')]")
    public WebElement newAgency;

    @FindBy(css = "#navigateTree\\3a tree\\3a n-0-4\\3a _idJsp20")
    public WebElement workItemMenu;

    @FindBy(xpath = "//a[contains(text(), 'Workflow')]")
    public WebElement workflow;

    @FindBy(xpath = "//a[contains(text(), 'Search And Pick')]")
    public WebElement searchAndPick;

    @FindBy(xpath = "//a[contains(text(), 'Search Treaty/Account')]")
    public WebElement searchTreatyAccount;

    public MenuDialoguePage(WebDriver driver) {
        super(driver);
        refreshFrame();
    }

    /**
     * refresh the default frame of the current page
     */
    public void refreshFrame() {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.id("topFr")));
    }

    /**
     * navigate to the new scheme creation from the main menu dialog options
     */
    public void searchPartyPolicy() {
        this.waitForElement(partyMenu).click();
        this.waitForElement(partyPolicy).click();
    }

    /**
     * reset frames and pages to re-initiate the search process
     */
    public void resetSearch() {
        driver.switchTo().defaultContent();
        switchToFrame("topFr");
        this.partyPolicy.click();
    }

    /**
     * navigate to new scheme creation from the main menu dialog options
     */
    public void clickNewScheme() {
        this.schemeMenu.click();
        this.newScheme.click();
    }

    /**
     * navigate to new treaty creation from the main menu dialog options
     *
     * @param treatyTypes the type of treaty being created
     */
    public void createNewTreaty(String treatyTypes) {
        this.newTreaty.click();
        switchToFrame("botFr");
        this.selectFromDropdown(treatyType, treatyTypes);
        this.proceedWithTreatyCreation.click();
    }

    /**
     * navigate to the 'search and pick' option
     */
    public void searchAndPick() {
        if (!isThisFrame("topFr")) {
            switchToFrame("topFr");
        }
        this.workflow.click();
        this.searchAndPick.click();
        switchToFrame("botFr");
    }

    /**
     * navigate to party contact from th emain menu dialog options
     */
    public void clickPartyContact() {
        if (!isThisFrame("topFr")) {
            driver.switchTo().defaultContent();
            this.switchToFrame("topFr");
        }
        this.partyContact.click();
        switchToFrame("botFr");
    }

    public void clickNewIndividualLifeScheme() {
        this.individualLifeSchemeApplication.click();
    }

    /**
     * navigate to new direct payment creation from the main menu dialog options
     */
    public void clickNewDirectPayment() {
        if (!isThisFrame("topFr")) {
            driver.switchTo().defaultContent();
            this.switchToFrame("topFr");
        }
        this.waitForElement(moneyMenu).click();
        this.waitForElement(directPayment, 5).click();
    }

    /**
     * navigate to new direct payment from from a work item
     */
    public void clickNewDirectPaymentFromWI() {
        this.switchToFrame("topFr");
        this.waitForElement(moneyMenu).click();
        this.directPayment.click();
    }

    public void clickNewAgency() {
        this.switchToFrame("topFr");
        this.waitForElement(agencyCommission, 3).click();
        this.newAgency.click();
    }

    public void clickWorkItemMenu() {
        this.waitForElement(workItemMenu).click();
    }

    public void clickSearchAndPickOption() {
        this.searchAndPick.click();
    }

}

package Models.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    protected WebElement element;

    @FindBy(css = "#search > div.list-icon > i")
    public WebElement searchTab;

    @FindBy(css = "#party > div.list-icon > i")
    public WebElement partyTab;

    @FindBy(css = "#policy > div.list-icon > i")
    public WebElement policyTab;

    @FindBy(css = "#new > div.list-icon > i")
    public WebElement newTab;

    @FindBy(css = "#application > div.list-icon > i")
    public WebElement applicationTab;

    @FindBy(css = "#reports > div.list-icon > i")
    public WebElement reportsTab;

    @FindBy(css = "#fund > div.list-icon > i")
    public WebElement fundTab;

    @FindBy(css = "#accounting > div.list-icon > i")
    public WebElement accountingTab;

    @FindBy(css = "#admin > div.list-icon > i")
    public WebElement adminTab;

    @FindBy(css = "#reassurance > div.list-data")
    public WebElement reassuranceTab;

    @FindBy(css = "#scheme > div.list-icon > i")
    public WebElement schemeTab;

    @FindBy(css = "#agency > div.list-icon > i")
    public WebElement agencyTab;

    @FindBy(name = "toolbarLogout")
    public WebElement logoutButton;

    @FindBy(xpath = "//a[contains(@name,'toolbarTakeCall')]")
    public WebElement takeCall;

    @FindBy(xpath = "//a[contains(@name,'toolbarMakeCall')]")
    public WebElement makeCall;

    @FindBy(css = "#down")
    public WebElement downArrow;


    public HomePage(WebDriver driver) {
        super(driver);
        refreshFrame();
    }

    /**
     * refresh the default frame of the menu
     */
    public void refreshFrame() {
        waitForWindowAndSwitch();
        if (!isThisFrame("iconFr")) {
            this.switchToFrame("iconFr");
        }
    }

    public void returnToHomeFrame() {
        waitForWindowAndSwitch();
        this.switchToFrame("iconFr");
    }

    public void clickSearchTab() {

        this.switchToFrame("iconFr");
        this.searchTab.click();
    }

    public void clickPartyTab() {
        this.partyTab.click();
    }

    public void clickPolicyTab() {
        this.policyTab.click();
    }

    public void clickNewTab() {
        if (!isThisFrame("iconFr")) {
            this.switchToFrame("iconFr");
        }
        this.waitForElement(newTab).click();
    }

    public void clickApplicationTab() {
        this.applicationTab.click();
    }

    //Handle if Reassurance Tab is off-screen due to Automation Software Notification/Screen Resolution
    public void clickReassuranceTab() {
        try {
            this.reassuranceTab.click();
        } catch (Exception e) {
            this.downArrow.click();
            this.waitForElement(reassuranceTab).click();
        }
    }

    public void clickDownArrow() {
        this.downArrow.click();
    }

    public void clickTakeCall() {
        switchToFrame("bannerFrame");
        this.takeCall.click();
    }

    public void clickLogout() {
        this.switchToFrame("bannerFrame");
        this.logoutButton.click();
    }

}

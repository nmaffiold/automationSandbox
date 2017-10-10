package Models.Pages;

import Models.Data.ApplicationDetailsData;
import Models.Data.LoginData;
import Models.Data.SchemeOverviewData;
import Models.Dialog.LoginDialog;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ApplicationDetailsPage extends BasePage {

    @FindBy(css = "#pensionApplicationDetail\\3a pensionApplicationDetail_customerNumberButtonId")
    @CacheLookup
    public WebElement customerNameSearch;

    public ApplicationDetailsPage(WebDriver driver, ApplicationDetailsData data) {
        super(driver);
        refreshFrame();
    }

    /**
     * refresh the default frame of the current page
     */
    public void refreshFrame() {
        switchWindow();
        this.switchToFrame("botFr");
    }

    public void searchIndividualCustomer() {
        this.waitForElement(customerNameSearch).click();
    }
}

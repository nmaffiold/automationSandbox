package Models.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;


public abstract class BasePage {
    protected WebDriver driver;
    private String currentFrame = "";


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickHomeMenu() {
        this.driver.findElement(By.cssSelector("BaNCSMENU")).click();
    }

    public void clickBaNCSLogin() {
        this.driver.findElement(By.cssSelector("BaNCSLOGIN")).click();
    }

    public int getCartCount() {
        return Integer.parseInt(this.driver.findElement(By.cssSelector("#nav-cart a")).findElement(By.className("cart-count")).getText());
    }

    /**
     * switch to a new window
     */
    public void switchWindow() {

        for (String winHandle : driver.getWindowHandles()) {
            try {
                driver.switchTo().window(winHandle);
                //System.out.println(" pagina "+ winHandle);
            } catch (NoSuchWindowException e) {

            }
        }
    }

    /**
     * compares the current frame to the specified frame
     *
     * @param frame the expected frame
     * @return whether the current frame matches the expected frame
     */
    public boolean isThisFrame(String frame) {
        return currentFrame.equalsIgnoreCase(frame);
    }

    /**
     * switch to a frame by its ID attribute
     *
     * @param frameId the ID of the frame to switch to
     */
    public void switchToFrame(String frameId) {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.id(frameId)));
        currentFrame = frameId;
    }

    /**
     * switch to a frame within a frame, or an iframe within a frame
     *
     * @param framePath an array of the frames to switch through
     */
    public void switchToFrame(ArrayList<String> framePath) {
        driver.switchTo().defaultContent();
        for (String frameId : framePath) {
            driver.switchTo().frame(driver.findElement(By.id(frameId)));
            currentFrame = frameId;
        }

    }

    /**
     * finds a frame on the page by its CSS selector
     *
     * @param CSS the selector of the frame to switch to
     */
    public void switchToFrameCSS(String CSS) {
        driver.switchTo().frame(driver.findElement(By.cssSelector(CSS)));
        currentFrame = "";
    }

    /**
     * finds a frame on the page by its CSS selector
     *
     * @param CSS the selector of the frame to switch to
     */
    public void switchToFrameByIndex(int index) {
        driver.switchTo().frame(index);
        currentFrame = "";
    }

    /**
     * wait 5 seconds for all windows to close when multiple popup windows close simultaneously
     */
    public void waitForWindowAndSwitch() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.switchWindow();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.id("botFr")));
    }

    /**
     * waits for an element to become present on the page before interacting with it
     *
     * @param locator    selector for the element being waited for
     * @param secsToWait how long the browser should wait for the element
     * @return whether the element was found on the page in the allotted time
     */
    public WebElement waitForElement(By locator, int secsToWait) {
        WebElement find;
        WebDriverWait wait = new WebDriverWait(driver, secsToWait);
        find = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return find;
    }

    public WebElement waitForElement(WebElement element, int secsToWait) {
        WebElement find;
        WebDriverWait wait = new WebDriverWait(driver, secsToWait);
        try {
            Thread.sleep(secsToWait*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        find = wait.until(ExpectedConditions.visibilityOf(element));
        return find;
    }

    /**
     * selects an element from a dropdown menu that exactly matches the option provided
     *
     * @param element the selector of the dropdown menu
     * @param option  the value we are setting in the dropdown menu
     */
    public void selectFromDropdown(WebElement element, String option) {
        Select selector = new Select(waitForElement(element));
        selector.selectByVisibleText(option);
    }

    /**
     * gets the text of the currently selected element in a dropdown menu
     *
     * @param element the selector of the dropdown menu
     * @return returns the text in the currently selected dropdown element as a string
     */
    public String getSelectedFromDropdown(WebElement element) {
        Select selector = new Select(waitForElement(element));
        return selector.getFirstSelectedOption().getText();
    }

    /**
     * waits for an element to become present on the page for 10 seconds
     *
     * @param element the selector of the element being waited for
     * @return whether the element was found on the page in the allotted time
     */
    protected WebElement waitForElement(WebElement element) {
        WebElement find;
        WebDriverWait wait = new WebDriverWait(driver, 10);
        find = wait.until(ExpectedConditions.visibilityOf(element));
        return find;
    }

    /**
     * accepts browser popup alerts and proceeds
     */
    public void confirmBrowserPopup() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    /**
     * scrolls the page to find potentially obscured elements
     *
     * @param element the selector of the element to scroll to
     */
    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * confirms the text of error messages on the page
     *
     * @param errorMessage the expected error message text
     * @return whether error text was captured, and if it matched the expected text
     */
    public boolean confirmErrorMessage(String errorMessage) {

        boolean confirm;
        try {
            confirm = (this.waitForElement(driver.findElement(By.xpath("//td[@class = 'error']"))).getText()).contains(errorMessage);
        } catch (Exception e) {
            confirm = false;
        }
        return confirm;
    }
}

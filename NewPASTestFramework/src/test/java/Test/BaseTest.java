package Test;

import Library.GlobalSettings;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


public abstract class BaseTest extends GlobalSettings {

    protected static WebDriver driver;

    private static DesiredCapabilities capabilities = new DesiredCapabilities();


    // Set capabilities
    public static DesiredCapabilities capabilities() {
        String browser = "chrome";
        capabilities.setBrowserName(browser);
        return capabilities;
    }


    @Before
    public void testSetup() throws IOException {

        driver = TestManager.getInstance().driver(initDriverType());
        driver.manage().deleteAllCookies();
        driver.navigate().to(initBaseUrl());
    }

    @After
    public void cleanup() {
       driver.quit();
    }

    /**
     * Uses the system clock to generate the current date as a string in dd/MM/yyy format
     *
     * @return the current date at the time of execution
     */
    public String getDateToday() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }

    /**
     * Uses the system clock to generate the first day of the current month
     *
     * @return the first day of the current month
     */
    public String getFirstDayOfMonth() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
        return "01/" + sdf.format(date);

    }

    /**
     * generates a random user name comprising of 'Test User', Today's date and a random Unique Identifier (16 characters long)
     *
     * @return a random name for a new user
     */
    public String getRandomUserName() {
        return "TestUser" + " : " + getDateToday() + " : " + UUID.randomUUID().toString();
    }

    /**
     * generates a random 16 character length unique ID
     *
     * @return a randomly generated string
     */
    public String generateRandomUniqueString() {
        return UUID.randomUUID().toString();
    }

    /**
     * generates a random treaty reference string 8 characters long, using 0-9, A-F, a-f
     *
     * @return the random string with the chars
     */
    public String getRandomAlphaNumeralString(int length) {
        return RandomStringUtils.random(length, "0123456789ABCDEFabcdef");
    }

    /**
     * generate a random number string using numbers 0-9
     *
     * @param length the length of the string returned
     * @return Return the random number string equal to the set length
     */
    public String getRandomNumberString(int length) {
        return RandomStringUtils.random(length, "0123456789");
    }


}

package Test;

import Library.GlobalSettings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestManager extends GlobalSettings {

    private static TestManager testManager = new TestManager();
    private DesiredCapabilities capabilities = new DesiredCapabilities();


    private TestManager() {
    }

    public static TestManager getInstance() {
        return testManager;
    }

    public WebDriver driver(String driverType) throws IOException {

        WebDriver driver = null;
        // Local Drivers
        if (initDriverType().equals("grid")) driver = new RemoteWebDriver(new URL(initRemoteHub()), capabilities());
        else {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return driver;
    }

    // Set capabilities
    public DesiredCapabilities capabilities() {
        String browser = initBrowser();
        capabilities.setBrowserName(browser);
        return capabilities;
    }
}

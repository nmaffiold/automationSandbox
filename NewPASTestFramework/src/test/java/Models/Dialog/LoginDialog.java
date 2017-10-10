package Models.Dialog;

import Models.Data.LoginData;
import Models.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginDialog extends BasePage {

    protected WebElement element;

    public LoginDialog(WebDriver driver, LoginData data) {
        super(driver);
        element = driver.findElement(By.cssSelector("#loginFormContainer"));

        if (data.getLogin() != null) {
            this.setUsername(data.getLogin());
        }
        if (data.getPassword() != null) {
            this.setPassword(data.getPassword());
        }
    }

    public void setUsername(String username) {
        element.findElement(By.cssSelector("#userName")).sendKeys(username);
    }

    public void setPassword(String password) {
        element.findElement(By.cssSelector("#password")).sendKeys(password);
    }

    public void clickLoginButton() {
        element.findElement(By.className("loginButton")).click();
        this.switchWindow();

    }

}

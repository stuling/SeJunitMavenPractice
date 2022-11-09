package sauce.pages.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sauce.pages.pom.base.BasePage;

/**
 * Swaglabs login page
 */
public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void enterUserName(String username) {

        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    /**
     * Swaglabs login page has 1 password, secret_sauce (hardcoded here)
     */
    public void enterPassword() {

        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    /**
     * pass in a specific password to Swaglabs login page
     * @param password
     */
    public void enterPassword(String password) {

        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void clickLoginButton() {

        driver.findElement(By.id("login-button")).click();
    }

}

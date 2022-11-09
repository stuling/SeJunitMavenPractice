package sauce.pages;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.openqa.selenium.By;
import sauce.pages.pom.pages.LoginPage;
import org.junit.jupiter.api.Test;
import sauce.pages.pom.base.BaseTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwagLoginPageTest extends BaseTest {

    @Test
    void checkTitleOfPage() {

        driver.get("https://saucedemo.com/");
        LoginPage swagLoginPage = new LoginPage(driver);

        //Assert that the title of the page = Swag Labs
        assertEquals("Swag Labs", swagLoginPage.getTitle());
    }

    /**
     * Login to the Swaglabs products page using the 3
     * users defined in the User enum
     * @param user
     */
    @ParameterizedTest
    @EnumSource(User.class)
    public void loginWithGoodUsers(User user) {

        driver.get("https://saucedemo.com/");
        LoginPage swagLoginPage = new LoginPage(driver);

        swagLoginPage.enterUserName(user.name());
        swagLoginPage.enterPassword();
        swagLoginPage.clickLoginButton();
        assertEquals(true, driver.findElement(By.className("title")).isDisplayed());
    }

    @Test
    public void loginWithBadUser() {

        driver.get("https://saucedemo.com/");
        LoginPage swagLoginPage = new LoginPage(driver);

        swagLoginPage.enterUserName("locked_out_user");
        swagLoginPage.enterPassword();
        swagLoginPage.clickLoginButton();

        Boolean loginErrorMessage = driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3")).isDisplayed();
        assertEquals(true, loginErrorMessage);
    }

    @Test
    public void failWithBadPassword() {

        driver.get("https://saucedemo.com/");
        LoginPage swagLoginPage = new LoginPage(driver);

        swagLoginPage.enterUserName("standard_user");
        swagLoginPage.enterPassword("badpassword");
        swagLoginPage.clickLoginButton();

        //getPageSource kinda sucks but I'll go with it for now
        Boolean loginErrorMessage = driver.getPageSource().contains("Epic sadface");
        assertEquals(true, loginErrorMessage);
    }
}

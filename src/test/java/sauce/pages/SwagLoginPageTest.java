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
    public void loginTest(User user) {

        driver.get("https://saucedemo.com/");
        LoginPage swagLoginPage = new LoginPage(driver);

        swagLoginPage.enterUserName(user.name());
        swagLoginPage.enterPassword();
        swagLoginPage.clickLoginButton();
        assertEquals(true, driver.findElement(By.className("title")).isDisplayed());
    }
}

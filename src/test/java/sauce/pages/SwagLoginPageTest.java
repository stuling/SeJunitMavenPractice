package sauce.pages;

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
}

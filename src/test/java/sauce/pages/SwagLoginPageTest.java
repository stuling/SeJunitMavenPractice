package sauce.pages;

import heroku.pages.pom.pages.HelloInternetPage;
import org.junit.jupiter.api.Test;
import sauce.pages.pom.BaseTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwagLoginPageTest extends BaseTest {

    @Test
    void checkTitleOfPage() {

        driver.get("https://saucedemo.com/");
        HelloInternetPage helloInternetPage = new HelloInternetPage(driver);

        //Assert that the title of the page = Swag Labs
        assertEquals("Swag Labs", helloInternetPage.getTitle());
    }
}

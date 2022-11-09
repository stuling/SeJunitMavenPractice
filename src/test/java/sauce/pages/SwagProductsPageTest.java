package sauce.pages;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import sauce.pages.pom.base.BaseTest;
import sauce.pages.pom.pages.LoginPage;
import sauce.pages.pom.pages.ProductsPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwagProductsPageTest extends BaseTest {

    @Test
    public void checkTitleOfProductsPage() {

        driver.get("https://saucedemo.com/");
        LoginPage swagLoginPage = new LoginPage(driver);

        swagLoginPage.enterUserName("standard_user");
        swagLoginPage.enterPassword();
        swagLoginPage.clickLoginButton();

        ProductsPage swagProductsPage = new ProductsPage(driver);
        assertEquals("Swag Labs", swagProductsPage.getTitle());
    }

    @Test
    @Disabled
    public void checkShoppingCartLink() {

        driver.get("https://saucedemo.com/");
        LoginPage swagLoginPage = new LoginPage(driver);
        ProductsPage swagProductsPage = new ProductsPage(driver);

        swagLoginPage.enterUserName("standard_user");
        swagLoginPage.enterPassword();
        swagLoginPage.clickLoginButton();

        swagProductsPage.clickShoppingCart();

        assertEquals("Swag Labs", swagProductsPage.getTitle());
    }
}

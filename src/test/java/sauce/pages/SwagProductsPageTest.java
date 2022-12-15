package sauce.pages;

import heroku.pages.pom.pages.DropDownPage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
    public void checkProductsPageDropDownHas4Values() {

        driver.get("https://saucedemo.com/");
        LoginPage swagLoginPage = new LoginPage(driver);

        swagLoginPage.enterUserName("standard_user");
        swagLoginPage.enterPassword();
        swagLoginPage.clickLoginButton();

        // find the dropdown element by className
        WebElement dropdown = driver.findElement(By.className("product_sort_container"));

        // pass the dropdown WebElement into a Select class
        Select select = new Select(dropdown);

        // get the size of the list
        int dropdownSize = select.getOptions().size();

        assertEquals(4, dropdownSize);
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

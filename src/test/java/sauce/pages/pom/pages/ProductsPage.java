package sauce.pages.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sauce.pages.pom.base.BasePage;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    private WebElement findShoppingCartLink()
    {
        return driver.findElement(By.className("shopping_cart_link"));
    }

    public void clickShoppingCart() {
        findShoppingCartLink().click();
    }


}

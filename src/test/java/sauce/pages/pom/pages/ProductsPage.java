package sauce.pages.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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

    /**
     * Find the dropdown option list and click on an option
     * @param dropDownOption the name of the option to choose
     * @return a Select class to work with after clicking
     */
    public Select clickAndChooseDropDownOption(String dropDownOption) {
        // find the dropdown element by className
        WebElement dropdown = driver.findElement(By.className("product_sort_container"));

        // pass the dropdown WebElement into a Select class
        Select select = new Select(dropdown);
        select.selectByVisibleText(dropDownOption);

        return select;
    }

}

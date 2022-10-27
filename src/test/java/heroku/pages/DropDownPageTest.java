package heroku.pages;

import heroku.pages.pom.base.BaseTest;
import heroku.pages.pom.pages.DropDownPage;
import heroku.pages.pom.pages.HelloInternetPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test against the dropdown page, which
 * contains a simple dropdown list
 */
public class DropDownPageTest extends BaseTest {

    @Test
    void dropdownPageHasADropDown() {
        //Open the home landing page
        driver.get("https://the-internet.herokuapp.com/");

        HelloInternetPage helloInternetPage = new HelloInternetPage(driver);
        helloInternetPage.clickDropDownLink();

        // find the dropdown element
        WebElement dropdown = driver.findElement(By.id("dropdown"));

        assertEquals(true, dropdown.isDisplayed());
    }

    @Test
    void dropdownHas3Values() {
        //Open the home landing page
        driver.get("https://the-internet.herokuapp.com/");

        HelloInternetPage helloInternetPage = new HelloInternetPage(driver);
        helloInternetPage.clickDropDownLink();

        // find the dropdown element
        WebElement dropdown = driver.findElement(By.id("dropdown"));

        // pass the dropdown WebElement into a Select class
        Select select = new Select(dropdown);

        // get the size of the list
        int dropdownSize = select.getOptions().size();

        assertEquals(3, dropdownSize);
    }

    @Test
    void dropdownOption1IsSelected() {
        //Open the home landing page
        driver.get("https://the-internet.herokuapp.com/");

        HelloInternetPage helloInternetPage = new HelloInternetPage(driver);
        helloInternetPage.clickDropDownLink();

        DropDownPage dropDownPage = new DropDownPage(driver);
        Select select = dropDownPage.clickAndChooseDropDownOption("Option 1");

        String optionText = select.getFirstSelectedOption().getText();
        assertEquals("Option 1", optionText);
    }

}

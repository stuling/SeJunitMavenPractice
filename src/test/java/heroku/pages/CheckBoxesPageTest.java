package heroku.pages;

import heroku.pages.pom.base.BaseTest;
import heroku.pages.pom.pages.HelloInternetPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test against the Check Box page which
 * contains two simple check boxes
 */
public class CheckBoxesPageTest extends BaseTest {

    @Test
    void checkBoxesPageHasCheckBoxes () {
        //Open the home landing page
        driver.get("https://the-internet.herokuapp.com/");

        HelloInternetPage helloInternetPage = new HelloInternetPage(driver);
        helloInternetPage.clickCheckBoxesLink();

        // find the checkboxes form
        WebElement checkbox = driver.findElement(By.id("checkboxes"));

        assertEquals(true, checkbox.isDisplayed());
    }
}

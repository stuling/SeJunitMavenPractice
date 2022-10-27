package heroku.pages;

import heroku.pages.pom.base.BaseTest;
import heroku.pages.pom.pages.HelloInternetPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


import static org.junit.jupiter.api.Assertions.*;

class HelloInternetPageTest extends BaseTest {

    @Test
    void checkTitleOfPage() {
        //Open the URL
        driver.get("https://the-internet.herokuapp.com/");

        //Assert that the title of the page = The Internet
        assertEquals("The Internet", driver.getTitle());
    }

    @Test
    void checkBoxesLinkGoesToCheckBoxesPage() {
        //Open the URL
        driver.get("https://the-internet.herokuapp.com/");

        HelloInternetPage helloInternetPage = new HelloInternetPage(driver);
        helloInternetPage.clickCheckBoxesLink();

        String checkBoxesPageTitle = driver.findElement(By.cssSelector("#content > div > h3")).getText();
        //Assert that the H3 text = Checkboxes
        assertEquals("Checkboxes", checkBoxesPageTitle);
    }

    @Test
    void dropdownLinkGoesToDropdownPage() {
        //Open the URL
        driver.get("https://the-internet.herokuapp.com/");

        HelloInternetPage helloInternetPage = new HelloInternetPage(driver);
        helloInternetPage.clickDropDownLink();

        String dropdownPageTitle = driver.findElement(By.cssSelector("#content > div > h3")).getText();
        //Assert that the H3 text = Dropdown List
        assertEquals("Dropdown List", dropdownPageTitle);
    }
}
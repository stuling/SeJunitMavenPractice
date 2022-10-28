package heroku.pages;

import heroku.pages.pom.base.BaseTest;
import heroku.pages.pom.pages.EntryAdPage;
import heroku.pages.pom.pages.HelloInternetPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntryAdPageTest extends BaseTest {

    @Test
    public void checkModalWindowIsDisplayedonPageLoad () {
        driver.get("https://the-internet.herokuapp.com/");

        HelloInternetPage helloInternetPage = new HelloInternetPage(driver);
        helloInternetPage.clickEntryAdLink();

        EntryAdPage entryAdPage = new EntryAdPage(driver);

//        assertEquals("display: block;", entryAdPage.getModalWindowStyle());
        assertEquals(true, entryAdPage.isModalWindowRendered());

    }

    @Test
    public void checkModalWindowIsDismissedOnButtonClick () {
        driver.get("https://the-internet.herokuapp.com/");

        HelloInternetPage helloInternetPage = new HelloInternetPage(driver);
        helloInternetPage.clickEntryAdLink();

        EntryAdPage entryAdPage = new EntryAdPage(driver);
        entryAdPage.clickModalWindowButton();

        assertEquals(false, entryAdPage.isModalWindowRendered());

    }

}

package heroku.pages.pom.pages;

import heroku.pages.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * The driver in the BasePage is set in
 * the HelloInternetPage. This page only contains
 * a bunch of links
 */
public class HelloInternetPage  extends BasePage {

    public HelloInternetPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Click the 'Checkboxes' link
     * using clickLinkByHref() to prove it can work.
     * Might change to By.cssSelector later
     */
    public void clickCheckBoxesLink() {

        //driver.findElement(By.cssSelector("#content > ul > li:nth-child(6) > a")).click();
        clickLinkByHref("/checkboxes");
    }


    /**
     * Click the 'Dropdown' link
     * using By.cssSelector for now.
     * might refactor to clickLinkByHref() later
     */
    public void clickDropDownLink() {

        driver.findElement(By.cssSelector("#content > ul > li:nth-child(11) > a")).click();
        //clickLinkByHref("/dropdown");
    }
}

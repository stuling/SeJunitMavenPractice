package heroku.pages.pom.pages;

import heroku.pages.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


/**
 * The driver in the BasePage is set in
 * the HelloInternetPage. This page class clicks on
 * links using (1) By.cssSelector, (2) By.linkTest
 * and (3) clickLinkByHref() from BasePage
 */
public class HelloInternetPage  extends BasePage {

    public HelloInternetPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    /**
     * Click the 'Checkboxes' link
     * using clickLinkByHref() to prove it can work.
     */
    public void clickCheckBoxesLink() {

        //driver.findElement(By.cssSelector("#content > ul > li:nth-child(6) > a")).click();
        clickLinkByHref("/checkboxes");
    }

    /**
     * Click the 'Dropdown' link
     * using By.linkText
     */
    public void clickDropDownLink() {

        driver.findElement(By.linkText("Dropdown")).click();
        //driver.findElement(By.cssSelector("#content > ul > li:nth-child(11) > a")).click();
        //clickLinkByHref("/dropdown");
    }

    /**
     * Click the 'Entry Ad' link
     * using By.cssSelector.
     * This page will display a modal window
     */
    public void clickEntryAdLink() {

        driver.findElement(By.cssSelector("#content > ul > li:nth-child(15) > a")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("modal")));

    }

}

package heroku.pages.pom.pages;

import heroku.pages.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * The Entry Ad page throws up a modal window
 * that needs to be dealt with
 */
public class EntryAdPage extends BasePage {

    public EntryAdPage(WebDriver driver) {
        super(driver);
    }

    /**
     * used to determine whether the modal window
     * is rendered or not.
     * @return String "display: block;" if window is rendered
     *                "display: none;" if window is not rendered
     */
    public String getModalWindowStyle() {

        WebElement modalContainer = driver.findElement(By.id("modal"));

        return modalContainer.getAttribute("style");
    }

    /**
     * used to determine whether the modal window
     * is rendered or not. Set in the display property
     * of the style element.
     * @return true if window is rendered
     */
    public boolean isModalWindowRendered() {

        WebElement modalContainer = driver.findElement(By.id("modal"));
        String rendered = modalContainer.getAttribute("style");

        return (rendered.matches("display: block;"));
    }

    public void clickModalWindowButton() {

        WebElement modalContainer = driver.findElement(By.id("modal"));
        WebElement modalButton = modalContainer.findElement(By.cssSelector("#modal > div.modal > div.modal-footer > p"));

        modalButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

    }

}

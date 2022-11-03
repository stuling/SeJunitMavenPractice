package sauce.pages.pom;

import heroku.pages.pom.factory.DriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void startDriver() {
        driver = new DriverManager().initializeChromeDriver();
    }

    @AfterEach
    public void quitDriver() {
        driver.quit();
    }
}

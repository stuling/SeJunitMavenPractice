package sauce.pages.pom.base;

import sauce.pages.pom.factory.DriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

/**
 * Note: This BaseTest class uses Edge driver, instead of Chrome driver
 */
public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void startDriver() {
        driver = new DriverManager().initializeEdgeDriver();
    }

    @AfterEach
    public void quitDriver() {
        driver.quit();
    }
}

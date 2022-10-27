package heroku.pages.pom.base;

import heroku.pages.pom.factory.DriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    // 'protected' so only classes that inherit from BaseTest will be
    // able to see the driver
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

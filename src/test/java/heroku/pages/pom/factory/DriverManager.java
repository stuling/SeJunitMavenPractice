package heroku.pages.pom.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    /**
     * Initialize a Chrome driver
     * @return a WebDriver object
     */
    public WebDriver initializeChromeDriver() {

        // Use WebDriverManager Maven package to download the correct
        // version of Chrome browser to use in tests
        WebDriverManager.chromedriver().setup();

        //Set variable driver to an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        return driver;
    }
}

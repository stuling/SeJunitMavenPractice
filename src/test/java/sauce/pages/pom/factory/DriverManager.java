package sauce.pages.pom.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverManager {

    /**
     * Initialize a Edge driver
     * @return a WebDriver object
     */
    public WebDriver initializeEdgeDriver() {

        // Use WebDriverManager Maven package to download the correct
        // version of Edge browser to use in tests
        WebDriverManager.edgedriver().setup();

        //Set variable driver to an instance of EdgeDriver
        WebDriver driver = new EdgeDriver();

        return driver;
    }
}

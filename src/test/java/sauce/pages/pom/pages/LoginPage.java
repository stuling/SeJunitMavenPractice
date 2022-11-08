package sauce.pages.pom.pages;

import org.openqa.selenium.WebDriver;
import sauce.pages.pom.base.BasePage;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle(){
        return driver.getTitle();
    }
}

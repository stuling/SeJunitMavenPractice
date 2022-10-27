package heroku.pages.pom.pages;

import heroku.pages.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * The Dropdown page contains a
 * dropdown list
 */
public class DropDownPage extends BasePage {

    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Find the dropdown option list and click on an option
     * @param dropDownOption the name of the option to choose
     * @return a Select class to work with after clicking
     */
    public Select clickAndChooseDropDownOption(String dropDownOption) {
        // find the dropdown element
        WebElement dropdown = driver.findElement(By.id("dropdown"));

        // pass the dropdown WebElement into a Select class
        Select select = new Select(dropdown);
        select.selectByVisibleText(dropDownOption);

        return select;
    }
}

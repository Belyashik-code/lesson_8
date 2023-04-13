package pages;

import helper.Browser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

    public Base(Browser browser) {
        this.browser = browser;
        driver = browser._driver;
        PageFactory.initElements(driver, this);
    }


    public Boolean elemIsPresent(WebElement elem) {
        return elem.isDisplayed();
    }

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Browser browser;
    protected static int DURATION = 5000;
}

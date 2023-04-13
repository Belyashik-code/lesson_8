package tests;

import helper.Browser;
import org.testng.annotations.*;
import pages.DynamicIDPage;

public class HomePageTests {

    Browser browser;

    @Test()
    public void searchTest() {
        browser = new Browser("JavaLearning_8", "http://uitestingplayground.com/");
        browser.navigateToBaseUrl();
        browser.MenuPage().Click_dynamicId();
        DynamicIDPage dynamicTestPage = new DynamicIDPage(browser);
        dynamicTestPage.ClickDynamicIDButton();
    }

    @AfterClass()
    public void tearDown() {
        browser._driver.quit();
    }

}

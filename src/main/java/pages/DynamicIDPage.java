package pages;

import helper.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DynamicIDPage extends Base {
    public DynamicIDPage(Browser browser) {
        super(browser);
    }

    public void ClickDynamicIDButton(){
        browser.logger.info("Click Dyniamic ID Button");
        DynamicIDButton.click();
    }

    @FindBy(xpath = "//button[text()='Button with Dynamic ID']")
    private WebElement DynamicIDButton;
}

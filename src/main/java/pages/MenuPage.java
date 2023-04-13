package pages;
import helper.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MenuPage extends Base {
    public MenuPage(Browser browser) {
        super(browser);
    }

    @FindBy(xpath = "//a[@href='/dynamicid']")
    private WebElement DynamicIDMenuButton;

    public void Click_dynamicId(){
        browser.logger.info("Choose DynamicButtonIdTest");
        this.DynamicIDMenuButton.click();
    }

}

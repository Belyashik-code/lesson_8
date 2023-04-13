package helper;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MenuPage;


public class Browser {

    public final Logger logger = Logger.getLogger(Browser.class);

    public Browser(String browserName, String baseUrl) {
        logger.info("Устанавливаю значение для browserName: "+browserName);
        setBrowser(browserName);
        logger.info("Устанавливаю значение для baseUrl: "+baseUrl);
        setBaseUrl(baseUrl);
        logger.info("Заупскаю вебдрайвер");
        Initialise(getBrowser());
    }

    private void Initialise(String browser) {
        capabilities = new DesiredCapabilities();
        seleniumFolderPath = System.getProperty("user.home") + "/IdeaProjects/Lesson_8/src/main/java/helper/";
        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--disable-geolocation");
        chrome_options.addArguments("--incognito");
        System.setProperty("webdriver.chrome.driver", seleniumFolderPath + "chromeDriver");
        capabilities.setBrowserName("chrome");
        capabilities.setCapability(ChromeOptions.CAPABILITY, chrome_options);
        driver = new ChromeDriver();
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void navigateToBaseUrl() {
        driver.get(getBaseUrl());
    }

    public String getBrowser() {
        return this.browserName;
    }

    private void setBrowser(String browserName) {
        this.browserName = browserName;
    }

    private void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public MenuPage MenuPage() {
        if (menuPage == null) {
            menuPage = new MenuPage(this);
        }
        return menuPage;
    }

    // Public properties
    public WebDriver driver;

    // Private properties
    private DesiredCapabilities capabilities;
    private String browserName;
    private String baseUrl;
    private String seleniumFolderPath;
    private MenuPage menuPage;
}

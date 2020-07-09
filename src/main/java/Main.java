import PageObjects.ChromePage;
import PageObjects.SitePageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Main {

    private static WebDriver driver;
    private static ChromePage chromePage;
    private static SitePageObject sitePageObject;

    public static void main(String[] args) {
        initWebDriver();
        initPages();

        openSite();
        Logic mainLogin = new Logic(driver);
        mainLogin.execute();


    }


    private static void initPages() {
        chromePage = new ChromePage(driver);

    }

    private static void initWebDriver() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "device");
            capabilities.setCapability("platformVersion", "7.1");
            capabilities.setCapability("platformName", "Android");
            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void openSite() {
        chromePage.chromeApp().click();
        chromePage.chromeUrlBar().sendKeys("https://www.twoo.com/?login=0#login");
        chromePage.siteUrl().click();

    }
}

import PageObjects.SitePageObject;
import org.openqa.selenium.WebDriver;

public class Logic {
    private static SitePageObject sitePageObject;
    private static WebDriver driver;

    public Logic(WebDriver driver) {
        this.driver = driver;
    }

    public void execute() {
        sitePageObject = new SitePageObject(driver);

        enterCredentials();
    }

    private static void enterCredentials() {
        sitePageObject.name().sendKeys(Utils.randomName());
    }
}

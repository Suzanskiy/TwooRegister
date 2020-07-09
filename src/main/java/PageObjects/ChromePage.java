package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChromePage {
    WebDriver driver;

    public ChromePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getObject(By selector) {
        return driver.findElement(selector);
    }

    //XPATH selectors
    private By chromePathSelector() {
        return By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[4]");
    }

    private By chromeUpdeteSelector() {
        return By.xpath("//android.widget.ImageButton[@content-desc=\"Обновить страницу\"]");
    }

    private By chromeUrlBarSelector() {
        return By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.EditText");
    }

    private By SiteUrlSelector() {
        return By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[2]");
    }

    //WebElements
    public WebElement chromeApp() {
        return getObject(chromePathSelector());
    }

    public WebElement chromeUrlBar() {
        return getObject(chromeUrlBarSelector());
    }

    public WebElement updateBtn() {
        return getObject(chromeUpdeteSelector());
    }

    public WebElement siteUrl() {
        return getObject(SiteUrlSelector());
    }

}

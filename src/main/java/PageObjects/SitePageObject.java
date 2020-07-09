package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SitePageObject {
    WebDriver driver;

    public SitePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getObject(By selector) {
        return driver.findElement(selector);
    }

    //SElECTORS
    private By nameSelector() {
        return By.id("1d8a724a-e39a-44b1-8be7-df3035b6fa5a");
    }

    //WEB ELEMENTS

    public WebElement name() {
        return getObject(nameSelector());
    }
}

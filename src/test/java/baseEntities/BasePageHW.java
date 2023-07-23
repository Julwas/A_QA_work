package baseEntities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.configuration.ReadProperties;

public abstract class BasePageHW {
    protected static WebDriver driver;

    public BasePageHW(WebDriver driver) {
        this.driver = driver;
    }

    public void openPageByUrl(String pagePath) {
        driver.get(ReadProperties.getUrl() + pagePath);
    }
    protected abstract By getPageIdentifier();
    public boolean isPageOpened() {
        return driver.findElement(getPageIdentifier()).isDisplayed();
        }
}

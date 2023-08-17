package baseEntities;

import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import service.WaitService;


public abstract class BasePage {
    protected WebDriver driver;
    protected WaitService waitsService;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        waitsService = new WaitService(driver);
    }

    protected abstract By getPageIdentifier();

    public boolean isPageOpened() {
        return waitsService.waitForVisibilityBy(getPageIdentifier()).isDisplayed();
    }

    public void openPageByUrl(String pagePath) {
        driver.get(ReadProperties.getUrl() + pagePath);
    }
}

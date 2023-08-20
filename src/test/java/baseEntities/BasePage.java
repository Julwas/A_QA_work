package baseEntities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.configuration.ReadProperties;

import static com.codeborne.selenide.Selenide.$;

public abstract class BasePage {

    public static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPageByUrl(String pagePath) {
        driver.get(ReadProperties.getUrl() + pagePath);
    }
    protected abstract By getPageIdentifier();
    public boolean isPageOpened() {
        return $(getPageIdentifier()).isDisplayed();
    }
}


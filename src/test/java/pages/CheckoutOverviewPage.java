package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutOverviewPage extends BasePage {

    private final static String pagePath = "/checkout-step-two.html";

    //блок описания локаторов

    private final By headerCheckoutOverviewLocator = By.xpath("//*[@id='header_container']/div[2]/span");
    private final By finishCheckoutButtonLocator = By.id("finish");

    // Блок инициализации
    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
    }
    public void openPageByUrl(){
        super.openPageByUrl(pagePath);
    }

    @Override
    protected By getPageIdentifier() {
        return finishCheckoutButtonLocator;
    }

    //блок атомарных методов

    public WebElement getHeaderCheckoutOverview() {
        return $(headerCheckoutOverviewLocator);
    }

    public WebElement getFinishCheckoutButton() {
        return $(finishCheckoutButtonLocator);
    }
}

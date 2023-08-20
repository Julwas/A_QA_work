package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutCompletePage extends BasePage {
    private final static String pagePath = "checkout-complete.html";

    //блок описания локаторов
    private final By headerCheckoutCompleteTitleLocator = By.xpath("//*[@id='header_container']/div[2]/span");
    private final By thanYouMessageLocator = By.className("complete-header");
    private final By backHomeButtonLocator = By.id("back-to-products");

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }

    public void openPageByUrl(){
        super.openPageByUrl(pagePath);
    }

    @Override
    protected By getPageIdentifier() {
        return backHomeButtonLocator;
    }

    //блок атомарных методов

    public WebElement getHeaderCheckoutCompleteTitle() {
        return $(headerCheckoutCompleteTitleLocator);
    }

    public WebElement getBackHomeButton() {
        return $(backHomeButtonLocator);
    }

    public WebElement getThanYouMessage() {
        return $(thanYouMessageLocator);
    }
}

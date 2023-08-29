package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutCompletePage extends BasePage {
    private final static String pagePath = "checkout-complete.html";

    //блок описания локаторов
    private final By headerCheckoutCompleteTitleLocator = By.xpath("//*[@id='header_container']/div[2]/span");
    private final By thanYouMessageLocator = By.className("complete-header");
    private final By backHomeButtonLocator = By.id("back-to-products");

    public CheckoutCompletePage() {
        super();
    }

    public void openPageByUrl(){
        super.openPageByUrl(pagePath);
    }

    @Override
    protected By getPageIdentifier() {
        return backHomeButtonLocator;
    }

    //блок атомарных методов

    public SelenideElement getHeaderCheckoutCompleteTitle() {
        return $(headerCheckoutCompleteTitleLocator);
    }

    public SelenideElement getBackHomeButton() {
        return $(backHomeButtonLocator);
    }

    public SelenideElement getThanYouMessage() {
        return $(thanYouMessageLocator);
    }
}

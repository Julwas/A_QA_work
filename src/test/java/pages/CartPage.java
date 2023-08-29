package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPage extends BasePage {

    private final static String pagePath = "cart.html";

    //блок описания локаторов
    private final By headerCartTitleLocator = By.xpath("//span[@class='title']");
    private final By checkoutButtonLocator = By.id("checkout");

    // Блок инициализации
    public CartPage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return checkoutButtonLocator;
    }
    public void openPageByUrl(){
        super.openPageByUrl(pagePath);
    }

    //блок атомарных методов

    public SelenideElement getHeaderCartTitle() {
        return $(headerCartTitleLocator);
    }

    public SelenideElement getCheckoutButton() {
        return $(checkoutButtonLocator);
    }
}

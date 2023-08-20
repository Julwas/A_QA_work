package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class CartPage extends BasePage {

    private final static String pagePath = "cart.html";

    //блок описания локаторов
    private final By headerCartTitleLocator = By.xpath("//span[@class='title']");
    private final By checkoutButtonLocator = By.id("checkout");

    // Блок инициализации
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return checkoutButtonLocator;
    }
    public void openPageByUrl(){
        super.openPageByUrl(pagePath);
    }

    //блок атомарных методов

    public WebElement getHeaderCartTitle() {
        return $(headerCartTitleLocator);
    }

    public WebElement getCheckoutButton() {
        return $(checkoutButtonLocator);
    }
}

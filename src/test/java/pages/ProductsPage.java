package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class ProductsPage extends BasePage {
    private final static String pagePath = "/inventory.html";

    //блок описания локаторов
    private static final By headerTitleLocator = By.className("title");
    private static final By addToCartButtonLocator = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    private static final By shoppingCartLocator = By.id("shopping_cart_container");

    // Блок инициализации
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void openPageByUrl(){
        super.openPageByUrl(pagePath);
    }
    @Override
    public By getPageIdentifier() {
        return headerTitleLocator;
    }

    //блок атомарных методов
    public static WebElement getHeaderTitle() {
        return $(headerTitleLocator);
    }

    public static WebElement getAddToCartButton() {
        return $(addToCartButtonLocator);
    }

    public static WebElement getShoppingCart() {
        return $(shoppingCartLocator);
    }
    //блок комплексных методов
    public void getProducts(){
        getAddToCartButton().click();
        getShoppingCart().click();
    }
}

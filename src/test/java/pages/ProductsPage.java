package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductsPage extends BasePage {
    private final static String pagePath = "/inventory.html";

    //блок описания локаторов
    private static final By headerTitleLocator = By.className("title");
    private static final By addToCartButtonLocator = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    private static final By shoppingCartLocator = By.id("shopping_cart_container");

    // Блок инициализации
    public ProductsPage() {
        super();
    }

    public void openPageByUrl(){
        super.openPageByUrl(pagePath);
    }
    @Override
    public By getPageIdentifier() {
        return headerTitleLocator;
    }

    //блок атомарных методов
    public static SelenideElement getHeaderTitle() {
        return $(headerTitleLocator);
    }

    public static SelenideElement getAddToCartButton() {
        return $(addToCartButtonLocator);
    }

    public static SelenideElement getShoppingCart() {
        return $(shoppingCartLocator);
    }
    //блок комплексных методов
    public void getProducts(){
        getAddToCartButton().click();
        getShoppingCart().click();
    }
}

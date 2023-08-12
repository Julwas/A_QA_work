package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage {
    private final static String pagePath = "/inventory.html";

    //блок описания локаторов
    private final By headerTitleLocator = By.className("title");
    private final By addToCartButtonLocator = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    private  final By shoppingCartLocator = By.id("shopping_cart_container");

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
    public WebElement getHeaderTitle() {
        return driver.findElement(headerTitleLocator);
    }

    public  WebElement getAddToCartButton() {
        return driver.findElement(addToCartButtonLocator);
    }

    public  WebElement getShoppingCart() {
        return driver.findElement(shoppingCartLocator);
    }
    //блок комплексных методов
    public ProductsPage clickAddToCart() {
        getAddToCartButton().click();
        return this;
    }

    public CartPage clickShoppingCart() {
        getShoppingCart().click();
        return new CartPage(driver);
    }

}

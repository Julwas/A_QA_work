package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {
    private final static String pagePath = "/inventory.html";

    //блок описания локаторов
    @FindBy(className = "title")
    public WebElement headerTitle;
    @FindBy(id ="add-to-cart-test.allthethings()-t-shirt-(red)" )
    public WebElement addToCartButton;
    @FindBy(id = "shopping_cart_container")
    public WebElement shoppingCart;

    // Блок инициализации
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void openPageByUrl(){
        super.openPageByUrl(pagePath);
    }
    @Override
    public By getPageIdentifier() {
        return By.className("title");
    }

    //блок комплексных методов
    public void getProducts(){
       addToCartButton.click();
       shoppingCart.click();
    }
}

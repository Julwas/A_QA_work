package Steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.ProductsPage;

public class ProductsStep extends BaseStep {
    public ProductsStep(WebDriver driver) {
        super(driver);
    }

    public ProductsPage AddToCart() {
        ProductsPage.getAddToCartButton().click();

        return productsPage;

    }
    public ProductsPage HeaderTitle(){
        ProductsPage.getHeaderTitle().click();

        return productsPage;

    }
    public ProductsPage ShoppingCart(){
        ProductsPage.getShoppingCart().click();

        return productsPage;

    }
}

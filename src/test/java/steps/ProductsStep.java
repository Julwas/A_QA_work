package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.CartPage;

public class ProductsStep extends BaseStep {
    public ProductsStep(WebDriver driver) {
        super(driver);
    }

    public CartPage AddProducts() {
        productsPage.getProducts();

        return cartPage;

    }
}

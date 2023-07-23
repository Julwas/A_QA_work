package Steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.ProductsPage;

public class ProductsStep extends BaseStep {
    public ProductsStep(WebDriver driver) {
        super(driver);
    }

    public CartPage AddProdusts() {
        productsPage.getProducts();

        return cartPage;

    }


}

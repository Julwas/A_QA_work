package steps;

import baseEntities.BaseStep;
import pages.CartPage;

public class ProductsStep extends BaseStep {
    public ProductsStep() {
        super();
    }

    public CartPage AddProducts() {
        productsPage.getProducts();

        return cartPage;
    }
}

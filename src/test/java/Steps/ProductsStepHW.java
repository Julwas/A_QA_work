package Steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CartPageHW;

public class ProductsStepHW extends BaseStepHW {
    public ProductsStepHW(WebDriver driver) {
        super(driver);
    }

    public CartPageHW AddProdusts() {
        productsPage.getProducts();

        return cartPage;

    }


}

package Steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.CartPage;

public class CartStep extends BaseStep {

    public CartStep(WebDriver driver) {
        super(driver);
    }
    public CartPage CheckoutButton(){
        cartPage.getCheckoutButton().click();

        return cartPage ;
    }


}

package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.CheckoutOverviewPage;

public class CheckoutStep extends BaseStep {

    public CheckoutStep(WebDriver driver) {
        super(driver);
    }
    public CheckoutOverviewPage getYourData(String firstname, String lastname, String zip){
        checkoutInfoPage.inputYourData(firstname,lastname,zip);

        return checkoutOverviewPage;
    }
}

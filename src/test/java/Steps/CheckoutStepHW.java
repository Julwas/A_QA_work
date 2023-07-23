package Steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.CheckoutOverviewPageHW;

public class CheckoutStepHW extends BaseStepHW {

    public CheckoutStepHW(WebDriver driver) {
        super(driver);
    }
    public CheckoutOverviewPageHW getYourData(String firstname, String lastname, String zip){
        checkoutInfoPage.inputYourData(firstname,lastname,zip);

        return checkoutOverviewPage;
    }
}

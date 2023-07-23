package Steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.CheckoutInfoPage;

public class CheckoutInfoStep extends BaseStep {

    public CheckoutInfoStep(WebDriver driver) {
        super(driver);
    }
    public CheckoutInfoPage inputYourData(){
        checkoutInfoPage.inputYourData();
        return checkoutInfoPage;
    }
    public CheckoutOverviewPage Submit(){
        checkoutOverviewPage.getSubmit();
        return checkoutOverviewPage;
    }
}

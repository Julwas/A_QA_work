package steps;

import baseEntities.BaseStep;
import pages.CheckoutOverviewPage;


public class CheckoutStep extends BaseStep {

    public CheckoutStep() {
        super();
    }
    public CheckoutOverviewPage getYourData(String firstname, String lastname, String zip){
        checkoutInfoPage.inputYourData(firstname,lastname,zip);

        return checkoutOverviewPage;
    }

}

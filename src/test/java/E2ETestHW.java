import baseEntities.BaseTestHW;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPageHW;
import pages.CheckoutCompletePageHW;
import pages.CheckoutOverviewPageHW;
import pages.ProductsPageHW;
import utils.configuration.ReadProperties;

public class E2ETestHW extends BaseTestHW {


    @Test
    public void E2ETest() {
        Assert.assertTrue(loginStep.successLogin(ReadProperties.username(), ReadProperties.password()
        ).isPageOpened());
        Assert.assertTrue(productsStep.AddProdusts().isPageOpened());

        CartPageHW cartPage = new CartPageHW(driver);
        cartPage.getCheckoutButton().click();

        Assert.assertTrue(checkoutStep.getYourData(ReadProperties.firstname,
                ReadProperties.lastname(), ReadProperties.zip()).isPageOpened());

        CheckoutOverviewPageHW checkoutOverviewPage = new CheckoutOverviewPageHW(driver);
        checkoutOverviewPage.getFinishCheckoutButton().click();

        CheckoutCompletePageHW checkoutCompletePage =new CheckoutCompletePageHW(driver);
        checkoutCompletePage.getBackHomeButton().click();
        Assert.assertTrue(new ProductsPageHW(driver).isPageOpened());
    }
}

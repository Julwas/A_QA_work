import baseEntities.BaseTest;
import models.SwagLabs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutCompletePage;
import pages.CheckoutOverviewPage;
import pages.ProductsPage;
import utils.configuration.ReadProperties;

import static models.SwagLabs.*;

public class E2ETest extends BaseTest {
    Logger logger = LogManager.getLogger(E2ETest.class);

    @Test
    public void E2ETest() {

        Assert.assertTrue(loginStep.successLogin(ReadProperties.username(), ReadProperties.password()
        ).isPageOpened());
        Assert.assertTrue(productsStep.AddProducts().isPageOpened());

        CartPage cartPage = new CartPage(driver);
        cartPage.checkoutButton.click();

        checkoutStep.getYourData(ReadProperties.firstname(),
                ReadProperties.lastname(), ReadProperties.zip()).isPageOpened();

        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
        checkoutOverviewPage.finishCheckoutButton.click();

        CheckoutCompletePage checkoutCompletePage =new CheckoutCompletePage(driver);
        checkoutCompletePage.backHomeButton.click();
        Assert.assertTrue(new ProductsPage(driver).isPageOpened());

       logger.info("message");
    }
    @Test
    public void buildTest(){
        SwagLabs swagLabs = builder()
                .username("standard_user")
                .password("secret_sauce")
                .addProduct(true)
                .addProduct(true)
                .checkout(true)
                .firstName("Julia")
                .lastName("Wasilewska")
                .zipCode("12345")

                .build();
        logger.info("message");

    }
}

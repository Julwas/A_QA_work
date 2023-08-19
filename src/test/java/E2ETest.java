import baseEntities.BaseTest;
import models.SwagLabs;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutCompletePage;
import pages.CheckoutOverviewPage;
import pages.ProductsPage;
import utils.configuration.ReadProperties;

import static models.SwagLabs.*;

public class E2ETest extends BaseTest {

    @Test
    public void E2ETest() {

        Assert.assertTrue(loginStep.successLogin(ReadProperties.username(), ReadProperties.password()
        ).isPageOpened());
        Assert.assertTrue(productsStep.AddProducts().isPageOpened());

        CartPage cartPage = new CartPage(driver);
        cartPage.getCheckoutButton().click();

        checkoutStep.getYourData(ReadProperties.firstname(),
                ReadProperties.lastname(), ReadProperties.zip()).isPageOpened();

        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
        checkoutOverviewPage.getFinishCheckoutButton().click();

        CheckoutCompletePage checkoutCompletePage =new CheckoutCompletePage(driver);
        checkoutCompletePage.getBackHomeButton().click();
        Assert.assertTrue(new ProductsPage(driver).isPageOpened());

    }
    @Test
    public void buildTest(){
        SwagLabs swagLabs = new SwagLabs.Builder()
                .withUsername("standard_user")
                .withPassword("secret_sauce")
                .withAddProduct(true)
                .withShoppingCart(true)
                .withCheckout(true)
                .withFirstName("Julia")
                .withLastName("Wasilewska")
                .withZipCode("12345")

                .build();
    }
}

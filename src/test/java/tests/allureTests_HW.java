package tests;

import baseEntities.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutCompletePage;
import pages.CheckoutOverviewPage;
import pages.ProductsPage;
import utils.configuration.ReadProperties;

public class allureTests_HW extends BaseTest {

   @Test(description = "End to end test by product.")
   @Description("Verifies the entire process of purchasing an item on the website.")
   @Severity(SeverityLevel.CRITICAL)
    public void Test1() {
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
    @Test(description = "Successful login test.")
    @Description("Test with correct login and correct password.")
    @Severity(SeverityLevel.MINOR)
    public void Test2() {
        Assert.assertTrue(
                loginStep.successLogin("standard_user", ReadProperties.password()).isPageOpened());
    }
    @Test(description = "Not successful login test.")
    @Description("Test with wrong login and correct password.")
    @Severity(SeverityLevel.NORMAL)
    public void Test3() {
        Assert.assertTrue(
                loginStep.successLogin("standarb_user", ReadProperties.password()).isPageOpened());
    }
}

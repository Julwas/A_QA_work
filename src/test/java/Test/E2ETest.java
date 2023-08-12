package Test;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.configuration.ReadProperties;

public class E2ETest extends BaseTest {

    @Test
    public void E2ETest() {

     new LoginPage(driver)
             .setEmail(ReadProperties.username())
             .setPassword(ReadProperties.password())
             .clickLogIn()
             .clickAddToCart()
             .clickShoppingCart()
             .clickCheckout().getFirstName()
             .geLastName()
             .getZipCode()
             .clickContinueButton()
             .clickFinishCheckout()
             .thankYouMessage().clickHomeButton();

        Assert.assertTrue(new ProductsPage(driver).isPageOpened());

        }
}

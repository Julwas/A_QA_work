package tests;

import baseEntities.BaseTest;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class E2ETest extends BaseTest {


        @Test
        public void E2ETest() {
            loginStep.successLogin(ReadProperties.username(),ReadProperties.password()
            ).isPageOpened();
            productsStep.AddProducts().isPageOpened();
            cartPage.getCheckoutButton().click();
            checkoutStep.getYourData(ReadProperties.firstname(),
                    ReadProperties.lastname(), ReadProperties.zip()).isPageOpened();
            checkoutOverviewPage.getFinishCheckoutButton().click();
            checkoutCompletePage.getBackHomeButton().click();
        }

}

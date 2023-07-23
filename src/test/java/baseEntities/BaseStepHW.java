package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStepHW {
    protected WebDriver driver;

    protected LoginPageHW loginPage;
    protected ProductsPageHW productsPage;
    protected CartPageHW cartPage;
    protected CheckoutInfoPageHW checkoutInfoPage;
    protected CheckoutOverviewPageHW checkoutOverviewPage;
    protected CheckoutCompletePageHW checkoutCompletePage;;



    public BaseStepHW(WebDriver driver) {
        this.driver = driver;

        loginPage = new LoginPageHW(driver);
        productsPage = new ProductsPageHW(driver);
        cartPage = new CartPageHW(driver);
        checkoutInfoPage  = new CheckoutInfoPageHW(driver);
        checkoutOverviewPage = new CheckoutOverviewPageHW(driver);
        checkoutCompletePage = new CheckoutCompletePageHW(driver);

    }
}

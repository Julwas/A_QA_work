package baseEntities;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CartPage;
import pages.CheckoutCompletePage;
import pages.CheckoutOverviewPage;
import steps.CheckoutStep;
import steps.LoginStep;
import steps.ProductsStep;
import utils.configuration.ReadProperties;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    protected LoginStep loginStep;
    protected ProductsStep productsStep;
    protected CheckoutStep checkoutStep;
    protected CartPage cartPage;
    protected CheckoutOverviewPage checkoutOverviewPage;
    protected CheckoutCompletePage checkoutCompletePage;

    @BeforeMethod
    public void setUp() {
        Configuration.baseUrl = ReadProperties.getUrl();
        Configuration.timeout = 8000;


        loginStep = new LoginStep();
        productsStep = new ProductsStep();
        checkoutStep = new CheckoutStep();
        cartPage = new CartPage();
        checkoutOverviewPage = new CheckoutOverviewPage();
        checkoutCompletePage = new CheckoutCompletePage();

        open(ReadProperties.getUrl());
    }
    @AfterMethod
    public void tearDown() {// сloses the browser in case of an error
        closeWebDriver();
    }



}

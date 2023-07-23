package baseEntities;

import Steps.*;
import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;
import utils.configuration.ReadProperties;

public class BaseTest {
    protected WebDriver driver;
    protected LoginStep loginStep;
    protected ProductsStep productsStep;
    protected CartStep cartStep;
    protected CheckoutInfoStep checkoutInfoStep;
    protected CheckoutOverviewStep checkoutOverviewStep;
    protected CheckoutCompleteStep checkoutCompleteStep;



    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();

        loginStep = new LoginStep(driver);
        productsStep = new ProductsStep(driver);
        cartStep = new CartStep(driver);
        checkoutInfoStep  = new CheckoutInfoStep(driver);
        checkoutOverviewStep = new CheckoutOverviewStep(driver);
        checkoutCompleteStep = new CheckoutCompleteStep(driver);


        driver.get(ReadProperties.getUrl());
    }
    @AfterMethod
    public void tearDown() {// сloses the browser in case of an error
        driver.quit();
    }



}

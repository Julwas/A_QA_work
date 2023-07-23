package baseEntities;

import Steps.*;
import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.configuration.ReadProperties;

public class BaseTest {
    protected WebDriver driver;
    protected LoginStep loginStep;
    protected ProductsStep productsStep;
    protected CheckoutStep checkoutStep;




    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();

        loginStep = new LoginStep(driver);
        productsStep = new ProductsStep(driver);
        checkoutStep = new CheckoutStep(driver);



        driver.get(ReadProperties.getUrl());
    }
    @AfterMethod
    public void tearDown() {// сloses the browser in case of an error
        driver.quit();
    }



}

package baseEntities;

import Steps.*;
import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.configuration.ReadProperties;

public class BaseTestHW {
    protected WebDriver driver;
    protected LoginStepHW loginStep;
    protected ProductsStepHW productsStep;
    protected CheckoutStepHW checkoutStep;




    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();

        loginStep = new LoginStepHW(driver);
        productsStep = new ProductsStepHW(driver);
        checkoutStep = new CheckoutStepHW(driver);



        driver.get(ReadProperties.getUrl());
    }
    @AfterMethod
    public void tearDown() {// сloses the browser in case of an error
        driver.quit();
    }



}

package baseEntities;

import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.configuration.ReadProperties;

public class BaseTest {
    protected WebDriver driver;



    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();

        driver = browserFactory.getDriver();

        driver.get(ReadProperties.getUrl());
    }
    @AfterMethod
    public void tearDown() {// сloses the browser in case of an error
        driver.quit();
    }

}

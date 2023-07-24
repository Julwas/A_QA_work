package helper;

import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class BasicLocatorsTest_hw {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
    }
    @AfterMethod
    public void tearDown() {// сloses the browser in case of an error
        driver.quit();
    }

    @Test
    public void basicLocatorsTest_hw(){
        driver.get(ReadProperties.getUrl());

        // Find webElement by ID
        driver.findElement(By.id("login")).sendKeys(ReadProperties.username());

        // Find webElement by Name
        driver.findElement(By.name("password")).sendKeys(ReadProperties.password());

        // Find webElement by Tag
        driver.findElement(By.tagName("h2")).click();
        // Find webElement by LinkText
        driver.findElement(By.linkText("Recover the password")).click();
        // Find webElement by ClassName
        driver.findElement(By.className("f1tig")).click();
        // Find webElement by PartialLinkText
        driver.findElement(By.partialLinkText("Recover the password")).click();
    }
}

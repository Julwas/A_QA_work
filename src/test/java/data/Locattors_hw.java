package data;

import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class Locattors_hw {
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
    public void BasicLocatorsHW(){
        driver.get(ReadProperties.getUrl());
        // Find webElement by ID
        driver.findElement(By.id("search-destination")).click();
        // Find webElement by Name
        driver.findElement(By.name("search.dateIn")).click();
        // Find webElement by Tag
        driver.findElement(By.tagName("label")).click();
        // Find webElement by ClassName
        driver.findElement(By.className("main-h1"));
        // Find webElement by LinkText
        driver.findElement(By.linkText("See conditions")).click();
        // Find webElement by PartialLinkText
        driver.findElement(By.partialLinkText("conditions")).click();
    }

}

package data;

import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

public class Locators_hw {
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
    public void BasicLocators_HW() throws InterruptedException {
        driver.get(ReadProperties.getUrl());
        Thread.sleep(5000);
        // Find webElement by ID
        driver.findElement(By.id("search-destination")).click();
        // Find webElement by Name
        driver.findElement(By.name("search.dateIn")).click();
        // Find webElement by Tag
        driver.findElement(By.tagName("label")).click();
        // Find webElement by ClassName
        driver.findElement(By.className("tDepartureDate"));
        // Find webElement by LinkText
        driver.findElement(By.linkText("See conditions")).click();
    }
    @Test
    public void cssSelectorsTestHW() throws InterruptedException {

        driver.get(ReadProperties.getUrl());

        Thread.sleep(5000);
        // Поиск по id
        Assert.assertTrue(driver.findElement(By.cssSelector("#date_date_depart")).isDisplayed());
        // Поиск по class name
        Assert.assertTrue(driver.findElement(By.cssSelector(".tDepartureDate")).isDisplayed());
        // Поиск по нескольким значения в аттрибуте class
        Assert.assertTrue(driver.findElement(By.cssSelector(".xpPicker__ul.xpPicker__slick.slick-slider.slick-accessible")).isDisplayed());
        // Поиск по tag name
        Assert.assertTrue(driver.findElement(By.cssSelector("button")).isDisplayed());
        // Поиск по tag и значению из аттрибута class
        Assert.assertTrue(driver.findElement(By.cssSelector("a.linksList__link")).isDisplayed());
        // Поиск всех элементов с тэгом h1 или p
        Assert.assertEquals(45, driver.findElements(By.cssSelector("input, i")).size());
        // Поиск всех элементов с тэгом p у которых непосредственный родитель с тэгом div
        Assert.assertEquals(15, driver.findElements(By.cssSelector("div > p")).size());
        // Поиск всех элементов с тэгом p которые идут сразу за элементом с тэго ul
        Assert.assertEquals(1, driver.findElements(By.cssSelector("hr + div")).size());
        // Поиск всех элементов с тэгом div которые являются братьями элементу с тэгом p
         Assert.assertEquals(1, driver.findElements(By.cssSelector("input ~ div")).size());
        // Поиск всех элементов у которых присутствует аттрибут title
        Assert.assertEquals(31, driver.findElements(By.cssSelector("[content]")).size());
        // Поиск всех элементов у которых присутствует аттрибут style с конкретным значением
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[role='alert']")).size());
        // Поиск всех элементов у которых присутствует аттрибут id со значением заканчивающимся на какое-то value
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[id$='nav']")).size());
        // Поиск всех элементов у которых присутствует аттрибут id со значением начинающимся на какое-то value
        Assert.assertEquals(8, driver.findElements(By.cssSelector("[id^=h]")).size());
        // Поиск всех элементов у которых присутствует аттрибут id со значением начинающимся на какое-то слово
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[id|=geoloc]")).size());
        // Поиск всех элементов у которых присутствует аттрибут title со значением содержащим слово целиком
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[data-label~=loyalty]")).size());
        // Поиск всех элементов у которых присутствует аттрибут title со значением содержащим какой текст
        Assert.assertEquals(1, driver.findElements(By.cssSelector("[data-label*=offers]")).size());
        // Поиск всех disabled элементов
        Assert.assertEquals(3, driver.findElements(By.cssSelector(":disabled")).size());
        // Поиск всех enabled элементов
        //Assert.assertEquals(71, driver.findElements(By.cssSelector(":enabled")).size());
        // Поиск всех выборанных элементов
        Assert.assertEquals(0, driver.findElements(By.cssSelector(":checked")).size());
        // Поиск всех элементов c пустым телом
        Assert.assertEquals(493, driver.findElements(By.cssSelector(":empty")).size());
        // Поиск элемента с тэгом p и которым является первым дочерним элементом
        Assert.assertEquals(1, driver.findElements(By.cssSelector("i:first-child")).size());
        // Поиск элемента с тэгом p и которым является последним дочерним элементом
        Assert.assertEquals(16, driver.findElements(By.cssSelector("li:last-child")).size());
        // Поиск элемента с тэгом p и которым является n-ым дочерним элементом
        Assert.assertEquals(2, driver.findElements(By.cssSelector("li:nth-child(12)")).size());
    }
    @Test
    public void basicXpathLocatorsTestHW() throws InterruptedException {
        driver.get(ReadProperties.getUrl());

        Thread.sleep(5000);

        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/main/section[4]/p")).isDisplayed());
        driver.findElements(By.xpath("//*"));
        Assert.assertTrue(driver.findElement(By.xpath("//h2")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div/h2")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div//form")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//main[@id]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id = 'main']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@method='post' and @autocomplete='off']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[starts-with(@id, 'new')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(@id, 'main')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//h2[text() ='Exclusive offers']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[. ='Email (eg name@domain.com)']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'Sign up to our ')]")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//section[@class = 'offers boxDefault']/h2[1]")).isDisplayed());
    }
    @Test
    public void axesXPath_HW() throws InterruptedException {
        driver.get(ReadProperties.getUrl());

        Thread.sleep(5000);

        Assert.assertTrue(driver.findElement(By.xpath("//iframe/..")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div/parent::header")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div/ancestor::header")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//nav/child::ul")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div/descendant::nav")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='mainBlock']/following::h2")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='bookingEngine boxDefault']/following-sibling::section")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='helper']/preceding::p")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='bookingEngine']/preceding-sibling::div")).isDisplayed());

    }
}

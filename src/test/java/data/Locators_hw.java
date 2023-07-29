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
    public void basicXpathLocatorsTestHW() {
        driver.get(ReadProperties.getUrl());

        // Абсолютный xpath nie urzywamy zazwyczaj
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/main/section[4]/p")).isDisplayed());
        // Все элементы на странице начина с HTML
        driver.findElements(By.xpath("//*"));
        // Аналог поиска по tagName
        Assert.assertTrue(driver.findElement(By.xpath("//h2")).isDisplayed());
        // Аналог родительского div и на один уровень ниже h2
        Assert.assertTrue(driver.findElement(By.xpath("//div/h2")).isDisplayed());
        // Аналог родительского div и на любом уровене ниже form
        Assert.assertTrue(driver.findElement(By.xpath("//div//form")).isDisplayed());
        // Поиск элемента с тэгом img у которого есть аьттрибут id
        Assert.assertTrue(driver.findElement(By.xpath("//img[@id]")).isDisplayed());
        // Поиск элемента у которого есть аттрибут id cо значением top-logo
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id = 'interaction-studio-destinations-hotels']")).isDisplayed());
        // Поиск элемента у которого есть аттрибут method cо значением и aттрибут target со значением
        Assert.assertTrue(driver.findElement(By.xpath("//*[@method='post' and @autocomplete='off']")).isDisplayed());

        // Поиск элемента у которого значение аттрибута начинается с
        Assert.assertTrue(driver.findElement(By.xpath("//*[starts-with(@id, 'new')]")).isDisplayed());

        // Поиск элемента у которого значение аттрибута содержит подстроку
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@id, 'Template')]")).isDisplayed());

        // Поиск элемента у которого текстовое значение содержит равно
        Assert.assertTrue(driver.findElement(By.xpath("//div[text() = 'All Projects']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[. = 'Todos']")).isDisplayed());

        // Поиск элемента у которого текстовое значение содержит подстроку
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'All Projects')]")).isDisplayed());

        // Поиск элемента по индексу
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class = 'summary-links text-secondary']/a[2]")).isDisplayed());
    }
}

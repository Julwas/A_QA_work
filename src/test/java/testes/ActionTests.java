package testes;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.WaitService;

import java.util.List;
import java.util.Objects;

public class ActionTests extends BaseTest {
    @Test
    public void hoverTest() {

        driver.get("http://the-internet.herokuapp.com/hovers");

        WaitService waitService = new WaitService(driver);
        Actions actions = new Actions(driver);

        List<WebElement> targetElements = waitService.waitForAllVisibleElementsLocatedBy(By.className("figure"));

        actions
                .moveToElement(targetElements.get(0), 10, 10)//прописать координаты
                .click(waitService.waitForVisibilityLocatedBy(By.cssSelector("[href='/users/1']"))) //ждем нахождение локализации
                .build()  // собрать
                .perform(); //выполнить

        Assert.assertTrue(waitService.waitForElementInvisible(targetElements.get(0)));//подождать что исчезнет
    }
    @Test
    public void uploadFileTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/upload");

        WaitService waitService = new WaitService(driver);

        WebElement fileUploadElement = waitService.waitForExists(By.xpath("//form/input[@type='file']"));
        String pathToFile = ActionTests.class.getClassLoader().getResource("download.jpeg").getPath();
        System.out.println(pathToFile);
        fileUploadElement.sendKeys(pathToFile);

        waitService.waitForVisibilityLocatedBy(By.id("file-submit")).submit();

        Thread.sleep(5000);
    }
}

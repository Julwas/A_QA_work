package testes;

import baseEntities.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.WaitService;

public class HomeWorkTests extends BaseTest {

    @Test
    public void contextMenuTest(){
        driver.get("http://the-internet.herokuapp.com/context_menu");

        WaitService waitService = new WaitService(driver);
        Actions actions = new Actions(driver);
        actions
                .contextClick(waitService.waitForVisibilityLocatedBy(By.id("hot-spot")))
                .build()
                .perform();
        Alert alert = driver.switchTo().alert();

        Assert.assertEquals(alert.getText(), "You selected a context menu");
        alert.accept();
    }
    @Test
    public void dynamicControlsTest(){
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        WaitService waitService = new WaitService(driver);
        //checkbox есь на страние
        WebElement checkBox = waitService.waitForExists(By.id("checkbox"));
        //нажимаем на кнопку remove
        waitService.waitForVisibilityLocatedBy
                (By.xpath("//*[@type='button' and @onclick='swapCheckbox()']")).click();
        //надписи “It’s gone”
        Assert.assertTrue(waitService.waitForVisibilityLocatedBy
                (By.id("message")).isDisplayed(),"It's gone!");
        //checkBox нет;
        Assert.assertTrue(waitService.waitForElementInvisible(checkBox));
        //находим интпут
        WebElement input = waitService.waitForExists(By.xpath("//input"));
        //проверяем что он выключен disabled
        Assert.assertFalse(input.isEnabled());
        //нажимаем на кнопку
        waitService.waitForVisibilityLocatedBy
                (By.xpath("//*[@onclick='swapInput()']")).click();
        //надписи “It's enabled!”
        Assert.assertTrue(waitService.waitForVisibilityLocatedBy
                (By.id("message")).isDisplayed(),"It's enabled!");
        //Проверить, что инпут enabled
        Assert.assertTrue(input.isEnabled());
    }
    @Test
    public void fileUploadTest(){
        driver.get("http://the-internet.herokuapp.com/upload");
        //Загрузить файл
        WaitService waitService = new WaitService(driver);

        WebElement fileUploadElement = waitService.waitForExists(By.id("file-upload"));
        String pathToFile = ActionTests.class.getClassLoader().getResource("ninja.jpg").getPath();
        System.out.println(pathToFile);
        fileUploadElement.sendKeys(pathToFile.substring(1));

        waitService.waitForVisibilityLocatedBy(By.id("file-submit")).submit();
        //Проверить, что имя файла на странице совпадает с именем загруженного файла
        Assert.assertEquals(waitService.waitForVisibilityLocatedBy
                (By.id("uploaded-files")).getText(), "ninja.jpg");
    }
    @Test
    public void framesTest(){
        driver.get("http://the-internet.herokuapp.com/frames");
        //найти
        WaitService waitService = new WaitService(driver);

        waitService.waitForVisibilityLocatedBy(By.cssSelector("[href='/iframe']")).click();
        //Открыть iFrame
        driver.switchTo().frame("mce_0_ifr");
        //Проверить, что текст внутри параграфа равен “Your content goes here.”
        Assert.assertEquals(waitService.waitForVisibilityLocatedBy
                        (By.id("tinymce")).getText(), "Your content goes here.");
    }
}

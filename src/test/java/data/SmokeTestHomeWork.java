package data;

import factory.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class SmokeTestHomeWork {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
    }

    @Test
    public void calcElectricFloor() throws InterruptedException {
        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");
        WebElement wightInput = driver.findElement(By.id("el_f_width"));
        WebElement lengthInput = driver.findElement(By.id("el_f_lenght"));
        wightInput.sendKeys("3");
        lengthInput.sendKeys("4");

        WebElement selectWebElementRoomType = driver.findElement(By.id("room_type"));
        Select selectRoomType = new Select(selectWebElementRoomType);
        selectRoomType.selectByVisibleText("Ванная");
        sleep(1000);

        WebElement selectWebElementHeatingType = driver.findElement(By.id("heating_type"));
        Select selectHeatingType = new Select(selectWebElementHeatingType);
        selectHeatingType.selectByVisibleText("Основное отопление");
        sleep(1000);

        WebElement elFlossesInput = driver.findElement(By.id("el_f_losses"));
        elFlossesInput.sendKeys("300");

        WebElement calcButton = driver.findElement(By.name("button"));
        calcButton.click();
        sleep(1000);

        WebElement resultFloorCablePower = driver.findElement(By.id("floor_cable_power"));
        Assert.assertEquals(resultFloorCablePower.getAttribute("value"), "315");

        WebElement resultSpecFloorCablePower = driver.findElement(By.id("spec_floor_cable_power"));
        Assert.assertEquals(resultSpecFloorCablePower.getAttribute("value"), "26");
    }

    @AfterMethod

    public void tearDown() {
        driver.quit();
    }
}

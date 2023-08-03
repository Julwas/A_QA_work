package service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import utils.configuration.ReadProperties;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class WaitService {
    private final WebDriverWait wait;
    private final WebDriver driver;

    public WaitService(WebDriver driver, Duration timeout){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, timeout);
    }

    public WaitService(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(ReadProperties.timeout()));
    }

    public WebElement waitForExists(By locator){//наличие ел. в дом модели
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public WebElement waitForVisibility(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));//есть
    }
    public WebElement waitForVisibilityLocatedBy(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));//находит 1 элемент
    }
    public List<WebElement> waitForAllVisibleElementsLocatedBy(By locator) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));}//находит все элемент

    public Boolean waitForElementInvisible(WebElement element) {
        return wait.until(ExpectedConditions.invisibilityOf(element));}

    public WebElement fluentWaitForElement(By locator) {
        Wait<WebDriver> fluent = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))//возврвщвет таймаут експшен через 30
                .pollingEvery(Duration.ofMillis(50))// время(через) проверки условия
                .ignoring(NoSuchElementException.class);

        return fluent.until(driverItem -> driverItem.findElement(locator));//ф-я с пом драйвера исчет элемент на основании локатора
    }
}

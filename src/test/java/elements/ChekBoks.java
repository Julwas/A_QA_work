package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChekBoks {
    private UIElement uiElement;

    public ChekBoks(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
    }

    public ChekBoks(WebDriver driver, WebElement webElement) {
        this.uiElement = new UIElement(driver, webElement);
    }

    public void click() {
        uiElement.click();
    }
    public void sendKeys(CharSequence... keysToSend) {
        uiElement.sendKeys(keysToSend);
        uiElement.isDisplayed();
    }

    public void clearAndSendKeys(CharSequence... keysToSend) {
        uiElement.clear();
        sendKeys(keysToSend);
    }
}

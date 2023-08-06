package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownMenu_hw {
    private UIElement uiElement;

    public DropDownMenu_hw(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);

    }

    public DropDownMenu_hw(WebDriver driver, WebElement webElement) {
        this.uiElement = new UIElement(driver, webElement);
    }

    public void click() {
        uiElement.click();
    }
}

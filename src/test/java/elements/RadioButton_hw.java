package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class RadioButton_hw {
    private UIElement uiElement;
    private WebDriver driver;
    private List<String> list;
    public RadioButton_hw(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
        this.list = new ArrayList<>();

        for(UIElement element : uiElement.findUIElements(By.cssSelector(".column project-type")))
        {list.add(element.getText());
    }
}
    public RadioButton_hw(WebDriver driver, WebElement webElement) {
        this.uiElement = new UIElement(driver, webElement);
    }
    public selectionByName(WebDriver driver, By by) {

    }
    public selectionByValue(WebDriver driver, By by) {

    }
    public selectionByNumber(WebDriver driver, By by) {

    }
}

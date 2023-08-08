package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class RadioButton_hw {
    private List<UIElement>  uiElementList;
    private List<String> textList;
    private List<String> valueList;
    public RadioButton_hw(WebDriver driver, String attributeNameValue) {
        uiElementList = new ArrayList<>();
        textList = new ArrayList<>();
        valueList = new ArrayList<>();

        for (WebElement element : driver.findElements(By.name(attributeNameValue))) {
            UIElement element = new UIElement(driver, webElement);
           uiElementList.add(element);
           valueList.add(element.getAttribute("value"));
           textList.add(element.findUIElements(By.xpath("").getText().trim());
        };

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

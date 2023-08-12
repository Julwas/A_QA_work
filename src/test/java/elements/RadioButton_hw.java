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

        for (WebElement webElement : driver.findElements( By.name(attributeNameValue) )) {
            UIElement element = new UIElement(driver, webElement);
           uiElementList.add(element);
           valueList.add(element.getAttribute("value"));
           textList.add(element.findElement(By.name("suite_mode")).getText().trim());
        };
    }

    public void selectionByName(String name) {
        uiElementList.get(textList.indexOf(name)).click();

    }
    public void selectionByValue(String value) {
        uiElementList.get(valueList.indexOf(value)).click();

    }
    public void selectionByNumber(int number) {
        uiElementList.get(number).click();

    }
}

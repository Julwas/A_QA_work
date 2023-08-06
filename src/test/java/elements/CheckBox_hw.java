package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox_hw {
    private UIElement uiElement;

    public CheckBox_hw(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
    }

    public CheckBox_hw(WebDriver driver, WebElement webElement) {
        this.uiElement = new UIElement(driver, webElement);
    }

    public void setFlack() {
        if (!uiElement.isSelected() &&  !uiElement.isSelected())  {
            uiElement.click();

        }
    }

        public void removeFlack() {
            if (!uiElement.isSelected()&& uiElement.isSelected()){
                uiElement.click();
            }
    }
    }
package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox_hw {
    private UIElement uiElement;

    public CheckBox_hw(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
    }

    public void set() {
        setFlag(true);
    }
        public void remove() {
            setFlag(false);
    }
    public void setFlag(boolean flag){
        if(!isSelected() && flag){
            uiElement.click();
        }
    }
    public boolean isSelected(){
        return uiElement.isSelected();
    }
    }
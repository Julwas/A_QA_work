package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleDriver {
    public WebDriver getDriver(){
       System.setProperty("webDriver.chrome.driver","src/test/resources/chromedriver.exe");

        return new ChromeDriver();

    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    //блок описания локаторов private final By elementNameTypeLocator = By.id("");
    private final By emailInputLocator = By.id("name");
    private final By pswInputLocator = By.id("password");
    private final By logInButtonLocator = By.id("button_primary");

    // Блок инициализации
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    //блок атомарных методов

    public WebElement getEmailInput() {
        return driver.findElement(emailInputLocator);
    }

    public WebElement getPswInput() {
        return driver.findElement(pswInputLocator);
    }

    public WebElement getLogInButton() {
        return driver.findElement(logInButtonLocator);
    }


    //блок комплексных методов

}

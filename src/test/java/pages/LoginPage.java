package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    //блок описания локаторов
    private final By emailInputLocator = By.id("user-name");
    private final By pswInputLocator = By.id("password");
    private final By logInButtonLocator = By.id("login-button");

    // Блок инициализации
    public LoginPage(WebDriver driver){
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return logInButtonLocator;
    }
    //блок атомарных методов

    public WebElement getEmailInput() {
        return driver.findElement(emailInputLocator);
    }

    public WebElement getPasswordInput() {
        return driver.findElement(pswInputLocator);
    }

    public WebElement getLogInButton() {
        return driver.findElement(logInButtonLocator);
    }

    public LoginPage setEmail(String value) {
        getEmailInput().sendKeys(value);
        return this;
    }

    public LoginPage setPassword(String password) {
        getPasswordInput().sendKeys(password);
        return this;
    }

    public ProductsPage clickLogIn() {
        getLogInButton().click();
        return new ProductsPage(driver);
    }

}

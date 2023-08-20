package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

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
        return $(emailInputLocator);
    }

    public WebElement getPswInput() {
        return $(pswInputLocator);
    }

    public WebElement getLogInButton() {
        return $(logInButtonLocator);
    }
    public void setEmail(String value) {
        getEmailInput().sendKeys(value);
    }
    //блок комплексных методов
    public void login(String username, String psw) {
        setEmail(username);
        getPswInput().sendKeys(psw);
        getLogInButton().click();
    }
}

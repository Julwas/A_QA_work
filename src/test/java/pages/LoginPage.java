package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    //блок описания локаторов
    private final By emailInputLocator = By.id("user-name");
    private final By pswInputLocator = By.id("password");
    private final By logInButtonLocator = By.id("login-button");

    // Блок инициализации
    public LoginPage(){

        super();
    }
    @Override
    protected By getPageIdentifier() {
        return logInButtonLocator;
    }
    //блок атомарных методов

    public SelenideElement getEmailInput() {
        return $(emailInputLocator);
    }

    public SelenideElement getPswInput() {
        return $(pswInputLocator);
    }

    public SelenideElement getLogInButton() {
        return $(logInButtonLocator);
    }
    /*public void setEmail(String value) {
        getEmailInput().sendKeys(value);
    }*/
    //блок комплексных методов
    public void login(String username, String psw) {
        getEmailInput().setValue(username);
        getPswInput().setValue(psw);
        getLogInButton().click();
    }
}

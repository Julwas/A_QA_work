package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

    //блок описания локаторов
    @FindBy(id = "user-name")
    public WebElement EmailInput;

    @FindBy(id = "password")
    public WebElement pswInput;
    @FindBy(id = "login-button")
    public WebElement logInButton;
    // Блок инициализации
    public LoginPage(WebDriver driver){

        super(driver);
    }
    @Override
    protected By getPageIdentifier() {
        return  By.id("login-button");
    }
    //блок атомарных методов
    public void setEmail(String value) {
        EmailInput.sendKeys(value);
    }

    //блок комплексных методов
    public void login(String username, String psw) {
        setEmail(username);
        pswInput.sendKeys(psw);
        logInButton.click();
    }
}


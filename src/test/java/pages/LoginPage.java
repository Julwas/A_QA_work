package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {
    //блок описания локаторов private final By elementNameTypeLocator = By.id("");
    @FindBy(id = "name")
    public WebElement emailInput;
    @FindBy(id = "name")
    public WebElement pswInput;
    @FindBy(id = "button_primary")
    public WebElement logInButton;
    @FindBy (className = "error-text")
    public WebElement errorText;

    @FindBy (className = "loginpage-message")
    public WebElement errorFieldText;

    // Блок инициализации
    public LoginPage(WebDriver driver){

        super(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Override
    protected By getPageIdentifier() {

        return By.id("button_primary");
    }

    //блок комплексных методов
    public void login(String username, String psw) {
        emailInput.sendKeys(username);
        pswInput.sendKeys(psw);
        logInButton.click();
}
}

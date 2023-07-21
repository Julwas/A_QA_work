import baseEntities.BaseTest;
import factory.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashBoardPage;
import pages.LoginPage;
import utils.configuration.ReadProperties;

public class LoginTest extends BaseTest {


    @Test
    public void successLoginTest() {

        Assert.assertTrue(
                loginStep.successLogin(//проверяю используется ли нужная страница
                        ReadProperties.username(),//передаю параметры из confic, это succes login -> is PageOpened
                        ReadProperties.password()
                ).isPageOpened()
        );
    }
    @Test
    public void incorrectEmailLoginTest() {
        Assert.assertEquals(
                loginStep.negativeLogin("asdasd", ReadProperties.password()).getErrorTextElement().getText(),
                "Email/Login or Password is incorrect. Please try again."
        );
    }
    @Test
    public void incorrectPswLoginTest() {
        Assert.assertEquals(
                loginStep.negativeLogin(ReadProperties.username(), "123456").
                        getErrorTextElement().getText(),
                "Email/Login or Password is incorrect. Please try again.",
                "Неверное сообщение об ошибке");
    }
    @Test
    public void shortPswLoginTest() {
        Assert.assertEquals(
                loginStep.negativeLogin(ReadProperties.username(), "123").
                        getErrorFieldTextElement().getText(),
                "Password is too short (5 characters required).",
                "Неверное сообщение об ошибке");
    }
}

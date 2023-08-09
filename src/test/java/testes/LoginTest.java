package testes;

import helper.DataHelper;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.LoginStep;

public class LoginTest extends BaseTest {
    @Test
    public void successLoginTest() {
        Assert.assertTrue(
                new LoginStep().successLogin(DataHelper.getAdminUser()).isPageOpened()
        );
    }
}

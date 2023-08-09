package testes;

import org.testng.Assert;
import org.testng.annotations.Test;
import helper.DataHelper;
import steps.LoginStep;

public class SingletoneTest extends BaseTest {

    @Test
    public void successLoginTest(){
        Assert.assertTrue(
                new LoginStep().successLogin(DataHelper.getAdminUser()).isPageOpened()
        );
    }
}

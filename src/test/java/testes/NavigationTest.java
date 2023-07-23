package testes;

import baseEntities.BaseTestHW;
import org.testng.annotations.Test;
import pages.LoginPageHW;
import utils.configuration.ReadProperties;

public class NavigationTest extends BaseTestHW {

    @Test
    public void successLoginTest() {
        driver.get(ReadProperties.getUrl());

        LoginPageHW loginPage = new LoginPageHW(driver);
        loginPage.setEmail("atrostyanko@gmail.com");
        loginPage.getPswInput().sendKeys("Qwertyu_1");
        loginPage.getLogInButton().click();
    }
}

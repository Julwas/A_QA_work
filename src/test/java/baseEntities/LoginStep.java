package baseEntities;

import baseEntities.BaseStep;
import models.User;
import org.openqa.selenium.WebDriver;
import pages.DashBoardPage;
import pages.LoginPage;

public class LoginStep extends BaseStep {
    public LoginStep(WebDriver driver) {
        super(driver);
    }

    public DashBoardPage successLogin(User user) {
        loginPage.login(user);

        return dashboardPage;
    }
    public LoginPage negativeLogin(User user) {
        loginPage.login(user);


        return  loginPage;
    }
}

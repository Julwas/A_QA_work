package Steps;

import baseEntities.BaseStepHW;
import org.openqa.selenium.WebDriver;
import pages.ProductsPageHW;

public class LoginStepHW extends BaseStepHW {
    public LoginStepHW(WebDriver driver) {
        super(driver);
    }

    public ProductsPageHW successLogin(String username, String psw) {
        loginPage.login(username, psw);

        return productsPage;
    }
}

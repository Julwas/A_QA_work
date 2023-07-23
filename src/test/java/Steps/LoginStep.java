package Steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.ProductsPage;

public class LoginStep extends BaseStep {
    public LoginStep(WebDriver driver) {
        super(driver);
    }

    public ProductsPage successLogin(String username, String psw) {
        loginPage.login(username, psw);

        return productsPage;
    }
}

package steps;

import baseEntities.BaseStep;
import pages.ProductsPage;

public class LoginStep extends BaseStep {
    public LoginStep() {
        super();
    }

    public ProductsPage successLogin(String username, String psw) {
        loginPage.login(username, psw);
        return productsPage;
    }
}

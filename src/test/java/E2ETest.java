import Steps.LoginStep;
import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPage;
import utils.configuration.ReadProperties;

public class E2ETest extends BaseTest {


    @Test
    public void successLoginTest() {

        //Assert.assertTrue(LoginStep.successLogin(ReadProperties.username(),ReadProperties.password()).isPageOpened());

    }

}

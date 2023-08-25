package stepDefs;

import baseEntities.BaseTest;
import factory.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends BaseTest {
    private BaseTest baseTest;
    public Hook(BaseTest baseTest){
        this.baseTest =baseTest;
    }
    @Before
    public void initScenario(Scenario scenario){
        baseTest.driver = new BrowserFactory().getDriver();
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            System.out.println("Attach screenshot");
        }
        baseTest.driver.quit();
    }
}

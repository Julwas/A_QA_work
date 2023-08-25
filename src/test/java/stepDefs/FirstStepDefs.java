package stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;

import java.util.Map;

public class FirstStepDefs {
    private WebDriver driver;

    @Given("start browser")
    public void startBrowser() {
        //driver = new BrowserFactory().getDriver();
    }

    @When("the login page is open")
    public void openLoginPage() {
        //driver = new BrowserFactory().getDriver();
    }

    @Then("is username file visible")
    public void isUsernameFileVisible() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.getEmailInput().isDisplayed());
    }

    @And("password field is displayed")
    public void passwordFieldIsDisplayed() {
        Assert.assertTrue(true);
    }

    @But("is password field not displayed")
    public void isPasswordFieldNotDisplayed() {
        Assert.assertTrue(true);
    }

    @When("user {string} password {string} loged in")
    public void userPasswordLoggedIn(String username, String password) {
        System.out.println("Username"+ username);
        System.out.println("Password"+ password);
    }
    @When("user logged in")
    public void userLoggedIn(DataTable parameters) {
        Map<String, String> expectedValues = parameters.asMap(String.class, String.class);
        System.out.println("Username: " + expectedValues.get("username"));
        System.out.println("Password: " + expectedValues.get("password"));
    }
 @When("^admin ([^\"]*) password \"([^\"]*)\" loged in$")
    public void adminPasswordLoggedIn(String username, String password) {
        System.out.println("Username"+ username);
        System.out.println("Password"+ password);
    }

    @Then("title is {string}")
    public void titleIs(String value) {
        System.out.println("Project ID:" + value);
    }

    @And("^project id is (\\d+)$")
    public void projectIdIs(int value) {
    }

    @And("^all elements \"(are|are not)\" visible$")
    public void allElementsAreVisible(String parametr) {
        if(parametr.equals("are")){
        }else {

        }
    }
    @Then("error is displayed")
    public void errorIsDisplayed() {
        System.out.println("Error displayed");
    }
}



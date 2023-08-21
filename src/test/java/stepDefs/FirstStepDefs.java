package stepDefs;


import io.cucumber.java.en.*;
import org.testng.Assert;

public class FirstStepDefs {

    @Given("start browser")
    public void startBrowser() {
    }
    @When("the login page is open")
    public void OpenLoginPage() {
    }

    @Then("is username file visible")
    public void isUsernameFileVisible() {
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
    public void userPasswordLogedIn(String username, String password) {
        System.out.println("Username"+ username);
        System.out.println("Password"+ password);
    }

    @Given("is Browser Open")
    public void isBrowserOpen() {
        
    }

    @When("is Login PageOpen")
    public void isLoginPageOpen() {
    }

    @And("project id is {int}")
    public void projectIdIs(int value) {
        
    }

    @Then("title is {string}")
    public void titleIs(String value) {
    }
}

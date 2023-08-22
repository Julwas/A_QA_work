package stepDefs;

import io.cucumber.java.en.*;
import org.testng.Assert;

public class FirstStepdefs {
    @Given("start browser")
    public void startBrowser() {
        //driver = new BrowserFactory().getDriver();
    }

    @When("the login page is open")
    public void theLoginPageIsOpen() {
        //driver = new BrowserFactory().getDriver();
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
 @When("^admin ([^\"]*) password \"([^\"]*)\" loged in$")
    public void adminPasswordLogedIn(String username, String password) {
        System.out.println("Username"+ username);
        System.out.println("Password"+ password);
    }

    @Given("is Browser Open")
    public void isBrowserOpen() {


    }

    @When("is Login PageOpen")
    public void isLoginPageOpen() {
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
}



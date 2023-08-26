package stepDefs;

import factory.BrowserFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.*;
import steps.ProductsStep;
import utils.configuration.ReadProperties;

public class e2eSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    private ProductsPage productsPage;
    private CartPage cartPage;
    private CheckoutInfoPage checkoutInfoPage;
    private CheckoutOverviewPage checkoutOverviewPage;
    private CheckoutCompletePage checkoutCompletePage;

    @Given("start browser")
    public void startBrowser(){
        driver = new BrowserFactory().getDriver();
    }
    @Given("open login page")
    public void openLoginPage(){
        driver.get(ReadProperties.getUrl());
    }
    @When("user enter username {} and psw {}")
    public void setUsernameAndPassword(String username, String psw) {
        loginPage.setEmail(username);
        loginPage.pswInput.sendKeys(psw);
    }
    @When("user click login button")
    public void userClickLoginButton() {
        loginPage.logInButton.click();
    }

    @Then("products page is open")
    public void isProductsPageOpen(){
        Assert.assertTrue(new ProductsPage(driver).isPageOpened());
    }
    @Given("user add product to cart button")
    public void addProductsToCartButton(){
        productsPage.addToCartButton.click();
    }
    @Given("open shopping Cart")
    public void openShoppingCart(){
        productsPage.shoppingCart.click();
    }
    @Given("user click checkout Button")
    public void checkoutButton(){
        cartPage.checkoutButton.click();
    }
    @When("user enter firstName{} and lastName{} and zipCode{}")
    public void setUserData(String firstname, String lastname, String zip) {
        checkoutInfoPage.firstNameInput.sendKeys(firstname);
        checkoutInfoPage.lastNameInput.sendKeys(lastname);
        checkoutInfoPage.zipCodeInput.sendKeys(zip);
    }
    @When("user click continueButton")
    public void userClickContinueButton() {
        checkoutInfoPage.continueButton.click();
    }
    @When("user click finish Checkout Button")
    public void clickFinishCheckoutButton() {
        checkoutOverviewPage.finishCheckoutButton.click();
    }
    @Then("user click backHomeButton")
    public void clickBackHomeButton(){
        checkoutCompletePage.backHomeButton.click();
    }
}

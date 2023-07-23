package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class CheckoutInfoPage extends BasePage {
    private final static String pagePath = "checkout-step-one.html";

    //блок описания локаторов
    private final By headerCheckoutInfoLocator = By.xpath("//*[@id='header_container']/div[2]/span");
    private final By firstNameInputLocator = By.id("first-name");
    private final By lastNameInputLocator = By.id("last-name");
    private final By zipCodeInputLocator = By.id("postal-code");
    private final By continueButtonLocator = By.id("continue");

    // Блок инициализации
    public CheckoutInfoPage(WebDriver driver) {
        super(driver);
    }
    public void openPageByUrl(){
        super.openPageByUrl(pagePath);
    }

    @Override
    protected By getPageIdentifier() {
        return continueButtonLocator;
    }

    //блок атомарных методов

    public WebElement getHeaderCheckoutInfo() {
        return driver.findElement(headerCheckoutInfoLocator);
    }

    public WebElement getFirstNameInput() {
        return driver.findElement(firstNameInputLocator);
    }

    public WebElement getLastNameInput() {
        return driver.findElement(lastNameInputLocator);
    }

    public WebElement getZipCodeInput() {
        return driver.findElement(zipCodeInputLocator);
    }

    public WebElement getContinueButton() {
        return driver.findElement(continueButtonLocator);
    }

    //блок комплексных методов

    public void inputYourData(String firstname, String lastname, String zip) {
        getFirstNameInput().sendKeys(firstname);
        getLastNameInput().sendKeys(lastname);
        getZipCodeInput().sendKeys(zip);
        getContinueButton().click();
    }
}

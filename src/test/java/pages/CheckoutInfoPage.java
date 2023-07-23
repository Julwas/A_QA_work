package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutInfoPage extends BasePage {
    private final static String pagePath = "checkout-step-one.html";

    //блок описания локаторов
    private final By headerCheckoutInfoLocator = By.xpath("//*[@id='header_container']/div[2]/span");
    private final By firstNameInputLocator = By.id("first-name");
    private final By lastNameInputLocator = By.id("last-name");
    private final By zipCodeInputLocator = By.id("postal-code");
    private final By submitLocator = By.id("continue");

    // Блок инициализации
    public CheckoutInfoPage(WebDriver driver) {
        super(driver);
    }
    public void openPageByUrl(){
        super.openPageByUrl(pagePath);
    }

    @Override
    protected By getPageIdentifier() {
        return submitLocator;
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

    public WebElement getSubmit() {
        return driver.findElement(submitLocator);
    }
    public void setFirstName(String value) {
        getFirstNameInput().sendKeys(value);
    }

    public void setLastName(String value) {
        getLastNameInput().sendKeys(value);
    }

    public void setZipCode(String value) {
        getZipCodeInput().sendKeys(value);
    }

    public void inputYourData() {
        setFirstName("testFirstName");
        setLastName("testLastName");
        setZipCode("0123");
    }
}

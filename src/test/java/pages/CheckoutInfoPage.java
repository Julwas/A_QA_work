package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutInfoPage extends BasePage {
    private final static String pagePath = "checkout-step-one.html";

    //блок описания локаторов
    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    public WebElement headerCheckoutInfo;
    @FindBy(id ="first-name" )
    public WebElement firstNameInput;
    @FindBy(id = "last-name")
    public WebElement lastNameInput;
    @FindBy(id = "postal-code")
    public WebElement zipCodeInput;
    @FindBy(id = "continue")
    public WebElement continueButton;

    // Блок инициализации
    public CheckoutInfoPage(WebDriver driver) {
        super(driver);
    }
    public void openPageByUrl(){
        super.openPageByUrl(pagePath);
    }

    @Override
    protected By getPageIdentifier() {
        return By.id("continue");
    }

    public void inputYourData(String firstname, String lastname, String zip) {
        firstNameInput.sendKeys(firstname);
        lastNameInput.sendKeys(lastname);
        zipCodeInput.sendKeys(zip);
        continueButton.click();
    }
}

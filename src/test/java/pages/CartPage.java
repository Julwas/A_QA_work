package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    private final static String pagePath = "cart.html";

    //блок описания локаторов
    private final By headerCartTitleLocator = By.xpath("//*[@id='header_container']/div[2]/span");
    private final By checkoutButtonLocator = By.id("checkout");

    // Блок инициализации
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void openPageByUrl(){
        super.openPageByUrl(pagePath);
    }
    @Override
    protected By getPageIdentifier() {
        return checkoutButtonLocator;
    }

    //блок атомарных методов

    public WebElement getHeaderCartTitle() {
        return driver.findElement(headerCartTitleLocator);
    }

    public WebElement getCheckoutButton() {
        return driver.findElement(checkoutButtonLocator);
    }
}

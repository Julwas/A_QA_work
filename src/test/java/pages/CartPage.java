package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    private final static String pagePath = "cart.html";

    //блок описания локаторов
    @FindBy(xpath = "//span[@class='title']")
    public WebElement headerCartTitle;
    @FindBy(id ="checkout" )
    public WebElement checkoutButton;

    // Блок инициализации
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return By.id("checkout");
    }
    public void openPageByUrl(){
        super.openPageByUrl(pagePath);
    }
}

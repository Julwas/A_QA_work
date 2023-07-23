package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoardPage extends BasePage {
    private final static String pagePath = "/index.php?/dashboard/";//static что бы загружалась первее конструктора

    //блок описания локаторов private final By elementNameTypeLocator = By.id("");
    private final By headerTitleLabelLocator = By.xpath("//div[contains(@class, 'content-header-title') and contains(text(), 'All Projects')]");

    public TopMenuPage topMenuPage;
    public SideMenuPage sideMenuPage;
    // Блок инициализации
    public DashBoardPage(WebDriver driver){

        super(driver);

        topMenuPage = new TopMenuPage(driver);
        sideMenuPage = new SideMenuPage(driver);

    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    //блок атомарных методов
    public WebElement getHeaderTitle(){
        return driver.findElement(headerTitleLabelLocator);
    }

}

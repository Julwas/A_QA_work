package pages;

import baseEntities.BasePage;
import elements.RadioButton_hw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;

public class AddProjectsPage extends BasePage {
    private final static String pagePath = "/index.php?/admin/projects/add/1";

    // Блок описания локаторов для элементов
    private final By headerTitleLabelLocator = By.className("tab-header");
    private final By addButtonLocator = By.id("accept");

    // Блок инициализации

    public AddProjectsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }
    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов
    public WebElement getAddButton() {
        return driver.findElement(addButtonLocator);

    }

    public RadioButton_hw getType() {
        return new RadioButton_hw(driver, "suite_mode");
    }
}

package pages;

import baseEntities.BasePage;
import elements.CheckBox_hw;

import elements.RadioButton_hw;
import elements.UIElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProjectsPage extends BasePage {
    private final static String pagePath = "/index.php?/admin/projects/add";

    // Блок описания локаторов для элементов
    private final By headerTitleLabeLocator = By.xpath("//div[contains(@class, 'content-header-title') and contains(text(), 'Add Project'");
    private final By nameInputLocator = By.id("name");
    private final By annoucementTextAreaLocator = By.id("announcement_display");
    private final By showAnnouncementCheckBoxLocator = By.id("show_announcement");
    private final By projectTypeRadioButtonLocator = By.name("suite_mode");

    // Блок инициализации

    public AddProjectsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabeLocator ;
    }
    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов
    public WebElement getHeaderTitle() {
        return driver.findElement(headerTitleLabeLocator);
    }
    public UIElement getNameInput() {
        return new UIElement(driver, nameInputLocator);
    }
    public UIElement getAnnouncementTextArea() {
        return new UIElement(driver, annoucementTextAreaLocator);
    }
    public CheckBox_hw getShowAnnouncement() {
        return new CheckBox_hw(driver, showAnnouncementCheckBoxLocator);
    }
    public RadioButton_hw getProjectType(){
        return new RadioButton_hw(driver, projectTypeRadioButtonLocator);
    }

}

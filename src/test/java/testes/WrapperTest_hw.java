package testes;

import baseEntities.BaseTest;
import elements.CheckBox;
import elements.CheckBox_hw;
import elements.RadioButton_hw;
import elements.TableCell;
import helper.DataHelper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.AddProjectsPage;
import pages.ProjectsPage;
import pages.TestCasePage;
import utils.configuration.ReadProperties;

public class WrapperTest_hw extends BaseTest {

    @Test
    public void testCheckBox_hw() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        CheckBox_hw checkBox1 = new CheckBox_hw(driver,By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        CheckBox_hw checkBox2 = new CheckBox_hw(driver,By.xpath("//*[@id=\"checkboxes\"]/input[2]"));

        checkBox1.set();
        checkBox2.remove();
    }

    @Test
    public void dropdownTest() {
        loginStep.successLogin(
                ReadProperties.username(),
                ReadProperties.password()
        );
        TestCasePage testCasePage_homework = new TestCasePage(driver);
        testCasePage_homework.openPageByUrl();
        testCasePage_homework.dropdown();
        testCasePage_homework.gettextDropDown();
    }
    @Test
    public void RadioButton_hw() throws InterruptedException {
        loginStep.successLogin(ReadProperties.username(), ReadProperties.password());
        AddProjectsPage addProjectsPage = new AddProjectsPage(driver);
        addProjectsPage.openPageByUrl();
        addProjectsPage.getProjectType().selectByIndex(0);
        Thread.sleep(1400);
        addProjectsPage.getProjectType().selectByText("Use multiple test suites to manage cases");
        addProjectsPage.getProjectType().selectByValue("1");
    }
    }

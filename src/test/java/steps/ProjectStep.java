package steps;

import baseEntities.BaseStep;
import models.Project;
import org.openqa.selenium.WebDriver;
import pages.AddProjectPage;

public class ProjectStep extends BaseStep {
    public ProjectStep(WebDriver driver) {
        super(driver);
    }

    public void AddProject (Project project) {


        AddProjectPage addProjectsPage =new AddProjectPage(driver);
        addProjectsPage.openPageByUrl();

        addProjectsPage.getNameInput().sendKeys(project.getProjectName());
        addProjectsPage.getAnnouncementTextArea().sendKeys(project.getAnnouncement());

        addProjectsPage.getShowAnnouncement().setFlag(project.isFlag());
        addProjectsPage.getProjectType().selectByIndex(project.getProjectType());
        addProjectsPage.getProjectType().selectByText("Use multiple test suites to manage cases");
        addProjectsPage.getProjectType().selectByValue("0");
        }
    }


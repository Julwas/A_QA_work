package tests.api;

import adapters.ProjectAdapter;
import baseEntities.BaseApiTest;
import models.Projects;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProjectApiTes extends BaseApiTest {
    @Test
    public void getAllProjectsTest() {
        Projects actualProjects = new ProjectAdapter().getAllProjects();

       Assert.assertEquals(actualProjects.getProjects().length, 54);
       // System.out.println(actualProjects.getProjects().length);
    }
}

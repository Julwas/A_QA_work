package tests.api;

import baseEntities.BaseApiTest;
import io.restassured.mapper.ObjectMapperType;
import models.Project;
import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class TestRailApiTest1 extends BaseApiTest {
    static Logger logger = LogManager.getLogger(TestRailApiTest1.class);
    @Test
    public void addProjectTest1() {
        String endpoint = "/index.php?/api/v2/add_project";

        Project expectedProject = new Project();
        expectedProject.setProjectName("WP_Project_01");
        expectedProject.setAnnouncement("This is a description!!!");
        expectedProject.setProjectType(1);
        expectedProject.setFlag(true);


        given()
                .body(String.format("{\n" +
                                "  \"name\": \"%s\",\n" +
                                "  \"announcement\": \"%s\",\n" +
                                "  \"show_announcement\": %b,\n" +
                                "  \"suite_mode\" : %d\n" +
                                "}",
                        expectedProject.getProjectName(),
                        expectedProject.getAnnouncement(),
                        expectedProject.isFlag(),
                        expectedProject.getProjectType()
                ))
                .when()
                .post(endpoint)
                .then()
                .log().body().statusCode(HttpStatus.SC_OK);
    }

    @Test
    public void addProjectTest2() {
        String endpoint = "/index.php?/api/v2/add_project";

        Project expectedProject = new Project();
        expectedProject.setProjectName("WP_Project_02");
        expectedProject.setAnnouncement("This is a description!!!");
        expectedProject.setProjectType(1);
        expectedProject.setFlag(true);

        Map<String, Object> jsonMap = new HashMap<>();
        jsonMap.put("name", expectedProject.getProjectName());
        jsonMap.put("suite_mode", expectedProject.getProjectType());

        given()
                .body(jsonMap)
                .when()
                .post(endpoint)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }
    @Test
    public void addProjectTest3() {
        String endpoint = "/index.php?/api/v2/add_project";

        Project expectedProject = new Project();
        expectedProject.setProjectName("WP_Project_03");
        expectedProject.setAnnouncement("This is a description!!!");
        expectedProject.setProjectType(2);
        expectedProject.setFlag(true);

        given()
                .body(expectedProject, ObjectMapperType.GSON)
                .log().all()
                .when()
                .post(endpoint)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK);
    }
    @Test
    public void addProjectTest4() {
        Project expectedProject = new Project();
        expectedProject.setProjectName("WP_Project_04");
        expectedProject.setAnnouncement("This is a description!!!");
        expectedProject.setProjectType(3);
        expectedProject.setFlag(false);

       /*Response response = new ProjectAdapter().add(expectedProject);
        Project actualProject = GsonHelper.getProjectFromJson(response.getBody().asString());
        System.out.println(actualProject.toString());*/
    }
    @Test
    public void addProjectTest5() {
        String endpoint = "/index.php?/api/v2/add_project";

        Project expectedProject = new Project();
        expectedProject.setProjectName("WP_Project_06");
        expectedProject.setAnnouncement("This is a description!!!");
        expectedProject.setProjectType(2);
        expectedProject.setFlag(true);

        int id = given()
                .body(expectedProject, ObjectMapperType.GSON)
                .log().all()
                .when()
                .post(endpoint)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .jsonPath()
                .getInt("id");

        logger.info(id);
    }

   }

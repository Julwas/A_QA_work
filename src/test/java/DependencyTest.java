import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
    @Test
    public void stepB(){
        System.out.println("stepB...");
    }
    @Test (dependsOnMethods = "stepB")
    public void stepA2() {
        System.out.println("stepA2...");
        Assert.fail();
    }
    @Test(dependsOnMethods = "stepA2", alwaysRun = true)
    public void stepA11() {
        System.out.println("stepA11...");

    }
    @Test(dependsOnMethods = {"stepB", "stepA2"})
    public void stepA12() {
        System.out.println("stepA12...");
    }
}

import org.testng.annotations.Test;

public class PriorityTest {
    @Test(priority=1)
    public void stepB(){
        System.out.println("stepB...");
    }
    @Test (priority = 2)
    public void stepA2() {
        System.out.println("stepA2...");
    }
    @Test (priority = 3)
    public void stepA11() {
        System.out.println("stepA11...");
    }
    @Test (priority = 4)
    public void stepA12() {
        System.out.println("stepA12...");
    }

    @Test (priority = 5)
    public void stepD() {
        System.out.println("stepD...");
    }

    @Test (priority = 6)
    public void stepC() {
        System.out.println("stepC...");
}
}

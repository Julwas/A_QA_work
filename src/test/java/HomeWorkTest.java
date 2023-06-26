import data.StaticProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWorkTest extends BaseTest {
    @Test(expectedExceptions = AssertionError.class, priority = 6, groups = "Int")
    public void divInt_1() {
        int expectedValue = 50;
        int actualValue = calculator.divInt(0, 100);
        Assert.assertEquals(actualValue, expectedValue, "value is not equals");
    }

    @Test(priority = 3, groups = "Int")
    public void divInt_2() {
        int expectedValue = 0;
        int actualValue = calculator.divInt(0, 100);
        Assert.assertEquals(actualValue, expectedValue, "value is not equals");
    }

    @Test(priority = 1, groups = "Int")
    public void divInt_3() {
        int expectedValue = 50;
        int actualValue = calculator.divInt(100, 2);
        Assert.assertEquals(actualValue, expectedValue, "value is not equals");
    }

    @Test(priority = 8, description = "checked division by zero", groups = "Int")
    public void divInt_4() {
        int expectedValue = 0;
        int actualValue = calculator.divInt(100, 0);
        Assert.assertEquals(actualValue, expectedValue);
    }

    @Test(priority = 4, groups = "Double")
    public void divDouble_1() {
        int expectedValue = 0;
        double actualValue = calculator.divDouble(0, 10.7);
        Assert.assertEquals(actualValue, expectedValue, "value is not equals");
    }

    @Test(expectedExceptions = AssertionError.class, priority = 5, groups = "Double")
    public void divDouble_2() {
        int expectedValue = 15;
        double actualValue = calculator.divDouble(60.2, 10.7);
        Assert.assertEquals(actualValue, expectedValue, "value is not equals");
    }

    @Test(invocationCount = 2, invocationTimeOut = 2000)
    public void divDouble_3() throws InterruptedException {
        Thread.sleep(500);
        int expectedValue = 5;
        double actualValue = calculator.divDouble(60.2, 10.7);
        Assert.assertEquals(actualValue, expectedValue, "value is not equals");
    }

    @Test(enabled = false, priority = 7, groups = "Double")
    public void divDouble_4() {
        int expectedValue = 0;
        double actualValue = calculator.divDouble(100.5, 0);
        Assert.assertEquals(actualValue, expectedValue, "value is not equals");
    }

    @Test(priority = 9, expectedExceptions = ArithmeticException.class)
    public void divInt_5() {
        int expectedValue = 0;
        int actualValue = calculator.divInt(0, 0);
        Assert.assertEquals(actualValue, expectedValue);
    }

    @Test(priority = 10, groups = "Double", expectedExceptions = ArithmeticException.class)
    public void divDouble_5() {
        int expectedValue = 0;
        double actualValue = calculator.divDouble(0.0, 0.0);
        Assert.assertEquals(actualValue, expectedValue, "value is not equals");
    }

    @Test(timeOut = 1000)
    public void timeOuteTest() throws InterruptedException {
        Thread.sleep(500);
        int expectedValue = 6;
        double actualValue = calculator.divDouble(170.5, 25.5);
        Assert.assertEquals(actualValue, expectedValue, "value is not equals");
    }

    @Test(dataProvider = "Data for some test", dataProviderClass = StaticProvider.class)
    public void dataProviderTest(int a, int b, int expectedValue) throws InterruptedException {
        Thread.sleep(800);
        Assert.assertEquals(calculator.divInt(a, b), expectedValue, "value is not equals");
    }
}
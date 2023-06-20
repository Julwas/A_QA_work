import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest{
    @Test
    public void SumTest_1(){
        int expectedValue = 5;
        int actualValue = calculator.sum(2, 3);
        Assert.assertEquals(actualValue, expectedValue, "value is not equals");
    }
}

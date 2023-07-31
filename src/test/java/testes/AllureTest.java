package testes;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllureTest {
    @Test
    @Description("Some detailed test description. ")
    public void TestName1(){
        Assert.assertTrue(true);
    }

    @Test(description = "Human read")
    public void TestName2(){
        Assert.assertTrue(true);
    }
}

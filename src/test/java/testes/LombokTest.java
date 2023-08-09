package testes;

import helper.DataHelper;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LombokTest {
    @Test
    public void toStringTest() {
        User user = DataHelper.getAdminUser();
        System.out.println(user.toString());
    }
    @Test
    public void equalsTest() {
        User user1 = DataHelper.getAdminUser();
        User user2 = DataHelper.getAdminUser();
        user1.setId(1);

        User user2 = DataHelper.getAdminUser();
        user2.setId(2);

        Assert.assertTrue(user1.equals(user2));
    }

}


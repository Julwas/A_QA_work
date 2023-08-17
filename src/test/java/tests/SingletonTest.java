package tests;

import org.testng.annotations.Test;
import configuration.Singleton;

public class SingletonTest {
    @Test
    public void test() {
        Singleton singleton1 = Singleton.getInstance("First");
        Singleton singleton2 = Singleton.getInstance("Second");
        System.out.println(singleton1.value);
        System.out.println(singleton2.value);
    }
}

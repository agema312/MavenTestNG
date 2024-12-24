package demo.hw.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsTest {

    @Test
    public void registrationTest(){
        Assert.assertTrue(false);
        System.out.println("Registration was successful");
    }

    @Test(dependsOnMethods = "registrationTest")
    public void bookVilaTest(){
        System.out.println("Book vila was successful");
    }


}

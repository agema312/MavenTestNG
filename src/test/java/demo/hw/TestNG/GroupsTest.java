package demo.hw.TestNG;

import org.testng.annotations.Test;

public class GroupsTest {

    @Test(groups = "UI")
    public void testGroup1(){
        System.out.println("testGroup1");
    }


    @Test(groups = "API")
    public void testGroup2(){
        System.out.println("testGroup2");
    }


    @Test(groups = "UI")
    public void testGroup3(){
        System.out.println("testGroup3");
    }

    @Test(groups = {"UI","ID-123"}, description = "This test for testGroup 4",enabled = false)
    public void testGroup4(){
        System.out.println("testGroup4");
    }






}

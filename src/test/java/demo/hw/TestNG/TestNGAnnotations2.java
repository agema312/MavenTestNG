package demo.hw.TestNG;

import org.testng.annotations.BeforeSuite;

public class TestNGAnnotations2 {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }
}

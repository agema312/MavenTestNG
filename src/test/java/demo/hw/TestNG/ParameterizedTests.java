package demo.hw.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTests {

    @Test
    @Parameters({"browser","browser1"})
    public void test1(String browser,String browser1){
        System.out.println("Running test " + browser + " with parameters " + browser1);
    }

}

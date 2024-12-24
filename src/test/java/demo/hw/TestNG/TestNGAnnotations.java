package demo.hw.TestNG;


import org.testng.annotations.*;

public class TestNGAnnotations {
    Calculator calculator;
    @Test public void test1(){
        System.out.println("test1");
    }

    @Test public void test2(){
        System.out.println("test2");
    }

    @Test public void test3(){
        System.out.println("test3");
    }

    @BeforeClass
    public void beforeClass1(){
        System.out.println("BeforeClass1");
        calculator = new Calculator();
    }

    @BeforeClass
    public void beforeClass2(){
        System.out.println("BeforeClass2");
    }


    // BeforeMethod - запускается перед каждым тестом
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method 1");
    }


    // AfterClass - в конце класса
    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }

    // AfterMethod - после каждого теста запускается  
    @AfterMethod
    public void afterMethod1(){
        System.out.println("After method1");
    }
}

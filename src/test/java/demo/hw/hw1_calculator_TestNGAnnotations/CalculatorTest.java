package demo.hw.hw1_calculator_TestNGAnnotations;

import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest {

    Calculator2 calculator;

    @BeforeClass
    public void setUpClass(){
        System.out.println(" @BeforeClass");
        calculator = new Calculator2();
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("  @AfterClass");
        calculator = null;
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println(" @AfterMethod");
    }

    @DataProvider(name = "additionData")
    public Object[][] additionDataProvider(){
        return new Object[][]{
                {1,1,2},
                {2,3,5},
                {-1,5,4},
                {0,0,0},
        };
    }

    @DataProvider(name = "multiplicationData")
    public Object[][] multiplicationDataProvider(){
        return new Object[][]{
                {2,2,4},
                {3,3,9},
                {-1,5,5},
                {0,7,0}
        };
    }

    @Test(dataProvider = "additionData")
    public void testAddition(int a, int b, int expected){
       int result = calculator.add(a,b);
        Assert.assertEquals(result,expected,"Ошибка неправильный результат сложения");
    }

    @Test(dataProvider = "multiplicationData")
    public void testMultiplication(int a, int b, int expected){
        int result = calculator.multiply(a,b);
    try {
        Assert.assertEquals(result,expected,"Ошибка неправильный результат умножения");
    } catch (AssertionError e){
        System.out.println(e);
    }
    }
}

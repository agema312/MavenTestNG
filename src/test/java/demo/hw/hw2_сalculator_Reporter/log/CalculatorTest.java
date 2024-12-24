package demo.hw.hw2_сalculator_Reporter.log;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @DataProvider(name = "additionData")
    public Object[][] dataProvider(){
        return new Object[][]{
                {1,1,2},
                {2,3,5},
                {5,7,12},
                {0,0,0},
                {-1,1,0}
        };
    }

    @Test(dataProvider = "additionData")
    public void testAddition(int a, int b, int expected) {
        int result = calculator.add(a, b);
        try {
            Assert.assertEquals(result, expected, "Ошибка: неправильный результат сложения");
        } catch (AssertionError e) {
            Reporter.log("Ошибка в тесте для чисел " + a + " и " + b + ": ожидаем " + expected + ", а получили " + result,true);
            throw e; // Перекидываем исключение дальше
        }
    }

}

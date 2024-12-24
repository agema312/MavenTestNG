package demo.hw.hw3_notDataProvider;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass1 {

    Class1 calculator;

    @BeforeClass
    public void setUpClass() {
        calculator = new Class1();
    }

    @AfterClass
    public void tearDownClass() {
        calculator = null;
    }

    @Test
    public void testAdditionMultipleCases() {
        int[][] testData = {
                {1, 1, 2},
                {2, 3, 5},
                {-1, 5, 4},
                {0, 0, 0},
                {100, 200, 300}
        };

        for (int[] data : testData) {
            int a = data[0];
            int b = data[1];
            int expected = data[2];

            int result = calculator.add(a, b);
            Assert.assertEquals(result, expected, "Ошибка: неправильный результат сложения");
        }
    }
}


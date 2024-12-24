package demo.hw.hw4_notDataProviderRandom;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Random;

public class TestCalculator {

    Calculator calculator = new Calculator();
    Random random = new Random();

    @BeforeClass
    public void setUpClass() {
        System.out.println("Инициализация тестового класса...");
        calculator = new Calculator();
        random = new Random();
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("Завершение работы тестового класса...");
        calculator = null;
        random = null;
    }

    @Test
    public void testAdditionWithNumbers() {
        System.out.println("Тестируем сложение с рандомными числами...");

        int numberOfTest = 5;
        for (int i = 0; i < numberOfTest; i++) {
            int a = random.nextInt(100);
            int b = random.nextInt(100);
            int expected = a + b;
            System.out.println(a + " + " + b + " = " + expected);

            int resultAdd = calculator.add(a, b);

            Assert.assertEquals(resultAdd, expected, "Ошибка: неправильный результат сложеня");
        }
    }


    @Test
    public void tesMultiplicationWithRandomNumbers() {
        System.out.println("Тестируем умножение с рандомными числами...");
        int numberOfTests = 5;
        for (int i = 0; i < numberOfTests; i++) {
            int a = random.nextInt(50);
            int b = random.nextInt(50);
            int expected = a * b;
            System.out.println(a + " * " + b + " = " + expected);
            int result = calculator.multiply(a, b);
            Assert.assertEquals(result, expected, "Ошибка: неправильный результат умножения");
        }
    }
}

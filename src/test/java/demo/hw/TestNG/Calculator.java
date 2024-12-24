package demo.hw.TestNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator  {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero is not allowed!!!");
        }
        return a / b;
    }

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        // actual result           expected
        Assert.assertEquals(calculator.add(1, 2), 3);
        Assert.assertEquals(calculator.add(100, 200), 300);
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.subtract(5, 2), 3);
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(5, 2), 10);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    void testDivide() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divide(5, 0), 1);
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        try {
            calculator.divide(5, 0);
            Assert.fail("Expected ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            Assert.assertEquals(e.getMessage(), "Divide by zero is not allowed!!!");
        }
    }


}

package demo.hw.TestNG;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class DataProviderDemo {



    @Test(invocationCount = 3)
    public void testWithRandomData() {
        Faker faker = new Faker();
        String name = faker.name().fullName();
        String email = faker.internet().emailAddress();
        System.out.println("Name: " + name + ", Email: " + email);
    }





}

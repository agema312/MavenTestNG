package demo.hw.TestNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Text {

    public String printFirstTwoLetters(String text){
        return text.substring(0,2).toLowerCase() + text.substring(2);
    }

    public static void main(String[] args) {
        Text text = new Text();
        System.out.println(text.printFirstTwoLetters("Hello World"));
    }

    @Test
    public void test(){
        Text text = new Text();
        String result = "Hello World!";
        Assert.assertTrue(text.printFirstTwoLetters(result).charAt(0) == 'h');
    }
}

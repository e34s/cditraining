package logic;


import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by mpalotas on 18/03/14.
 */
public class CalculatorTest {
	

    @Test(groups = {"unit"})

    public void shouldReturnFullnameTest() {

        Calculator calc = new Calculator();
        Assert.assertEquals("Michael Palotas", calc.calculateName("Michael", "Palotas"));
        System.out.println("System getproperty: " + System.getProperty("environment"));

    }

    @Parameters("environment")
    @Test(groups = {"unit"})
    public void shouldReturnLengthOfNameTest(String environment) {

        String fullname = "Michael Palotas";

        Calculator calc = new Calculator();
        Assert.assertEquals(14, calc.calculateNumberOfChars(fullname));
        System.out.println("Annotation: " + environment);

    }
    
    @Test(groups = {"unit"})
    public void shouldReturnNumberOfDaysAlive() throws Exception {
    	
    	Calculator calc = new Calculator();
    	Assert.assertEquals(calc.calculateDaysAlive("2011-05-11"), 1208);
    }

}

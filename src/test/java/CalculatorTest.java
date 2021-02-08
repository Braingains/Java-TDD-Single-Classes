import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() { calculator = new Calculator();
    }


    @Test
    public void canAddOneAndTwo(){
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void canSubtractFiveFromTen(){
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void canMultiplySevenAndThree(){
        assertEquals(21,calculator.multiply(7, 3));
    }

    @Test
    public void canDivideTenAndTwo(){
        assertEquals(5, calculator.divide(10, 2), 0.1);
    }




}
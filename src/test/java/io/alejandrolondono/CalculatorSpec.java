package io.alejandrolondono;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by alejandrolondono on 5/18/16.
 */
public class CalculatorSpec {
    Calculator calculator;
    double err;
    @Before
    public void sandbox(){
        err = 0.01;
        calculator = new Calculator();
    }

    @Test
    public void addTest(){
        double expected = 10;
        double actual = calculator.add(5,5);
        assertEquals("the result should be "+expected,expected,actual,err);
    }

    @Test
    public void subtractTest(){
        double expected = 10;
        double actual = calculator.subtract(20,10);
        assertEquals("the result should be "+expected,expected,actual,err);
    }

    @Test
    public void multiplyTest(){
        double expected = 50;
        double actual = calculator.multiply(5, 10);
        assertEquals("the result should be "+expected,expected,actual,err);
    }

    @Test
    public void dividetest(){
        double expected = 5;
        double actual = calculator.divide(50,10);
        assertEquals("result should be "+expected,expected,actual,err);
    }

    @Test
    public void divideByZeroTest(){
        double expected =4 ;
        double actual = 4;
        try {
            actual = calculator.divideWithException(50,0);
        } catch (DivisionByZeroException e) {
            e.printStackTrace();
        }
        assertEquals("result should be "+expected,expected,actual,err);
    }
}

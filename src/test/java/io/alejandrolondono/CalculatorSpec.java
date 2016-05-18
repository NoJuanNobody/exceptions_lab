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
        boolean condition = true;
        try {
           double actual = calculator.divideWithException(50,0);
        } catch (DivisionByZeroException e) {
            e.printStackTrace();
        }
        assertTrue(condition);
    }

    @Test
    public void squareRootTest(){
        double expected = 3;
        double actual = 0;
       try{
           actual = calculator.sqrt(9);
       }catch(imaginaryException e){
            e.printStackTrace();
       }
        assertEquals(expected,actual,0.1);
    }

    @Test
    public void squareRootImaginaryTest(){
        boolean cond = true;
        try{
            double actual = calculator.sqrt(-9);
        }catch(imaginaryException e){
            e.printStackTrace();
        }
        assertTrue(cond);
    }
}

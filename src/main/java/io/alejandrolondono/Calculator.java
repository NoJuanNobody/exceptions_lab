package io.alejandrolondono;

/**
 * Created by alejandrolondono on 5/18/16.
 */
public class Calculator {

    public double add(double a, double b){ return a+b;}

    public double subtract(double a, double b){return a-b;}

    public double multiply(double a, double b){ return a*b;}

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0) throw new ArithmeticException("You can't divide by zero");
        return a/b;
    }

    static double divideWithException(double a, double b) throws DivisionByZeroException{
        if(b == 0){throw new DivisionByZeroException();}
        return a/b;
    }

    static double sqrt(double a) throws imaginaryException{
        if(a < 0) throw new imaginaryException();
        return Math.sqrt(a);
    }

}

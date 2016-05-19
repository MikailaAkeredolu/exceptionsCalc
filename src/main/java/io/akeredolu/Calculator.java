package io.akeredolu;

import io.akeredolu.ComplexNumberException;

/**
 * Created by mikailaakeredolu on 5/18/16.
 */
public class Calculator {


    public static double add(double input1, double input2){

        return input1 + input2;
    }


    public static double subtract(double input1, double input2){
        return input1 - input2;
    }


    public static double muliply(double input1, double input2){
        return input1 * input2;
    }

    /*
    public static double divide(double input1, double input2) throws Exception{
        if(input2 == 0){throw  new Exception();}
       return input1/input2;
    }
    */

    public static int divide(int input1, int input2) throws DivisionByZeroException {
        if(input2 == 0){throw new DivisionByZeroException();}
        return input1/input2;
    }

    public static double squareRoot(double number) throws ComplexNumberException{
        if(number < 0){ throw new ComplexNumberException();}

        return Math.sqrt(number);
    }

}

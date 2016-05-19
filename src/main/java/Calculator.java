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


    public static double divide(double input1, double input2) throws Exception{
        if(input2 == 0){throw  new Exception();}
       return input1/input2;
    }


}

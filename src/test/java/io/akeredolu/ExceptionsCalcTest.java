package io.akeredolu;

import org.junit.Test;

/**
 * Created by mikailaakeredolu on 5/18/16.
 */
public class ExceptionsCalcTest {

    @Test(expected = DivisionByZeroException.class)
    void divideTest() throws DivisionByZeroException {
        Calculator calc = new Calculator();
        calc.divide(4,0);
    }

}

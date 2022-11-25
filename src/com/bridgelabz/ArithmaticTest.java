package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(Parameterized.class)

class ArithmaticTest {

	//@org.junit.jupiter.api.Test
	 private int firstNumber;
    private int secondNumber;
    private int expectedResult;
    private Arithmatic arithmatic;

    public ArithmaticTest(int firstNumber, int secondNumber, int expectedResult) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initialize() {
        arithmatic = new Arithmatic();
    }

    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{{1, 2, 3}, {2, 3, 5}, {3, 5, 8}, {4, 5, 9}});
    }

    @Test
    public void testArithmaticTest() {
        System.out.println("Sum of Number :" + expectedResult);
        Assert.assertEquals(expectedResult, arithmatic.sum(firstNumber, secondNumber));
    }

}

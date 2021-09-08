import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Stack;

class ProblemTest {

    Long result;

    Problems problems;

    @BeforeEach
    void result(){
        this.problems = new Problems();
        this.result = 0L;
    }

    @Test
    void testMultipleOf3And5Until1000(){
        this.result  = (long) this.problems.multipleOf3And5Until1000();
        Assertions.assertEquals(233168, this.result);
    }

    @Test
    void testfibonacciSequence(){
        this.result  =(long)  this.problems.fibonacciSequence();
        Assertions.assertEquals(4613732,this.result);

    }

    @Test
    void testPrimeNumbers(){
        this.result  = (long) this.problems.largestPrimeNumber();
        Assertions.assertEquals(6857, this.result);
    }

    @Test
    void testLargestPalindrome(){
        this.result  = this.problems.largestPalindrome();
        Assertions.assertEquals(906609,this.result);
    }

    @Test
    void testsmallestNumberDividedBy20FirstNumbers(){
        this.result  =    this.problems.smallestNumberDividedBy20FirstNumbers();
        Assertions.assertEquals(232792560,this.result);
    }

    @Test
    void testdiferenceSquareSumNSumSquare(){
        this.result  =  this.problems.diferenceSquareSumNSumSquare();
        Assertions.assertEquals(25164150,this.result);
    }

    @Test
    void teststprime10001(){
        this.result  = (long) this.problems.stprime10001();
        Assertions.assertEquals(104743,this.result);
    }

    @Test
    void testtryplePytagoras(){
        this.result  = (long)  this.problems.tryplePytagoras();
        Assertions.assertEquals(31875000, this.result);
    }

    @Test
    void testLargeProductsInASeries(){
        this.result = this.problems.LargeProductInASeries();
        Assertions.assertEquals(23514624000l,this.result);
    }

    @Test
    void sumPrimeBelowTwoMillion(){
        this.result  = this.problems.sumOfPrimesAboveTwoMillions();
        Assertions.assertEquals(142913828922l,this.result);

    }

    @Test
    void testFirstTenDigitsOfTheSum(){
        this.result  = this.problems.firstTenDigitsOfTheSum();
        Assertions.assertEquals(5537376230L,this.result);

    }

}
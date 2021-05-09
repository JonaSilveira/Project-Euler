import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Stack;

class Problem1Test {

    @Test
    void testMultipleOf3And5Until1000(){
        int total = Problems.multipleOf3And5Until1000();

        Assertions.assertEquals(233168, total);

    }

    @Test
    void testfibonacciSequence(){
        int fibonacciSequence = Problems.fibonacciSequence();

        Assertions.assertEquals(4613732,fibonacciSequence);

    }

    @Test
    void testPrimeNumbers(){
        Integer prime = Problems.largestPrimeNumber();
        Assertions.assertEquals(6857, prime);
    }

    @Test
    void testLargestPalindrome(){
        Long largestPalindrome = Problems.largestPalindrome();
        Assertions.assertEquals(906609,largestPalindrome);
    }

    @Test
    void testsmallestNumberDividedBy20FirstNumbers(){
        Long smallest = Problems.smallestNumberDividedBy20FirstNumbers();
        Assertions.assertEquals(232792560,smallest);
    }

    @Test
    void testdiferenceSquareSumNSumSquare(){
        Long diferenceSquareSumNSumSquare = Problems.diferenceSquareSumNSumSquare();
        Assertions.assertEquals(25164150,diferenceSquareSumNSumSquare);
    }

    @Test
    void teststprime10001(){
        Integer prime10001 = Problems.stprime10001();
        Assertions.assertEquals(104743,prime10001);
    }

    @Test
    void testtryplePytagoras(){
        Integer result = Problems.tryplePytagoras();
        Assertions.assertEquals(31875000, result);
    }
}
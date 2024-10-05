import org.dev.module5.FibonacciIterative;
import org.dev.module5.FibonacciRecursion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFibonacciRecursion {
    @Test
    public void testFindFibonacciWorksCorrect(){
        //Given
        FibonacciRecursion fibonacciRecursion = new FibonacciRecursion();
        //When
        long actual = fibonacciRecursion.findFibonacci(6);
        //Then
        long expected = 8;

        Assertions.assertEquals(expected,actual);
    }
}

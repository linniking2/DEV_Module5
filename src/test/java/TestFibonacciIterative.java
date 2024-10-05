import org.dev.module5.FibonacciIterative;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFibonacciIterative {
    @Test
    public void testFindFibonacciWorksCorrect(){
        //Given
        FibonacciIterative fibonacciIt = new FibonacciIterative();
        //When
        long actual = fibonacciIt.findFibonacci(5);
        //Then
        long expected = 8;

        Assertions.assertEquals(expected,actual);
    }
}

import org.dev.module5.FibonacciIt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFibonacciIt {
    @Test
    public void testFindFibonacciWorksCorrect(){
        //Given
        FibonacciIt fibonacciIt = new FibonacciIt();
        //When
        int actual = fibonacciIt.findFibonacci(5);
        //Then
        int expected = 8;

        Assertions.assertEquals(expected,actual);
    }
}

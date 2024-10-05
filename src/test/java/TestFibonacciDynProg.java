import org.dev.module5.FibonacciDynProg;
import org.dev.module5.FibonacciIterative;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFibonacciDynProg {
    @Test
    public void testFindFibonacciWorksCorrect(){
        //Given
        FibonacciDynProg fibonacciDynProg = new FibonacciDynProg();
        //When
        long actual = fibonacciDynProg.findFibonacci(6);
        //Then
        long expected = 8;

        Assertions.assertEquals(expected,actual);
    }
}

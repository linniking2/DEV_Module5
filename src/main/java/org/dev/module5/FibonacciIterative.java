package org.dev.module5;

public class FibonacciIt {
    public int findFibonacci(int serchedNumber) {
        int nOne = 0;
        int nTwo = 1;
        int result = 0;


        for (int i = 0; i < serchedNumber; i++){
            result = nOne + nTwo;

            nOne = nTwo;
            nTwo = result;
        }

        return result;
    }

    public static void main(String[] args) {
        FibonacciIt fibonacciIt = new FibonacciIt();
        fibonacciIt.findFibonacci(5);
    }
}

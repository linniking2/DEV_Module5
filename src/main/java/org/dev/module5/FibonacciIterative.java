package org.dev.module5;

public class FibonacciIterative {
    public static long findFibonacci(int searchedNumber) {
        //Часова складність O(n)
        //Просторова складність O(1)
        long nOne = 0;
        long nTwo = 1;
        long result = 0;
        if (searchedNumber <= 1) {
            return searchedNumber;
        }

        for (int i = 0; i < searchedNumber - 1; i++){
            result = nOne + nTwo;

            nOne = nTwo;
            nTwo = result;
        }

        return result;
    }

    public static void main(String[] args) {
        FibonacciIterative fibonacciIt = new FibonacciIterative();
        System.out.println(fibonacciIt.findFibonacci(6));

    }
}

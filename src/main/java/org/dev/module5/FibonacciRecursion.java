package org.dev.module5;

public class FibonacciRecursion {
    public static long findFibonacci(int searchedNumber){
        //Часова складність  O(2^n)
        //Просторова складність O(n)
        if(searchedNumber <= 1){
            return searchedNumber;
        }

        return findFibonacci(searchedNumber - 1) + findFibonacci(searchedNumber -2);
    }

    public static void main(String[] args) {
        int searchedNumber = 6;

        System.out.println("Fibonacci number " + findFibonacci(searchedNumber));
    }
}

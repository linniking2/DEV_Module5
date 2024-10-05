package org.dev.module5;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDynProg {
    private static Map<Integer, Long> memo = new HashMap<>();

    public static long findFibonacci(int searchedNumber) {
        //Часова складність  O(n)
        //Просторова складність O(n)
        if (searchedNumber <= 1) {
            return searchedNumber;
        }

        if (memo.containsKey(searchedNumber)) {
            return memo.get(searchedNumber);
        }

        long fib = findFibonacci(searchedNumber - 1) + findFibonacci(searchedNumber - 2);
        memo.put(searchedNumber, fib);
        return fib;
    }

    public static void main(String[] args) {
        int searchedNumber = 6;
        System.out.println("Fibonacci: " + findFibonacci(searchedNumber));
    }
}

package com.scrumcenter.csd;

public class FizzBuzz {
    public static String fizzbuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz";
        if (n % 3 == 0) return "Fizz";
        if (n % 7 == 0) return "Buzz";
        return String.valueOf(n);
    }
}

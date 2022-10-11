package com.tw.androidtask;

public class TestingPradeep {

    public static void main(String[] args) {
        findingPrime(5);
        largestPrimeFactor(5);
        replaceSpace();
        reverseNumber(1565);
        factorial(16);
    }

    public static void findingPrime(int n) {
        for (int i = 2; i <= n; i++) {
            //i value is 2 becz dont want to start from 1
            if (n % i == 0) {
                System.out.println("Prime");
            }
        }
    }

    public static void replaceSpace() {
        String value = "abc xyz 123";
        String[] spilter = value.split(" ");
        for (int i = 0; i <= spilter.length; i++) {
            if (spilter[i].contains(" ")) {
                spilter[i] = "*";
            }
        }
        System.out.println(String.join("", spilter));
        //or
        StringBuilder builder = new StringBuilder();
        for (String entity : spilter) {
            builder.append(entity);
        }
        System.out.println(builder);
    }

    public static void reverseNumber(long number) {
        //Remainder= number % 10
        //reverse=reverse * number + remainder
        //number= number / 10
        int reverse = 0;
        while (number != 0) {
            int remainder = Math.toIntExact(number % 10);
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println(reverse);
    }

    public static void largestPrimeFactor(int n) {
        if (n == 0) {
            System.out.println("Not Prime Factor");
        }
        for (int i = n - 1; i > 1; i--) {
            if (n % i == 0) {
                System.out.println("No Is Prime");
            }
        }
    }

    public static void factorial(int number) {
        int finalResult = 1;
        for (int i = 1; i <= number; i++) {
            finalResult = finalResult * i;
        }
        System.out.println(finalResult);
    }

    static int isPerfectNumber(Long number) {
        int prime = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (i != number) {
                    prime = prime + i;
                }
            }
        }
        if (prime == number) {
            return 1;
        }else {
            return 0;
        }
    }
}

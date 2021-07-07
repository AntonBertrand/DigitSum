package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Final Sum = " + sumDigits(32123));

    }

    public static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }

        int lastDigit = 0;
        int sum = 0;

        while (number != 0) {

            lastDigit = number % 10;
            sum = sum + lastDigit;
            number = number / 10;

        }

        return sum;

    }
}

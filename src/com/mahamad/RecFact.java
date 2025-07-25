package com.mahamad;

public class RecFact {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(sumOfDigits(1342));
    }

    static int fact(int num) {
        if (num == 1)
            return 1;
        return num * fact(num - 1);

    }

    static int sumOfDigits(int num) {
        if (num == 0)
            return 0;

        return (num % 10) + sumOfDigits(num / 10);

    }
}

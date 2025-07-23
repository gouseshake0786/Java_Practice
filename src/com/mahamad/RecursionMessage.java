package com.mahamad;

public class RecursionMessage {
    public static void main(String[] args) {
        message();
    }

    static void message() {
        message2();
        System.out.println("1Hello");

    }

    static void message2() {
        System.out.println("2Hello");
        message3();
    }

    static void message3() {
        System.out.println("3Hello");
        message4();
    }

    static void message4() {
        System.out.println("4Hello");
        message5();
    }

    static void message5() {
        System.out.println("5Hello");
    }
}

package com.company.day7;

public class ifElse {

    public static void main(String[] args) {
     testEvenOrOdd(3);

    }
    public static void testEvenOrOdd(int x) {
        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
        if (x > 0) {
            System.out.println("positive");
        } else if (x < 0) {
            System.out.println("negative");
        } else if (x == 0) {
            System.out.println("zero");
        }
    }
}
package com.company.day7;

public class greatest {

    public static void main(String[] args) {
    greatestOf3(2,2,1);
    }

    public static void greatestOf3(int a, int b, int c) {

        if (a >= b && a >= c) {
            System.out.println("largest number is " + a);
        } else if (b >= c && b >= a) {
            System.out.println("largest number is " + b);
        } else{
            System.out.println("largest number is " + c);
        }


    }

}

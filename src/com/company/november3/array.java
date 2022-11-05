package com.company.november3;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = new int[5];

        for(int i=0;i<=999;i++){
            System.out.println("enter marks");
            arr[i] = sc.nextInt();
        }
    }
}

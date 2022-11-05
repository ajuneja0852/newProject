package com.company.October29;

import java.util.Scanner;

public class guessTheNumber {

    public static void main(String[] args) {
        int thoughtNumber = (int)(Math.random()*10);


        System.out.println("lets play the guessing game");
        System.out.println("I have thought a number .. you try guessing it");
        Scanner sc = new Scanner(System.in);
        while (true){
            int guessedNo = sc.nextInt();
                    if (thoughtNumber==guessedNo){
                        System.out.println("you guessed right.. you win");
                        break;
                    }else{
                        System.out.println("you were wrong.. try guessing again");

                    }
        }
    }
}

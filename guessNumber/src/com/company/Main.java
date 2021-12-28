package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int random = (int)(Math.random()*20+1);
        System.out.println("Guess a number between 1 and 20");
        Scanner getInput = new Scanner(System.in);
        Object input = getInput.nextLine();
        System.out.println(input);

        if (input.equals(random)){
            System.out.println("You have guessed the number!");
        }
        else{
            System.out.println("WROOOOOOONG, play again.");
        }
    }
}

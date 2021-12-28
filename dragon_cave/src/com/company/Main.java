package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and will eat you on sight");
        System.out.println("which cave will you go into? (1 or 2)");
        Scanner getInput = new Scanner(System.in);
        Object input = getInput.nextLine();
        System.out.println(input);


        if (input.equals("2")) {
            try {
                System.out.println("You approach the cave...");
                System.out.println("It is dark and spooky...");
                System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
                System.out.println("Gobbles you down in one bite");
            } catch (Exception e) {
                System.out.println("You hear a deep breath");
                System.out.println("You hear a deep voice say: Hello friend how was your travels? ");
            }
        }
    }
}
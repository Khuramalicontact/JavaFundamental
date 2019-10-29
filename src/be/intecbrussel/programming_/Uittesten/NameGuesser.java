package be.intecbrussel.programming_.Uittesten;

import java.util.Scanner;

public class NameGuesser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Guess my name");
        String name = keyboard.next();

        String answer = "Ali";
        do {
            if (name.equals(answer)) {
                System.out.println("Got it");
            } else {
                System.out.println("nope");
                continue;
            } } while (name == answer) ;


        {
            System.out.println("Press \" ENTER\" to continue...");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();

            System.out.println("stage 2");

            System.out.println(" if ready type \"Your Name\" to continue...");
            Scanner scanner1r = new Scanner(System.in);
            scanner.nextLine();

            System.out.println(" Guess my age");
            int age = keyboard.nextInt();
            if (age == 20) {
                System.out.println("correct");
            } else {
                System.out.println("wrong");
            }


        }

        }

}
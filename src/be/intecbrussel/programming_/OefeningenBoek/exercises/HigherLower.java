package be.intecbrussel.programming_.OefeningenBoek.exercises;

import java.util.Random;
import java.util.Scanner;

public class HigherLower {

    public static void main(String[] args) {

        //declaration and initialisation
        Scanner keyboard = new Scanner(System.in);
        Random mystery = new Random();
        // generate random number via randomNumberGenerator.nextInt(100)
        int numberToGuess = mystery.nextInt(100);

        //print de "text" uit
        System.out.println("enter a mystery number");
        boolean guessed = false;

        //loop of herhalingen
        // as long as guessed is false it repeats a block of code
        while (!guessed) {
            //keyboard.nextint() means the next input of the user will be read
            int guess = keyboard.nextInt();
            //between the () there needs to be a boolean valsue when using if ()
            if (guess < numberToGuess) {
                System.out.println("higher");
            } else if (guess > numberToGuess) {
                System.out.println("lower");
            } else {
                System.out.println("you got it");
                guessed = true;
            }
        }
        System.out.println("end of program");
    }}

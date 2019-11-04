package be.intecbrussel.programming_.Association;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HigherLower high = new HigherLower(100);
        int terugGave = 0;

        while(true){
        high.setWelcome("Welcome, voer een getal in van 1 tot 100");
        System.out.println(high.getWelcome());

        int ingave = scan.nextInt();
        terugGave = high.guess(ingave);

        if(terugGave == -1){
            System.out.println("Lager dan antwoord");
        } else if (terugGave == 1) {
            System.out.println("Hoger dan antw");
        } else if (terugGave == 0){
            System.out.println("Correct");
            break;
        } else {
            System.out.println("Try again");

        }
        }
}}

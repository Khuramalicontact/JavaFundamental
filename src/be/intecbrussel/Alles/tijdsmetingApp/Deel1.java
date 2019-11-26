package be.intecbrussel.Alles.tijdsmetingApp;

import java.util.Scanner;

public class Deel1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int startUur = 0;
        int startMinuten = 0;
        int eindUur = 0;
        int eindMinuten = 0;
        boolean correctInput = false;
        double loon = 11.5;
        int input = 0;


        do {
            System.out.println("Voer u startuur in.");
            if (keyboard.hasNextInt() && ((input = keyboard.nextInt()) < 24) && input >= 0) {
                startUur = input;
            } else {
                System.out.println("verkeerde ingave");
                continue;
            }

            System.out.println("Voer u start minuten in.");
            if (keyboard.hasNextInt() && ((input = keyboard.nextInt()) < 60) && input >= 0) {
                startMinuten = input;
            } else {
                System.out.println("verkeerde ingave");
                continue;
            }

            System.out.println("Voer u einduur in.");
            if (keyboard.hasNextInt() && ((input = keyboard.nextInt()) < 24) && input >= 0) {
                eindUur = input;
            } else {
                System.out.println("verkeerde ingave");
                continue;
            }

            System.out.println("Voer u eind minuten in.");
            if (keyboard.hasNextInt() && ((input = keyboard.nextInt()) < 60) && input >= 0) {
                eindMinuten = input;
                correctInput = true;
            } else {
                System.out.println("verkeerde ingave");
                continue;
            }

        } while (correctInput == false);

        int totaalStartMinuten = (startUur * 60) + startMinuten;
        int totaalEindMinuten = (eindUur * 60) + eindMinuten;
        int verschilStartEnEind = 0;

        if (totaalEindMinuten < totaalStartMinuten) {
            verschilStartEnEind = ((24 * 60) - totaalStartMinuten) + totaalEindMinuten;
        } else {
            verschilStartEnEind = totaalEindMinuten - totaalStartMinuten;
        }


        System.out.println("u heeft " + verschilStartEnEind / 60 + " uren " + verschilStartEnEind % 60 + " minuten gewerkt");

        int verschilUur = verschilStartEnEind / 60;
        int verschilMinuut = verschilStartEnEind % 60;

        double loonVerdient = verschilUur * 11.50 + verschilMinuut * (11.50 / 60);

        System.out.println(" Maak een keuze op welke dag u heeft gewerkt");


        int week=0;
        do {
            System.out.println("1.Maandag\n2.Dinsdag\n3.Woensdag\n4.Donderdag\n5.Vrijdag\n6.Zaterdag\n7.Zondag");
            if (keyboard.hasNextInt() && ((input = keyboard.nextInt()) < 8) && input >= 1) {
                week = input;
            } else {
                System.out.println("verkeerde ingave");
                keyboard.next();

            }
        }while(week >8 || week <1);


        int dag;

        switch (week) {
            default:
                dag = 0;
                break;

            case 1:
                System.out.println(loonVerdient);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                break;
            case 6:
                System.out.println(loonVerdient * 1.25);
                break;
            case 7:
                System.out.println(loonVerdient * 1.50);
            }
        }
}

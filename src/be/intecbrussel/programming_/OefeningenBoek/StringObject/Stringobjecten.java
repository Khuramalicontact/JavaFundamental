package be.intecbrussel.programming_.OefeningenBoek.StringObject;

import java.util.Scanner;

public class Stringobjecten {


    public static void main(String[] args) {
        Scanner lengte = new Scanner(System.in);

        System.out.println("Voer een text in om de lengte af te drukken");
        String text = lengte.nextLine();
        System.out.println(text.length());


        System.out.println("Voer text om af te drukken in hoofdletters");
        String text2 = lengte.nextLine();
        System.out.println(text2.toUpperCase());


        System.out.println("Voer text voor kleine letters");
        String text3 = lengte.nextLine();
        System.out.println(text3.toLowerCase());


        System.out.println("Voer een tekst in met de letter a om die vervolgens te vervangen door o");
        String text4 = lengte.nextLine();
        System.out.println(text4.replace("a", "o"));


        int invoer = lengte.nextInt();
        System.out.println("Geef een woord in om de e's af te drukken");



    }








    }





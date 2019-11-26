package be.intecbrussel.Alles.oefeningenBoek.Opdracht14;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double lengte = 0;
        double Gewicht = 0;


        System.out.println("voer u lengte in");
        lengte = keyboard.nextDouble();

        System.out.println("voer u gewicht in");
        Gewicht = keyboard.nextDouble();

        double  bmi = Gewicht / (lengte*lengte);
        String advice = "";

        if (bmi>40){
            advice = "ziekelijk overgewicht";
        }

        else if (bmi >= 30){
            advice =  "obesitas";
        }

        else if (bmi >= 25){
        advice = "overgewicht";

        }

        else if (bmi >= 20) {
            advice = "normaal";
        }


        else {
            advice = "ondergewicht";
    }
        System.out.println(advice);
        System.out.println("U bmi = " + bmi);


    }}


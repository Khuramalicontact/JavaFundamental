package be.intecbrussel.Alles.circus;

import java.util.Scanner;

public class CircusApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean leeftijdInput = false;
        boolean dagInput = false;
        boolean voorNaInput = false;

        int leeftijd;
        int dag;
        int voorNa;
        double prijs = 25;



        System.out.println("Welkom bij de Circus Malpertus \n Basis prijs = " + prijs);

        do {
            System.out.println("Voer u leeftijd in");
            leeftijd = input.nextInt();

            if (leeftijd <= 0 || leeftijd >= 122) {
                System.out.println("verkeerd");
            } else {
                System.out.println("Correct");
                leeftijdInput =true;
            }
        } while(!leeftijdInput);


        do {
            System.out.println("Welke dag is het \n 1. Maandag \n 2. Dinsdag \n 3. Woensdag \n 4. Donderdag \n 5.Vrijdag \n 6. Zaterdag \n 7. Zondag ");
            dag = input.nextInt();

            if(dag < 1 || dag > 7 ){
                System.out.println("verkeerd");
            }else{
                System.out.println("Correct");
                dagInput = true;
            }
        }while(!dagInput);

        do {
            System.out.println("1.Voormiddag \n 2.Namiddag");
            voorNa = input.nextInt();
            if(voorNa <= 0 || voorNa >= 3){
                System.out.println("Verkeerd");
            } else{
                System.out.println("correct");
                voorNaInput = true;
            }
        }while(!voorNaInput);

        if ((leeftijd <= 12 && dag <= 5 && dag != 3)) {
            System.out.println("Gratis");
        }

        else if ((leeftijd <= 12 && dag <= 5 && dag == 3 && voorNa == 2)) {
            System.out.println("50% korting u betaald: " + prijs / 2);
        }

        else if (leeftijd > 13 && leeftijd < 65 && voorNa == 1) {
            double sum = prijs * 0.15;
            double sumkort = prijs - sum;
            System.out.println("15% korting " + sumkort);

        }else if (leeftijd > 13 && leeftijd < 65 && voorNa == 2){
            System.out.println("Prijs is = " + prijs);


        } else if( leeftijd >= 65 && voorNa == 1){
            double sum = prijs * 0.15;
            double sum1 = prijs * 0.30;
            double kort1 = prijs - sum1;
            double betalen = kort1 - sum;
            System.out.println("30% korting + Voormiddag korting 15% " + betalen);
        }
        else if (leeftijd >= 65 && voorNa == 2){
            double sum1 = prijs * 0.30;
            double kort1 = prijs - sum1;
            System.out.println("Betalen: " + kort1);
        }
        }
}

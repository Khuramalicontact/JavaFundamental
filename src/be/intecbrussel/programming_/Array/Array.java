package be.intecbrussel.programming_.Array;


import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welkom, druk op  \"ENTER\" om te beginnen ");
        scan.nextLine();

        String [] namen = {"Ali", "Kasim", "Jannet"};

        System.out.println("Kies een personage:");
        System.out.println("1. Ali");
        System.out.println("2. Kasim");
        System.out.println("3. Jannet");

        System.out.println("    ");
        System.out.println("Maak een keuze door een getal in te typen");




        int invoer;
        do {
            invoer  = scan.nextInt();

        if(invoer  == 1) {
            System.out.println("Je personage is: " +namen[0]);
        }
        else if(invoer  == 2) {
            System.out.println("Je personage is: " +namen[1]);

        } else if  (invoer  == 3) {
            System.out.println("Je personage is: " + namen[2]);

        } else {
            System.out.println("ongeldig getal probeer het nog eens");

        }} while (invoer  < 1 ||invoer   > 3);

        System.out.println("        ");


        System.out.println("Kies een random getal van 1 tot 9 voor je lucky number");

        int [][] twoD = {{1,2,3},{30,40,50},{10,234,34}};

        int luckyNumber;


        do{
            luckyNumber = scan.nextInt();
            System.out.println("Je lucky nummer is: " +twoD[(luckyNumber-1)/3][(luckyNumber-1)%3]);
        } while (luckyNumber < 1 || luckyNumber > 9);

        // zelfde als
        // if(luckyNumber == 1){
        //            System.out.println("Je lucky nummer is: " +twoD[0][0]);
        //        } else if (luckyNumber == 2){
        //            System.out.println("Je lucky nummer is: " +twoD[0][1]);
        //        }else if (luckyNumber == 3){
        //            System.out.println("Je lucky nummer is: " +twoD[0][2]);
        //        }else if (luckyNumber == 4){
        //            System.out.println("Je lucky nummer is: " +twoD[1][0]);
        //        }else if (luckyNumber == 5){
        //            System.out.println("Je lucky nummer is: " +twoD[1][1]);
        //        }else if (luckyNumber == 6){
        //            System.out.println("Je lucky nummer is: " +twoD[1][2]);
        //        }else if (luckyNumber == 7){
        //            System.out.println("Je lucky nummer is: " +twoD[2][0]);
        //        }else if (luckyNumber == 8){
        //            System.out.println("Je lucky nummer is: " +twoD[2][1]);
        //        }else if (luckyNumber == 9){
        //            System.out.println("Je lucky nummer is: " + twoD[2][2]);
        //
        //        }else{
        //            System.out.println("Ongeldig getal probeer het nog eens");
        //        }






    }
}

package be.intecbrussel.programming_.OefeningenBoek.Opdracht15;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        System.out.println("voer een getal in");
        int month = keyboard.nextInt();



        int days = 0 ;

        switch (month) {
            default: days = 0; break;
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;

        }
        System.out.println(days);

        if (month > 12){
            System.out.println(" dit is een ongeldig getal");
        }

    }
}

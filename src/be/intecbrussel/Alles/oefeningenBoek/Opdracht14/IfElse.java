package be.intecbrussel.Alles.oefeningenBoek.Opdracht14;

import java.util.Scanner;

public class IfElse {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = keyboard.nextInt();

        if (age >= 18) {
            System.out.println("U bent volwassen");
        }

        else if (age <18){
            System.out.println(" U bent een tiener");
        }else if (age <12 ) {
             System.out.println(" U bent een kind");
         }
            else {
             System.out.println("U bent een baby");
         }
            keyboard.close();
    }
}

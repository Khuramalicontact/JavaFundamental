package be.intecbrussel.programming_.BargainApp.Exer;

import java.util.Scanner;

public class BargainApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int askingPrice ;
        double bargainPrice = 0;


        System.out.println("Welcome by mine Bargainer app \n          ");

        do {
            System.out.println("Enter the asking price");
            askingPrice = input.nextInt();
            if (askingPrice <= 100) {
                bargainPrice = askingPrice - 8.77;
            } else if (askingPrice > 100 && askingPrice < 1000) ;
            {
                bargainPrice = askingPrice - 8.77;
            }

            System.out.println("Tegen bod: " + bargainPrice);
        } while (true);

    }


}

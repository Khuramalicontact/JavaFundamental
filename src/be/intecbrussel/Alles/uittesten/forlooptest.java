package be.intecbrussel.Alles.uittesten;

import java.util.Scanner;

public class forlooptest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("voer het getal in waarvan jij het veelvoud wilt");

        int a = scan.nextInt();

        System.out.println("voer het getal van de hoeveelheed in veelvouden");
        int b = scan.nextInt();

        for(int i = 0; i < b; i++) {
            System.out.println(i*a);


        }
    }}


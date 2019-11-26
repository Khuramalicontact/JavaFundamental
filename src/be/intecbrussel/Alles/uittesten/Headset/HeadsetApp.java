package be.intecbrussel.Alles.uittesten.Headset;

import java.util.Scanner;

public class HeadsetApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Headset headset = new Headset();

        headset.setWelcome("Welcome");
        System.out.println(headset.getWelcome());
        headset.power();
        do {
            headset.powerMenu();
        } while (true);


    }}







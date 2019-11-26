package be.intecbrussel.Alles.array;

import java.util.Scanner;

public class arraysVanObject {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("voer een text in");
        String text = scan.nextLine();

      String[] splitten = text.split(" ");
      for (String split: splitten){
          System.out.println(split.toUpperCase());
      }



    }
}

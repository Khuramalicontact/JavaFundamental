package be.intecbrussel.programming_.OefeningenBoek.Hoofdstuk6;

import java.util.Random;

public class LottoRandom {


    public static void main(String[] args) {

        Random random = new Random();

        int a = random.nextInt(44)+1;
        int b = random.nextInt(44)+1;
        int c = random.nextInt(44)+1;
        int d = random.nextInt(44)+1;
        int e = random.nextInt(44)+1;
        int f = random.nextInt(44)+1;

        System.out.println("nr 1 = " + a);
        System.out.println("nr 2 = " + b);
        System.out.println("nr 3 = " + c);
        System.out.println("nr 4 = " + d);
        System.out.println("nr 5 = " + e);
        System.out.println("nr 6 = " + f);







    }
}

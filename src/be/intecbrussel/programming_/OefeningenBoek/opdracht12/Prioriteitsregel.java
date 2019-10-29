package be.intecbrussel.programming_.OefeningenBoek.opdracht12;

public class Prioriteitsregel {

    public static void main(String[] args) {

        int number = 15<10? 1 : 0;


        int a = 1;
        int b = 2;
        int result = ((++a * b-- + b )< 2) ? --a: ++b;

        System.out.println(result);
    }
}

package be.intecbrussel.Alles.classe.Constructor;

public class shirt {

    public static String color;
    public static char size;

    shirt(){}

    shirt(String newColor, char newSize){
        color = newColor;
        size = newSize;

    }

    public static void putOn(){

        System.out.println("Shirt is on!");
    }

    public static void takeOff(){

        System.out.println("shirt is off");
    }

    public static void setColor(String newColor){
        color = newColor;
    }
    public static void setSize(char newSize){
        size = newSize;
    }

    }

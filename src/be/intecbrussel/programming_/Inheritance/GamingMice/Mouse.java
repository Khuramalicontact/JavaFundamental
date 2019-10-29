package be.intecbrussel.programming_.Inheritance.GamingMice;

public class Mouse {


    String color = "Red";


    public static void leftClick() {

        System.out.println("*click*");

    }

    public static void rightclick(){
        System.out.println("*click*");

    }

    public static void scrollUp(){

        System.out.println("Scrolled up");
    }

    public static void scrollDown() {

        System.out.println("Scrolled down");

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
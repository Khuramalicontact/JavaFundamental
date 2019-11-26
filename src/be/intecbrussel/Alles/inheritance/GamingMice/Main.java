package be.intecbrussel.Alles.inheritance.GamingMice;

public class Main {

    public static void main(String[] args) {

        Mouse2 m2 = new Mouse2();

        m2.leftClick();
        m2.rightclick();
        m2.scrollDown();
        m2.scrollUp();

        m2.connect();

        m2.setColor("Matte blue");
        System.out.println(m2.color);



    }
}

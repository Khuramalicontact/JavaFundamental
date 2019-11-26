package be.intecbrussel.Alles.classe.Demo;


public class Main {


    public static void main(String[] args) {
        Pen pen = new Pen();

        System.out.println(pen.color);
        System.out.println(pen.point);
        System.out.println(pen.type);

        pen.click();

        System.out.println(pen.clicked);


       if( pen.clicked == true) {

           System.out.println("text");
       }



    }
}

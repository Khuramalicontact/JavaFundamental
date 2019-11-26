package be.intecbrussel.Alles.uittesten;

public class main {

    public static void main(String[] args) {

        penn vanChaima = new penn();

        System.out.println("soort pen:");
        System.out.println(vanChaima.color);
        System.out.println(vanChaima.type);
        System.out.println(vanChaima.point);


        System.out.println("Kan ik schrijven:");
        System.out.println(vanChaima.clicked);


        System.out.println("Ik klik op de pen ");
        vanChaima.click();

        System.out.println(vanChaima.clicked);


        System.out.println("Geen zin meer om te schrijven");
        vanChaima.unclicked();

        System.out.println(vanChaima.clicked);


    }
}

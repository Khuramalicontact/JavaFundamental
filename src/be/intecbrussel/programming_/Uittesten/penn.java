package be.intecbrussel.programming_.Uittesten;

public class penn {

    String type = "Balpen";
    String color = "Blauw";
    int point = 10;

    static boolean clicked = false;

    public static void click(){
        clicked = true;
    }

public static void unclicked(){
        clicked = false;
}

}

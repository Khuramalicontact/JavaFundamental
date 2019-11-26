package be.intecbrussel.Alles.oefeningenBoek.exercises;

public class choiceapp {
    public static void main(String[] args) {

        int temperature = 35;

        if(temperature>30){
            System.out.println("it is hot, turn on the airco please");
        } else if (temperature<18) {
            System.out.println("i can live with this temperature");
        }
    }
}

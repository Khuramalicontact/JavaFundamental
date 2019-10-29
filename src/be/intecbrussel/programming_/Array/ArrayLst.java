package be.intecbrussel.programming_.Array;



import java.util.ArrayList;

public class ArrayLst {

    public static void main(String[] args) {

        //alles uitprinten uit een array
        //   for(String fruit : fruits){
        //          System.out.println(fruit);

        String [] fruits = new String[5];
        fruits [0] = "Mango";
        fruits [1] = "Apple";
        fruits [2] = "Strawberry";
        System.out.println(fruits[0]);

        ArrayList fruitlist = new ArrayList();
        fruitlist.add("Mango");
        fruitlist.add("Apple");
        fruitlist.add("Strawberry");
        fruitlist.add("Watermelon");

        fruitlist.remove("Strawberry");
        //fruitlist.clear();
        System.out.println(fruitlist.contains("Banana"));
        System.out.println(fruitlist);



    }
}

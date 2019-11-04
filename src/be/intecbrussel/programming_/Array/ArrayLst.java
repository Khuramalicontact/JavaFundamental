package be.intecbrussel.programming_.Array;



import java.util.ArrayList;

public class ArrayLst {

    public static void main(String[] args) {


        String[] fruits = new String[4];
        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[2] = "Strawberry";
        fruits[3] = "Watermelon";
        System.out.println(fruits[3]);

        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Watermelon");

        fruitList.remove("Strawberry");
//		fruitList.clear();
        System.out.println(fruitList.contains("Mango"));


        System.out.println(fruitList);
    }

}
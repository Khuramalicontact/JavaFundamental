package be.intecbrussel.programming_.Array;

public class Arrayveelvouden {

    public static void main(String[] args) {


        //lengte van array
        int [] veelVoud = new int[20];


        //vul de array
        int n;
        for(n = 0; n < veelVoud.length; n++){
            veelVoud[n] = n * 7;
        }
        //Print de array
        for(int x = 0; x < veelVoud.length; x++) {
            System.out.println(veelVoud [x]);
        }

        System.out.println(veelVoud[5]);








    }





    }


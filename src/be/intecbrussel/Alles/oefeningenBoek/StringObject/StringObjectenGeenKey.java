package be.intecbrussel.Alles.oefeningenBoek.StringObject;

public class StringObjectenGeenKey {


    public static void main(String[] args) {


        String a = "pannekoek";
        String b = "banaan";
        System.out.println(a == b);

        System.out.println(a);



        String spatie = "    appel       ";
        System.out.println(spatie.replaceAll("[\\s|\\u00A0]+", ""));

    }


}

package be.intecbrussel.Alles.classe.Demo;

public class PersonApp {

    public static void main(String[] args) {

        //declaring and initializing the
        //variables that point to Person objects
        Person sister = new Person();
        Person brother = new Person();

        sister.setName("Anne");
        System.out.println(sister.getName());

        sister.setAge(99);
        System.out.println(sister.getAge() + " jaar");
    }
}

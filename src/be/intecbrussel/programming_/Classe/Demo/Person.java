package be.intecbrussel.programming_.Classe.Demo;

public class Person {

    //Defining the instance variables
    private String name;
    private int age;
    private double height;
    private int score;



    public void setName(String inputName)  {
        name = inputName;
    }

    public String getName () {
     return name;

    }

    public void setAge(int age) {
        if(age>0 && age<100) {
           this.age = age;
        }

    }

    public int getAge() {
        return age;
    }


    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public int getScore(int i) {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
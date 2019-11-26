package be.intecbrussel.Alles.zoo;

public  class Animal {

    private String name;
    private int age;
    private double weight;
    private String gender;



    public Animal() {
        super();
       //super of this("",0,0,""); bij default
    }

    public Animal(String name, int a, double w, String g){
        this.name = name;
        this.age = a;
        this.weight = w;
        this.gender = g;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Animal \n name:" + name + "\n age:" + age + "\n weight:" + weight + "\n gender= " + gender;
    }
}

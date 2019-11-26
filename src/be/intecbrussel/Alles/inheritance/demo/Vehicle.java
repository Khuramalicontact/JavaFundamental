package be.intecbrussel.Alles.inheritance.demo;

public  class Vehicle {
// abstract betekend niet dat je hem niet kan initialiseren



    private Engine engine;
    private int capacityPeople;
    private long capacityGoods;
    private int wheelCount;
    private double speed;

    public void accelerateForward(){
        System.out.println("Vroom");


    }

    public void accelerateBackward(){
        System.out.println("moorV");
    }

}

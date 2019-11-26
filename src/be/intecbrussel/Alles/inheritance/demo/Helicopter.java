package be.intecbrussel.Alles.inheritance.demo;

public class Helicopter extends Vehicle{

    private boolean hasBlades;
    private int bladeCount;

    @Override // controle of er een spelfout is , spelfout creeert nieuwe methode
    public void accelerateForward() {
        super.accelerateForward();
        System.out.println("Helicopter starts moving");
    }

    @Override
    public void accelerateBackward() {

    }

    public void accelerateSideways(){

    }


    public void accelerateUp(){

    }

    public void fallDown(){



    }

}

package be.intecbrussel.Alles.parkspot;

public  class Car {


    private String brandName;
    private double weight;



    public Car(String brandName, double weight){
    this.brandName = brandName;
    this.weight = weight;

    }

    public Car (String  brandName){
    this.brandName = brandName;


    }

    public Car (Car carIn){
        this.brandName = carIn.brandName;
        this.weight = carIn.weight;

    }

    public void Fuelup(){

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "\n Merk: \n" + brandName + "\n Gewicht: \n" +  weight;
    }
}

package be.intecbrussel.Alles.parkspot;

import java.util.Arrays;

public class CarPark {

    private String name;
    Car[] parking = new Car[0];

  public  CarPark(String name, Car[] parking){
       this.name = name;
       this.parking = parking;

   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car[] getParking() {
        return parking;
    }

    public void setParking(Car[] parking) {
        this.parking = parking;
    }

    public CarPark(String name){
       this.name = name;

   }

   CarPark(){

   }

   public void AddCar(Car car){
       parking = Arrays.copyOf(this.parking, this.parking.length+1);
       parking[parking.length -1 ] = car; //Kijk jaimie zijn drive dit is niet de jiuste manier dit is voor een dierentuin
   }

    @Override
    public String toString() {
        return Arrays.toString(parking);
    }
}

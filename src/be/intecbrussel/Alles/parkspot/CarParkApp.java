package be.intecbrussel.Alles.parkspot;

public class CarParkApp {

    public static void main(String[] args) {
        CarPark cars = new CarPark();
        Peugot car1 = new Peugot("Peugot", 1200);
        Tesla car2 = new Tesla("Tesla", 3000);
        Car car3  = new Car("Audi", 1500);
        Peugot car4 = new Peugot("Peugot",1200);
        Car car5 = new Car("BMW", 1800);
        Tesla car6 = new Tesla("Tesla", 3000);
        Car car7 = new Car("Audi", 1500);
        Tesla car8 = new Tesla("Tesla", 300);

        cars.AddCar(car1);
        cars.AddCar(car2);
        cars.AddCar(car3);
        cars.AddCar(car4);
        cars.AddCar(car5);
        cars.AddCar(car6);
        cars.AddCar(car7);
        cars.AddCar(car8);

        System.out.println(cars);

    }
}

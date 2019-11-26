package be.intecbrussel.Alles.parkspot;

public class Tesla extends Car {


    public Tesla(String name, double weight) {
        super(name, weight);
    }

    public Tesla(String name) {
        super(name);
    }

    public Tesla(Car c) {
        super(c);
    }

    @Override
    public void Fuelup() {
        super.Fuelup();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

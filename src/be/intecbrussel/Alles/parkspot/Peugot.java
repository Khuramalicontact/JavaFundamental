package be.intecbrussel.Alles.parkspot;

public class Peugot extends Car {

    public Peugot(String name, double weight) {
        super(name, weight);
    }

    public Peugot(String name) {
        super(name);
    }

    public Peugot(Car c) {
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

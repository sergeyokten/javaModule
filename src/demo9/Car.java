package demo9;

public class Car {
    String model;
    double volume;
    int power;

    public Car() {
    }

    public Car(String model, double volume, int power) {
        this.model = model;
        this.volume = volume;
        this.power = power;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", volume=" + volume +
                ", power=" + power +
                '}';
    }
}

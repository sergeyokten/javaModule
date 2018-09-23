package demo25;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("kareta", Type.PICKUP);
        System.out.println(car.getType().getSeats());
        System.out.println(car);

        System.out.println(Type.PICKUP.name());
        System.out.println(Type.PICKUP.ordinal());
        Type[] values = Type.values();
        for (Type type : values) {
            System.out.println(type.name() + " " + type.ordinal());
        }


    }
}

class Car {
    private String model;
    private Type type;

    public Car(String model, Type type) {
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    //...get set equals hashcode


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}


enum Type {
    SEDAN(5), PICKUP(7);

    private int seats;

    Type() {
    }

    Type(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}

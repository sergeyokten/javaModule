package demo23;


public class Car {
    private String manufacturer;
    private String model;
    private String type;
    private Engine engine;

    public Car() {
    }

    public Car(String manufacturer, String model, String type, Engine engine) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.type = type;
        this.engine = engine;
    }

    public Car(
            String manufacturer,
            String model,
            String type,
            /*engine props*/
            String engineModel,
            double engineVolume,
            int horsePower) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.type = type;
        this.engine = new Engine(engineModel, engineVolume, horsePower);
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (!getManufacturer().equals(car.getManufacturer())) return false;
        if (!getModel().equals(car.getModel())) return false;
        if (!getType().equals(car.getType())) return false;
        return getEngine().equals(car.getEngine());
    }

    @Override
    public int hashCode() {
        int result = getManufacturer().hashCode();
        result = 31 * result + getModel().hashCode();
        result = 31 * result + getType().hashCode();
        result = 31 * result + getEngine().hashCode();
        return result;
    }


    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", engine=" + engine +
                '}';
    }

    public void start(int t){
        this.engine.start(t);
    }
}



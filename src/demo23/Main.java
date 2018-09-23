package demo23;

public class Main {
    public static void main(String[] args) {


        Engine engine = new Engine("ej 204", 2.0, 165);

        Car car = new Car("subaru", "legacy", "sedan", engine);
        Car car2 = new Car("subaru", "outback", "universal", engine);

        Car bmw = new Car("bmw", "321i", "sedan", "f21", 2.1, 180);

//        Engine carEngine = car.getEngine();
//        int horsePower = carEngine.getHorsePower();
        Engine bmwEngine = bmw.getEngine();
        System.out.println(bmwEngine);

        bmw.start(3);

    }
}

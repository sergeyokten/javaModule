package demo9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("e300", 3.0, 240);
        Car car2 = new Car("200", 2.2, 150);
        Car car3 = new Car("legacy", 3.0, 251);
        Car car4 = new Car("legacy", 2.0, 165);
        Car car5 = new Car("x6", 5.0, 360);
        Car car6 = new Car("321i", 2.1, 160);
        Car car7 = new Car("x6", 6.0, 398);

//        Car[] cars = {car1, car2, car3, car4, car5, car6, car7};
//        System.out.println(cars.length);
//        System.out.println(Arrays.toString(cars));
//        System.out.println("---------------------");
//        for (Car car : cars) {
//            System.out.println(car);
//        }
//        System.out.println("---------------------");
//        for (int i = 2; i < cars.length - 1; i++) {
//            Car car = cars[i];
//            System.out.println(car);
//        }
//
//        System.out.println("--------------------------");
//
//        int index = 0;
//
//        while (index < cars.length) {
//            Car car = cars[index];
//            System.out.println(car);
//            index++;
//        }
//        System.out.println("--------------------------");
//
//        for (Car car : cars) {
//            if (car.volume >= 3) {
//                System.out.println(car);
//            }
//        }


        Car[] cars = new Car[7];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;
        cars[4] = car5;
        cars[5] = car6;
        cars[6] = car7;

        Car[] cars2 = new Car[100];

        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            if (car.power > 170) {
                cars2[i] = car;
            }

        }

        System.out.println(Arrays.toString(cars2));



//        for (Car car : cars) {
//            if (car.power > 170) {
//                System.out.println(car);
//            }
//        }


    }

}

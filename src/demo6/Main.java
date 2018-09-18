package demo6;

import demo5.User;

public class Main {
    public static void main(String[] args) {

        User kokos = new User(1, "Kokos", 21, 10000);
        User abrikos = new User(2, "Abrikos", 22, 9000);
        User tomat = new User(3, "Tomat", 35, 30000);

        String result;
//        boolean b = kokos.age > abrikos.age;
//        if (b) {
//            result = "kokos is older";
//        } else {
//            result = "abrikos is older";
//        }
//
//        System.out.println(result);

        if (kokos.age > abrikos.age && kokos.age > tomat.age) {
            result = "kokos is older";
        } else if (abrikos.age > kokos.age && abrikos.age > tomat.age) {
            result = "tomat is older";
        } else if (tomat.age > kokos.age && tomat.age > abrikos.age) {
            result = "tomat is older";
        } else {
            result = "default";
        }

        System.out.println(result);

        boolean isRoadClear = true;
        boolean isColorGreen = false;

//        if (isColorGreen && isRoadClear) {
//            System.out.println("you can go!");
////            if(){}else i....
//
//        } else {
//            if () {
//                if () {
//                }
//            } else {
//                if () {
//
//                }
//            }
//            System.out.println("wait");
//        }


    }
}

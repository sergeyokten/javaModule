package demo7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Fighter fighter = null;
        System.out.println("choose your fighter");

        String key = new Scanner(System.in).nextLine();

        switch (key) {
            case "one":
                fighter = new Fighter("sub-zero", 100);
                break;
            case "two":
                fighter = new Fighter("scorpion", 110);
                break;

            default:
                fighter = new Fighter("shao-kahn", 200);
        }

        System.out.println(fighter);
    }
}

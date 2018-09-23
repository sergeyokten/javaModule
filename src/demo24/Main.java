package demo24;

public class Main {
    public static void main(String[] args) {

//        President banan = new President("banan");
//        President kartoshka = new President("kartoshka");

        President president = President.getInstance("abrikos");
        President tomat = President.getInstance("tomat");


        System.out.println(president);
    }
}

class President {
    private String name;
    private static President president = new President();

    private President() {

    }

    public static President getInstance(String name) {
        president.name = name;
        return president;
    }


    @Override
    public String toString() {
        return "President{" +
                "name='" + name + '\'' +
                '}';
    }
}

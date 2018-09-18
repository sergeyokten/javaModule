package demo10;

public class Main {

    static int x = 100;
    public static void main(String[] args) {

        System.out.println(x);

        User[] boys = {
                new User("Vasya", 21),
                new User("Petya", 25),
                new User("Max", 19)
        };


        User[] vegetables = {
                new User("Kokos", 222),
                new User("abrikos", 254),
                new User("tomat", 194)
        };


        User[] girls = {
                new User("anya", 19),
                new User("olya", 21),
                new User("masha", 20)
        };

//        Helper helper = new Helper();
//        helper.iterator(boys);
//        helper.iterator(girls);
//        helper.iterator(vegetables);
//
//        Helper helper2 = new Helper(boys);
//        helper2.iterator(girls);

        Helper.iterator(girls);

    }


}

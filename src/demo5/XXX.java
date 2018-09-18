package demo5;

public class XXX {
    public static void main(String[] args) {


        User kokos = new User(1, "Kokos", 21, 10000);
        User abrikos = new User(2, "Abrikos", 22, 9000);
        // > < >= <= == != .equals
        boolean result = kokos.age > abrikos.age;
        result = kokos.cash != abrikos.cash;
        System.out.println(result);

        String a = "oktenweb";
        String b = new String("oktenweb");
        System.out.println(a == b);
        System.out.println(a.equals(b));


    }
}

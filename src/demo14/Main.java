package demo14;

public class Main {
    public static void main(String[] args) {


        int i = 0;

        increment(i);

        System.out.println(i);
        User user = new User(100);
        increment(user);
        System.out.println(user);




    }

    public static void increment(int i) {
        ++i;
    }public static void increment(User user) {
        ++user.id;
    }
}

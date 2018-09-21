package demo13;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1 , "kokos");
        User user2 = new User(1 , "kokos");

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

    }
}

package demo41_linkedHashSet;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {


        LinkedHashSet<User> users = new LinkedHashSet<>();
        users.add(new User(2, "kokos"));
        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        users.add(new User(6, "mango"));
        System.out.println(users);


    }
}

package demo36_list_linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<User> users = new LinkedList<>();
        users.add(new User(1, "kokos"));
        users.add(new User(2, "tomat"));
        users.add(new User(4, "abrikos"));
        users.add(new User(3, "ananas"));
        users.add(new User(6, "anavas"));
        users.add(new User(4, "abrikos"));
        users.add(new User(7, "potato"));

        users.addFirst(new User(100, "first"));
        System.out.println(users);
        System.out.println(users.element());
        System.out.println(users.indexOf(new User(1, "kokos")));
        User pop = users.pop();
        System.out.println(pop);
        System.out.println(users);
        users.push(new User(200, "qwieyiquwye"));
        System.out.println(users);
        users.removeFirstOccurrence(new User(4, "abrikos"));
        System.out.println(users);
        User user = users.pollFirst();



    }
}

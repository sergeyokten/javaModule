package demo40_hashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<User> userHashSet = new HashSet<>();
        userHashSet.add(new User(1, "kokos"));
        userHashSet.add(new User(2, "tomat"));
        userHashSet.add(new User(3, "abrikos"));
        userHashSet.add(new User(1, "kokos"));
        System.out.println(userHashSet);

        User asd = new User(123, "asd");
        System.out.println(asd.hashCode());

        System.out.println(userHashSet.contains(new User(1, "kokos")));


    }
}


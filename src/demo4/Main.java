package demo4;

import demo2.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(2, "kokos", "2222", (byte) 21, "man", 67.5F, 176.1, true, '*');
        User user2 = new User(10, "abrikos", "1234", (byte) 34, "woman", 45.5F, 172.1, true, '^');
        double result = (double) user2.age / (double) user1.age;// ctrl alt v
        System.out.println(result);

        user1.age = user1.age + 10;
        System.out.println(user1.age);
        user1.age++;
        System.out.println(user1.age);
        ++user1.age;
        System.out.println(user1.age);
        user1.age += 1;
        System.out.println(user1.age);

        System.out.println(12 % 3);
        System.out.println(user1.age + user2.age + user2.login);
        System.out.println(user2.login + (user1.age + user2.age));

    }
}

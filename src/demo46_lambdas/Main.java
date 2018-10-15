package demo46_lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        users.add(new User(6, "mango"));

//        users.forEach(new Consumer<User>() {
//            @Override
//            public void accept(User user) {
//                System.out.println(user);
//            }
//        });
//        users.forEach(user -> System.out.println(user));

//        users.replaceAll(user -> {
//            if (user.getId() % 2 == 0) {
//                user.setName("EVEN");
//            }
//            return user;
//        });


//        users.removeIf(user -> user.getId() % 2 == 0);
//        users.sort((o1, o2) -> o2.getId() - o1.getId());

//        users.forEach(System.out::println);

//        Test test = new Test() {
//            @Override
//            public int testMethod(int y) {
//                return y + 100;
//            }
//        };
//
//        Test test1 = y -> /*return*/ y + 100;

        final int[] x = {0};
        users.forEach(user -> {
            System.out.println(user);
            x[0]++;
        });
        System.out.println(Arrays.toString(x));


    }


    @FunctionalInterface
    interface Test {
        int testMethod(int x);
    }
}

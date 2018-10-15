package demo48_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(6, "mango", false));
        users.add(new User(1, "ananas", true));
        users.add(new User(3, "banan", false));
        users.add(new User(2, "kokos", true));
        users.add(new User(6, "mango", false));
        users.add(new User(5, "tomat", false));
        users.add(new User(4, "potatos", true));

//        users
//                .stream()
//                .distinct()
//                .sorted((o1, o2) -> o2.getId() - o1.getId())
//                .filter(user -> !user.getName().startsWith("a"))
//                .forEach(user -> System.out.println(user));

//        users.stream().peek(user -> user.setId(user.getId() + 100)).forEach(System.out::println);
//        users.stream().map(user -> { user.setId(2000);return user; }).forEach(user -> System.out.println(user));


//        Optional<User> max = users.stream().max((o1, o2) -> o1.getId() - o2.getId());
//        User user = max.get();
//        users.stream().limit(2).forEach(user -> System.out.println(user));

//        System.out.println("asdasdasda");
//        List<User> collect = users.stream().distinct().collect(toList());
//        collect.forEach(user -> System.out.println(user));

//        boolean b = users.stream().anyMatch(user -> user.getId() == 1);
//        users.stream().allMatch(user -> user.getId() == 1);
//        List<Integer> integers = Arrays.asList(11, 2, 33, 44, -5);
//        integers.stream().reduce(100, (integer, integer2) -> {
//                    int result = integer + integer2;
//                    System.out.println(integer + " " + integer2 + " " + result);
//                    return result;
//                }
//        );
//        Integer reduce = integers.stream().reduce(0, (integer1, integer2) -> integer1 < integer2 ? integer1 : integer2);
//        System.out.println(reduce);

        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        Arrays
                .asList(data)
                .stream()
                .flatMap(stringsArray -> Arrays.stream(stringsArray))
                .forEach(s -> System.out.println(s));

    }
}



package demo38_list_sort;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        users.add(new User(6, "mango"));


//        Comparator<User> userComparator = new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
////                return o1.getId() - o2.getId();
//
//                return o1.getName().compareToIgnoreCase(o2.getName());
//            }
//
//        };

        ComparatorById userComparator = new ComparatorById();

        users.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
//                return o1.getId() - o2.getId();
                return o1.getName().compareToIgnoreCase(o2.getName());
            }

        });
        System.out.println(users);

    }
}

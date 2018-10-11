package demo37_list_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        users.add(new User(6, "mango"));

//        for (int i = 0; i < users.size(); i++) {
//            System.out.println(users.get(i));
//
//        }


//        for (User user : users) {
//            System.out.println(user);
//            if (user.getId() % 2 == 0) {
//                users.remove(user);
//            }
//        }


        Iterator<User> iterator = users.iterator();

//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());

        while (iterator.hasNext()) {
            User user = iterator.next();
            System.out.println(user);
            if (user.getId() % 2 == 0) {
                iterator.remove();
            }

        }

        System.out.println(users);


    }

}

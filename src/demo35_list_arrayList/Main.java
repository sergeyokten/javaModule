package demo35_list_arrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("one"); // 0
        strings.add("work");
        strings.add("foo");
        strings.add("world");
        strings.add("oktenweb");
        System.out.println(strings);
        strings.add("qwyetrqwtrey");
        System.out.println(strings);
        strings.remove("work");
        System.out.println(strings);
        strings.add(1, "new element");
        System.out.println(strings);
        System.out.println(strings.size());
        System.out.println(strings.contains("oktenweb"));
        System.out.println(strings.get(0));
        List<String> subList = strings.subList(2, 5);
        System.out.println(subList);
        System.out.println(strings.isEmpty());
        strings.set(0, "quyqtweuyqtweuyt");
        System.out.println(strings);

        List<String> cars = new ArrayList<>();
        cars.add("subaru");
        cars.add("toyota");

        List<String> cars2 = new ArrayList<>();
        cars2.add("subaru");
        cars2.add("toyota");
        strings.addAll(cars);
        System.out.println(strings);
        System.out.println(strings.containsAll(cars2));
        strings.removeAll(cars2);
        System.out.println(strings);

        System.out.println(strings.indexOf("foo"));
        Object[] objects = strings.toArray();


    }

}

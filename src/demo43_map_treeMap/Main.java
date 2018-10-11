package demo43_map_treeMap;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<String, User> stringUserMap = new TreeMap<>();
        stringUserMap.put("madMax", new User(1, "Max"));
        stringUserMap.put("crazy sofi", new User(2, "Sofiya"));
        stringUserMap.put("guffy", new User(3, "Anton"));
        stringUserMap.put("doctor", new User(123, "Roma"));
        System.out.println(stringUserMap);

//        stringUserMap.ceilingEntry()
//        stringUserMap.floorEntry()


    }

}

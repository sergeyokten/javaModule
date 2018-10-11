package demo42_map_hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


//        "petya" ->new Friend("Sasha Petrov", 31);


        Map<String, Friend> stringFriendMap = new HashMap<>();
        stringFriendMap.put("Petya", new Friend("Sasha Petrov", 31));
        stringFriendMap.put("Borya", new Friend("Sasha Borisov", 30));
        System.out.println(stringFriendMap);

        Friend borya = stringFriendMap.get("Borya");
        System.out.println(borya);
        Set<String> keySet = stringFriendMap.keySet();
        System.out.println(keySet);
        Collection<Friend> values = stringFriendMap.values();
        System.out.println(values);
        System.out.println(stringFriendMap.containsKey("Petya2"));

        stringFriendMap.replace("Petya", new Friend("asd", 123));
        System.out.println(stringFriendMap);


    }
}

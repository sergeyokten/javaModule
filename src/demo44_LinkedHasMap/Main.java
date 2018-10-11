package demo44_LinkedHasMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, User> stringUserLinkedHashMap = new HashMap<>();
        stringUserLinkedHashMap.put("asd", new User(1, "asd"));
        stringUserLinkedHashMap.put("qwe", new User(2, "qwe"));
        stringUserLinkedHashMap.put("zxc", new User(3, "zxc"));
        stringUserLinkedHashMap.put("asdqwe", new User(5, "asdweq"));
        stringUserLinkedHashMap.put("asdzxc", new User(4, "asdzxc"));

        System.out.println(stringUserLinkedHashMap);

    }
}

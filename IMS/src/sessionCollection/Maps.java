package sessionCollection;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        hashMap();
//        linkedHashMap();
//        treeMap();
    }

    public static void hashMap() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "A");
        hashMap.put(2, "B");
        hashMap.put(3, "C");
        hashMap.put(4, "D");

        System.out.println(hashMap.get(4));

//        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
    }

    public static void linkedHashMap() {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(10, "F");
        linkedHashMap.put(34, "E");
        linkedHashMap.put(23, "G");
        linkedHashMap.put(41, "H");

        Iterator<Map.Entry<Integer, String>> iterator = linkedHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static void treeMap() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(110, "X");
        treeMap.put(342, "Y");
        treeMap.put(232, "Z");
        treeMap.put(410, "W");

        treeMap.forEach((k, v) -> System.out.println((k + ":" + v)));
    }


}
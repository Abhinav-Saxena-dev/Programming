package com.java.CollectionTest;

import java.util.*;
                              // HASH MAP AND TREE MAP RETURN NULL IF NO KEY IS FOUND.
public class HassssshMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();  //Map<Key, Value>
        map.put(1, "anit"); // puts value inside map as a key value pair.
        map.put(2, "Bakasa");
        map.put(33, "Rustam");
        map.put(6, "Loreal");
        map.put(4, "Head");
        System.out.println(map);
        System.out.println(map.get(33)); // gets value of the key, such as here key was 33.
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        Set hash = map.entrySet();  // keyset gives only keys.
        Iterator it = hash.iterator(); //what can we pass inside <...>
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        Map<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(22, "Pikachu");
        map2=add(map2);
        System.out.println(map2);
        map2.putAll(map); // puts All entries of map 1 into map 2.
        System.out.println(map2);
        map2.remove(23);  //removes the key value pair
        map2.replace(22, "charmender"); //replaces the value of key 22.
        System.out.println(map2);
        map2.replaceAll((k,v)->"Hat chutiya"); //replaces all the values.
        System.out.println(map2);
        // map.containsKey(---); returns true or false.
    }
    public static Map<Integer, String> add(Map<Integer, String> map2){
        map2.putIfAbsent(23, "chutiya"); //adds key value if it's not in it already
        return map2;
    }
}

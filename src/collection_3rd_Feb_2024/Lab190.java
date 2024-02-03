package src.collection_3rd_Feb_2024;

import java.util.HashSet;
import java.util.Set;

public class Lab190 {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("apple");
        fruits.add("Water Melon");
//        fruits.add(123);
        System.out.println(fruits);
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.size());
        System.out.println(fruits.contains("apple"));



    }
}

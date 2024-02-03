package src.collection_3rd_Feb_2024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab197 {
    public static void main(String[] args) {

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(123456);
        integerSet.add(12345);
        integerSet.add(1234);
        integerSet.add(123);
        integerSet.add(12);
        integerSet.add(null);
        System.out.println(integerSet);

        Set<Integer> integerSet2 = new LinkedHashSet<>();
        integerSet2.add(123456);
        integerSet2.add(12345);
        integerSet2.add(1234);
        integerSet2.add(12);
        integerSet2.add(123);
        integerSet2.add(null);
        System.out.println(integerSet2);


        Set<Integer> integerSet3 = new TreeSet<>();
        integerSet3.add(11);
        integerSet3.add(8);
        System.out.println(integerSet3);




    }
}

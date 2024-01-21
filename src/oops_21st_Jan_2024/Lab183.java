package src.oops_21st_Jan_2024;


import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
// import java.util.*; This is bad practice

public class Lab183 {
    public static void main(String[] args) {
        List<String> courseList = new ArrayList<>();
        courseList.add("ATB");
        courseList.add("MTB");
        courseList.add("PyATB");
        courseList.add("LAPIB");
        courseList.add("SDET Blueprint");

        List numList = new ArrayList();
        numList.add(150);
        numList.add(100);
        numList.add(100);
        numList.add(399);

        courseList.addAll(numList);
        System.out.println(courseList);


        Iterator iterator = courseList.iterator();
        while(iterator.hasNext()){
//            courseList.add("GEN AI");
            System.out.println(iterator.next());
        }







    }
}

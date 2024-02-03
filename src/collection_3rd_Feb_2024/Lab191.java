package src.collection_3rd_Feb_2024;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab191 {
    public static void main(String[] args) {

        Set courseSets = new HashSet();
        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("SDET Blueprint");
        courseSets.add("Java for Testers");

        System.out.println(courseSets);
        for (Object o : courseSets) {
            System.out.println(o);
        }


        Iterator it = courseSets.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }





    }
}

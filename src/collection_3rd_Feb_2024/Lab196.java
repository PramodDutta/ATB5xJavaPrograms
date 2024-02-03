package src.collection_3rd_Feb_2024;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab196 {
    public static void main(String[] args) {

        Queue integerQueue = new PriorityQueue<>();
        integerQueue.add("A");
        integerQueue.add("B");
        integerQueue.add("C");
        System.out.println(integerQueue);
        integerQueue.poll();
        System.out.println(integerQueue);

        Iterator iterator = integerQueue.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }


    }
}

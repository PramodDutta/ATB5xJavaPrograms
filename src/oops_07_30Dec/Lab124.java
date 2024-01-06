package src.oops_07_30Dec;

import java.util.Scanner;

public class Lab124 {
    public static void main(String[] args) {

        // 12,23,45,90
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n = sc.nextInt();
        int [] int_array = new int[n];

        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            int_array[i] = sc.nextInt();
        }

        System.out.println(" -- Output");

        for (int i = 0; i < n; i++) {
            System.out.println(int_array[i]);
        }

        sc.close(); // JVM will slap you


    }
}

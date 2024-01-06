package src.oops_07_30Dec;

import java.util.Scanner;

public class Lab122 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a");
        int a = sc.nextInt();
        System.out.println("Enter the b");
        int b = sc.nextInt();

        a = a+b; // 43+12 -> 55
        b = a-b; // 55-12 -> 43
        a = a-b; //  55-43 -> 12



        System.out.println("Value of a -> " + a);
        System.out.println("Value of b -> " + b);


    }
}

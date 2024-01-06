package src.oops_07_30Dec;

import java.util.Scanner;

public class Lab123 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the a");
            int a = sc.nextInt();
            System.out.println("Enter the b");
            int b = sc.nextInt();

            a = a * b;
            b = a / b;
            a = a / b;


            System.out.println("Value of a -> " + a);
            System.out.println("Value of b -> " + b);

        } catch (Exception e) {
            System.out.println("Not Possible zero");
        }




//        // bitwise xor
//        a = a ^ b; // BINARY AND XOR GATE
//        b = a ^ b;
//        a = a ^ b;




    }
}

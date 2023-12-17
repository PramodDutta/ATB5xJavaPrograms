package src.basic_04_17Dec;

import java.util.Scanner;

public class Lab050 {
    public static void main(String[] args) {
        // If else
        //  Yes, No
//        if(true){
//            System.out.println("True");
//        }
//        else{
//            System.out.println("False");
//        }
//
//
//        if(true){
//            System.out.println("Only If");
//        }


        // What If  - Number -> > 20, < 20 , < 10 ->

        // If, else if , else

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if( number > 20){
            System.out.println("Number is > 20");
        }else if ( number > 10){
            System.out.println("Number is > 10");
        }else {
            System.out.println("Number is < 20");
        }



    }
}

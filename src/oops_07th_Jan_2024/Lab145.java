package src.oops_07th_Jan_2024;

import java.util.Scanner;

public class Lab145 {
    public static void main(String[] args) {

//        Person p = new Person();
//        new Person();
//        Person p;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name");
        String name = sc.next();


        Person p2 = new Person(name);
        p2.printDetail();


        System.out.println("Enter the Second Name");
        String name2 = sc.next();

        Person p3 = new Person(name2);
        p3.printDetail();

        // this ->

        // p3 -> name -> Amit -> this -> p3
        // p2 -> name -> Pramod -> this -> p2
        // p ->  name -> null -> this -> nothing


        sc.close();
    }
}

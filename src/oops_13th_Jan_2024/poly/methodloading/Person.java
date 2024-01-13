package src.oops_13th_Jan_2024.poly.methodloading;

public class Person {

    // Method OverLoading -> multiple methods with same name, but different argument.

    void Gift(String a){
        System.out.println("A is a String" +  a);
    }

    int Gift(int x){
        System.out.println("X is a Int" +  x);
        return x;
    }

//    float Gift(float x){
//        System.out.println("X is a Int" +  x);
//        return x;
//    }

    int Gift(float x){
        System.out.println("X is a Int" +  x);
        return 89;
    }

    void Gift(double x){
        System.out.println("X is a double" +  x);
    }


}

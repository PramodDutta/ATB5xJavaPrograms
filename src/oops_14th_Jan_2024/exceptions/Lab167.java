package src.oops_14th_Jan_2024.exceptions;

public class Lab167 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int x = 10 / a;
        } catch (Exception e) {
            System.out.println("Exit");
//            System.exit(0); // JVM to stop
        } finally {
            System.out.println("I am final");
        }
    }
}

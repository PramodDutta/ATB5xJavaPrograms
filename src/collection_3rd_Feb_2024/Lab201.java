package src.collection_3rd_Feb_2024;

public class Lab201 {
    public static void main(String[] args) {

        // Java -> non generic ->
//
//        temp("Pramod");
//        temp(123);
//        temp(3.14);
//        temp(true);

        printFunc(3,4);

    }

    public static <T> void temp(T x) {
        System.out.println(x);
    }

    public static <T> void printFunc(T a, T b) {
        System.out.println(a);
        System.out.println(b);
        // Proper logic compare the a and b
    }
}

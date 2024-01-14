package src.oops_14th_Jan_2024.exceptions;

public class Lab169 {

    // Thorws and customeExcpetipon// Learn in the NExt Class
    // 1 Lecture - Multi Threading self paced - This week



    public static void main(String[] args) {
        extracted2();
        System.out.println("MAIN Execute");
    }


    private static void extracted2() {
        extracted1();
        System.out.println("extracted2 Execute");
    }

    private static void extracted1() {
        extracted();
        System.out.println("extracted1 Execute");
    }

    private static void extracted() {
        try {
            String name = null;
            name.length();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}

package src.oops_13th_Jan_2024.poly.methodloading;

public class RC {
    public static void main(String[] args) {

        // Method Overloading
        // Load -> same name different
        new Person().Gift(1);
        new Person().Gift("pramod");
        new Person().Gift(3.14);

    }
}

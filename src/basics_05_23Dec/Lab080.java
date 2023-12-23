package src.basics_05_23Dec;

public class Lab080 {
    public static void main(String[] args) {

        // for( A ;B ; C)
        // A -> Initialization -> JVM What variable, where you are starting point
        // B - Condition -> When you want this to stop. -> true, false
        // C ->  Increment / Decrement

        System.out.println("Print the value of i, but I want to break when i = 5");

//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Val of " + i);
//        }

        for (int i = 10; i > 0; i--) {
            System.out.println("Val of " + i);
        }

        System.out.println("End");


    }
}

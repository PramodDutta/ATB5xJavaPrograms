package src.basics_05_23Dec;

public class Lab085 {
    public static void main(String[] args) {

        // Continue -?  If this tru -> continue
        for (int i = 0; i < 10; i++) { // 10 Times, i -> 0 to 9
            System.out.println(i);
            if (i == 5) continue;
            System.out.println("**AFTER");
        }

    }

}

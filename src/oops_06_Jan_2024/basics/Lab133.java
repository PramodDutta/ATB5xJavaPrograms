package src.oops_06_Jan_2024.basics;

public class Lab133 {
    public static void main(String[] args) {

        // Immutable in nature (that can't changed)
        String s1 = "Pramod";
        String s2 = new String("Pramod");


        // Mutable - that can be changed!!

//        StringBuffer sbuf4 = new StringBuffer("Pramod");


        StringBuilder sb3 = new StringBuilder("Pramod");
        sb3.append(" Dutta");
        System.out.println(sb3);


        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);












    }
}

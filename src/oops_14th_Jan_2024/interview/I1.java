package src.oops_14th_Jan_2024.interview;

public class I1 {
    public static void main(String[] args) {
        System.out.println(H.a);
        Pramod p = new Pramod();
        p.m1();



    }
}




interface H{
    // Only Static variables

    int a =10;
    public static final int b = 20;
    public static final int c  =99;
    void m1(); // This is non static
}

class Pramod implements H{

    @Override
    public void m1() {

    }
}
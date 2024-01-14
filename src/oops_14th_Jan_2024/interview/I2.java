package src.oops_14th_Jan_2024.interview;

public class I2 {

    public static void main(String[] args) {

        System.out.println(PP.a);
        PP f  = new foo(); // Dynamic Dispatch
        Rofl f1  = new foo(); // Dynamic Dispatch
        foo f3  = new foo();
        f.m1();
        f1.say();


    }
}


interface PP{
    int a =10;
    // Only Static variables
    void m1();
}

abstract class Rofl  implements PP{
    abstract void say();
}

class foo extends Rofl{

    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    void say() {
        System.out.println("say");
    }
}
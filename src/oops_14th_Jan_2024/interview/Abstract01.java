package src.oops_14th_Jan_2024.interview;

public class Abstract01 {
}

abstract class Person01 {
    abstract void say();
    abstract void say2();
    void eat(){
        System.out.println("Hello eat from Person");
    };
}

abstract class Student1 extends Person01{
    abstract void m2();
    abstract void m3();
}

class Pramod11 extends Student1{

    @Override
    void say() {

    }

    @Override
    void say2() {

    }

    @Override
    void m2() {

    }

    @Override
    void m3() {

    }
}
package src.oops_13th_Jan_2024.abstraction.interfaces;

interface FatherI {
    void load1K();

    default void print(){
        System.out.println("I am default method");
    }

    static void print2(){
        System.out.println("I am static METHOd!");
    }
}

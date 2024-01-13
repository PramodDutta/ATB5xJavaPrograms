package src.oops_13th_Jan_2024.abstraction.interfaces;

public class PramodC implements FatherI{
    @Override
    public void load1K() {
        FatherI.print2();
        System.out.println("I will give you LOAN!");
    }
}

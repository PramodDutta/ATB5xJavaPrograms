package src.oops_13th_Jan_2024.abstraction.interfaces.realtimeexampleelsewewillwantrefund;

public class Car implements Engine, Break{
    void start(){
        System.out.println("Starting the Car");
        startEngine();
        breaks();
    }

    @Override
    public void startEngine() {
        System.out.println("Started Enginer");
    }

    @Override
    public void breaks() {
        System.out.println("break is working fine");
    }
}

package src.oops_13th_Jan_2024.abstraction.realtimeexample;

public class TC1_CHROME extends BaseClass{
    @Override
    String openBrowser() {
        System.out.println("Starting CHROME");
        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println("Closing CHROME");
        return null;
    }
}

package src.oops_20th_Jan_2024;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Lab175 {

    public static void main(String[] args) {
        String path = "C:/a.txt";
        try {
            FileInputStream f = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

package src.oops_14th_Jan_2024.exceptions;

import java.io.FileInputStream;

public class Lab164 {
    public static void main(String[] args) {
        //Unchecked Exception , Runtime
        String name = null;
        name.trim(); // Unchecked? Runtime

//
//        //Checked Exception , Compile Time -/JVM? If Knows about it, - Checked Exception
//        try{
//        FileInputStream f = new FileInputStream("dasda.txt");
//        }catch (Exception e){
//
//        }

    }
}

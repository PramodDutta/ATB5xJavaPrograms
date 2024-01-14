package src.oops_14th_Jan_2024.innerclass;

public class Lab155 {
    public static void main(String[] args) {

        Student s1 = new Student() {
            @Override
            public void setId() {

            }
        };

        s1.setId();


//        NoName s2 = new NoName();
//        s2.setId();
//










    }

    B b = new B() {
        // This is a Anoy class
        // No Name
    };





}


abstract class B{
    int var_b = 12;
}

interface Student{
    int id = 11;
    void setId();
}

//class NoName implements Student{
//
//    @Override
//    public void setId() {
//
//    }
//}
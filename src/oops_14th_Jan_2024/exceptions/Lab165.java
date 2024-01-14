package src.oops_14th_Jan_2024.exceptions;

public class Lab165 {
    public static void main(String[] args) {

        try {
            String ip = args[0];
            int a = Integer.parseInt(args[0]);
            int b = 10 / a;
            System.out.println(a);
            System.out.println(b);
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {

            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            // 100% executed
            System.out.println("I willbe executed anyHow This cock who can survive the nuclear attack");
        }

    }
}

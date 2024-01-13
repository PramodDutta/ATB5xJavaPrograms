package src.oops_13th_Jan_2024.encapsulation;

public class BadExample {

    public static void main(String[] args) {

        vwoLogin vwoLogin = new vwoLogin("admin","admin");
        // admin and admin


        boolean check = vwoLogin.isLoggedIn("admin","password");
        vwoLogin.setUsername("admin");
        System.out.println(vwoLogin.getPassword());
        boolean check2 = vwoLogin.isLoggedIn("admin","password");
        System.out.println(check2);

    }


}

class vwoLogin{

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    public String getPassword() {
        return password;
    }

    private String password;

    public vwoLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }




    boolean isLoggedIn(String username, String password){
        if(this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password))
        {
            System.out.println("Logged IN!!");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }

    }









}

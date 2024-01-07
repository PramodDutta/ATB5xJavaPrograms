package src.oops_07th_Jan_2024;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode;
    BankAccount() {
        bankName = "SBI";
        bankCode = "SBI001";
        System.out.println("Default C");
    }

    BankAccount(String bName,String bCode) {
        this.bankName = bName;
        this.bankCode = bCode;
        System.out.println("Param C");
    }

    void printDetails() {
        System.out.println("Bank Name -> " + this.bankName);
        System.out.println("Bank Code -> " + this.bankCode);
        System.out.println("Bal ->" + balance);
    }



}

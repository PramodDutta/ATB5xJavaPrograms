package src.oops_13th_Jan_2024.accessModifiers.criminal;

import src.oops_13th_Jan_2024.accessModifiers.police.Cop;

public class Thief {
    public static void main(String[] args) {

        Cop cop = new Cop(10);
        System.out.println(cop.gun);
        //cop.canIShoot();
        //He is not in the Protect Police folder


    }
}

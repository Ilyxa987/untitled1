package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // прямой доступ к полям класса - нежелателен!!!
        Ndrob fractl = new Ndrob();
       // fractl.num = 3;
       // fractl.denom = 5;
        fractl.setWhole(1);
        fractl.setNum(2);
        fractl.setDenom(10);
        Ndrob fract2 = new Ndrob();
        fract2.setNum(in.nextInt());
        fract2.setDenom(in.nextInt());
        System.out.println(fractl.multi(fract2));
    }
}



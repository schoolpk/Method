package com.tn;

import java.util.Scanner;

public class BTVN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bt BT = new bt();
        System.out.println("n: ");
        int n = sc.nextInt();
        BT.b1(n);
        BT.b2(n);
        BT.b3(n);
    }
}

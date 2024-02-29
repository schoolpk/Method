package com.tn;

public class bt {
    public int b1 (int n){
        if (n == 0) {
            return 0;
        }
        int tong = 0;
        for (int i = 1; i < n; i++) {
            tong += i;
        }
        System.out.println("B1 : " + tong);
        return tong;
    }

    public int b2 (int n){
        int mu = 0;
        if (n == 0){
            return 0;
        }
        for (int i = 1; i < n; i++) {
            mu += i*i ;
        }
        System.out.println("B2 : " + mu);
        return mu;
    }

    public double b3(int n){
        int phanso = 0;
        if ( n == 0 ) {
            return 0;
        }
        for (int i = 1; i < n; i++) {
            phanso += 1/i;
        }
        System.out.println("B3 : " + phanso);
        return phanso;
    }
}

package com.lukas.udemy_tests;

public class Butelka {


    private double ileLitrow;

    Butelka(double ileLitrow) {
        this.ileLitrow = ileLitrow;
    }

    double getIleLitrow() {
        return ileLitrow;
    }

    void wlej(double ilosc) {
        this.ileLitrow += ilosc;
    }

    boolean wylej(double ilosc) {
        if (ilosc < ileLitrow)
            this.ileLitrow -= ilosc;
        else
            return false;

        return true;
    }

    void przelej(double ilosc, Butelka gdziePrzelac) {
        if (this.wylej(ilosc)) {
            gdziePrzelac.wlej(ilosc);
        } else
            System.out.println("Za mało");
    }


    public static void main(String[] args) {
        Butelka[] butelka = new Butelka[3]; //NULL

        butelka[0] = new Butelka(20);

        String[] names;





//        butelka[0] = new Butelka(5);
//        butelka[1] = new Butelka(8);
//        butelka[2] = new Butelka(10);

        butelka[0].wlej(4);

        butelka[0].przelej(25, butelka[1]);

        System.out.println(butelka[0].getIleLitrow());
        System.out.println(butelka[1].getIleLitrow());
        System.out.println(butelka[2].getIleLitrow());

    }


}

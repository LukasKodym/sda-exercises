package com.lukas.data_scructures;

import java.util.Random;
import java.util.Scanner;

public class scructuresExercise {

    public static void main(String[] args) {

        byte[] tab1 = new byte[4];
        short[] tab2 = new short[4];
        int[] tab3 = new int[4];
        long[] tab4 = new long[4];
        char[] tab5 = new char[4];
        boolean[] tab6 = new boolean[4];
        float[] tab7 = new float[4];
        double[] tab8 = new double[4];

        System.out.println(tab8[2]);
        Random random = new Random();

        for (int i = 0; i < tab3.length - 1; i++) {
            tab3[i] = random.nextInt(20);
            System.out.println(tab3[i]);
        }

        System.out.println();

        int[] parzyste = new int[20];
        int[] nieparzyste = new int[20];

        int p = 0;
        int n = 1;

        for (int i = 0; i < parzyste.length - 1; i++) {

            parzyste[i] = p;
            p += 2;
            System.out.println(parzyste[i]);
        }
        System.out.println();
        for (int i = 0; i < nieparzyste.length - 1; i++) {

            nieparzyste[i] = n;
            n += 2;
            System.out.println(nieparzyste[i]);
        }

        int[] chart = {1, 4, 78, 3};

        Scanner scanner = new Scanner(System.in);

//        int a = scanner.nextInt();
//
//        for (int i = 0; i < chart.length ; i++) {
//            if(i==a) {return i;}
//            else
//                return; -1;





    }
}

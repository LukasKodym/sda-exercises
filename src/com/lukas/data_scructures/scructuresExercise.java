package com.lukas.data_scructures;

import java.util.Random;

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

        for (int i = 0; i < tab3.length - 1; i++) {

            Random random = new Random();
            int a = random.nextInt(20);
            tab3[i] = a;
            System.out.println(tab3[i]);
        }

        System.out.println();

        int[] parzyste = new int[20];
        int[] nieparzyste = new int[20];

        int p = 0;
        int n = 1;

        for (int i = 0; i < parzyste.length - 1; i++) {

            parzyste[i] = p;
            p = p + 2;
            System.out.println(parzyste[i]);
        }
    }
}

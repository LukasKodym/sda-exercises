package com.lukas.project;

public class ChartExercizes extends SortingMethods {


    public static void main(String[] args) {

        int[] chart = {9, 8, 7, 6, 1, 2, 3, 5, 3, 2, 4, 7, 5};
        Integer[] chart2 = {9, 8, 7, 6, 1, 2, 3, 5, 3, 2, 4, 7, 5};
        String[] name = {"Ala", "Ola", "Ela", "Iza", "Ania", "Kasia"};

        for (int i = 0; i < name.length; i++) {

            System.out.print(name[i] + ", ");
        }
//        System.out.println();
//        reverseChart(chart);
//        System.out.println();
//        moveChartElement(chart);
//        System.out.println();
//        int[] reverse = reverse(chart);
//
//        for (int i = 0; i < reverse.length; i++) {
//
//            System.out.println(reverse[i]);
//        }
//
//
//        String[] str = {"Ala", "ma", "kota", "mama"};
//
//        String s = longestWord(str);
//
//        System.out.println("\n" + s);
        System.out.println();
//        bubbleSort(chart);

        //  insertSort(chart);

        qsort(name);

        for (int i = 0; i < name.length; i++) {

            System.out.print(name[i] + ", ");
        }

//        System.out.println( "Ala".compareTo("Ola"));
    }


}








package com.lukas.project;


public class Main {

    private static String[] test2 = {"ALa", "Ola", "Ela"};
    private static Integer[] test = {1, 2, 3, 4, 5, 6};

    public static <T> int findGeneric(T[] array, T index) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(index)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(findGeneric(test, 3));
        System.out.println(findGeneric(test2, "Ela"));


    }
}

package com.lukas.project;

public class SortingMethods {

    /**
     * pierwsze 4 metody nie dotyczą sortowania, ale wykonują dzialania na tablicach
     *
     * @param x
     */

    public static void reverseChart(int[] x) {
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.println(x[i]);
        }
    }

    public static int[] reverse(int[] x) {
        int[] d = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            d[i] = x[x.length - 1 - i];
        }
        return d;
    }

    public static void moveChartElement(int[] x) {
        if (x == null || x.length == 1) {
            return;
        }
        int temp = x[0];
        for (int i = 0; i < (x.length - 1); i++) {
            x[i] = x[i + 1];
        }
        x[x.length - 1] = temp;
    }

    public static String longestWord(String[] s) {
        String temp = "";
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > temp.length()) {
                temp = s[i];
            }
        }
        return temp;
    }

    /**
     * metody sortujące zmienione na generyczne
     *
     * @param x
     */

    public static <T extends Comparable> void bubbleSort(T[] x) {
        int n = x.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (x[j].compareTo(x[j + 1]) > 0) {
                    T temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
    }
    /*
     * wersja Piotrka
     *
     */
    public static <T extends Comparable> void insertSort(T[] in) {
        int n = in.length;
        int i;
        for (int j = n - 2; j >= 0; j--) {
            T x = in[j];
            for (i = j + 1; i < n; i++) {
                if (x.compareTo(in[i]) < 0)
                    break;
                in[i - 1] = in[i];
            }
            in[i - 1] = x;
        }
    }

    /*
        metoda z internetu, przeanalizować w domu debagerem (insert sort)
      */
    public static <T extends Comparable> void inSort(T arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            T key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static int quickSort(int[] in) {
        return quickSort(in, 0, in.length - 1);
    }

    private static int quickSort(int[] in, int left, int right) {
        //base case
        if (right <= left || left >= right) {
        } else {
            int pivot = in[left];
            int i = left + 1;
            int tmp;

            //partition array
            for (int j = left + 1; j <= right; j++) {
                if (pivot > in[j]) {
                    tmp = in[j];
                    in[j] = in[i];
                    in[i] = tmp;
                    i++;
                }
            }
            //put pivot in right position
            in[left] = in[i - 1];
            in[i - 1] = pivot;
            //call qsort on right and left sides of pivot
            quickSort(in, left, i - 2);
            quickSort(in, i, right);
        }

        return 1;
    }

    public static  <T extends Comparable> T[] qsort(T[] array) {
        return qsort(array, 0, array.length - 1);
    }

    private static  <T extends Comparable> T[] qsort(T[] array, int left, int right) {
        int i, j;
        T pivot,temp;
        i = (left + right) / 2;
        pivot = array[i];
        array[i] = array[right];
        for (j = i = left; i < right; i++) {
            if (array[i].compareTo(pivot) < 0) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }
        }
        array[right] = array[j];
        array[j] = pivot;
        if (left < j - 1) {
            qsort(array, left, j - 1);
        }
        if (j + 1 < right) {
            qsort(array, j + 1, right);
        }
        return array;
    }
}

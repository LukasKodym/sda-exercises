package com.lukas.trees;

import java.util.Arrays;

public class MainTree {

    public static int binarySearch(int[] array, int value) {

        int left = 0, right = array.length - 1, middle;
        while (left <= right) {
            System.out.print(".");
            middle = (left + right) / 2;
            if (array[middle] < value) left = middle + 1;
            else if (array[middle] > value) right = middle - 1;
            else return middle;
        }
        return -1;
    }



    public static void main(String[] args) {

        int[] tab = {1, 4, 7, 12, 13, 14, 15, 21, 23, 44, 55, 66, 77, 88, 99, 100};

        System.out.println(Arrays.toString(tab));

        BinaryTreeElement binaryTreeElement = BinaryTreeElement.exampleTree();
        binaryTreeElement.toString();

        binaryTreeElement.printPreOrderList();
        System.out.println();
        System.out.println("Wysokość drzewa: " + binaryTreeElement.heightOfTree());
        System.out.println(binaryTreeElement.toFormattedJSON());
        System.out.println(binaryTreeElement.getPreOrderList());
        System.out.println(binaryTreeElement.getInOrderList());
        System.out.println(binaryTreeElement.getPostOrderList());

        System.out.println(binarySearch(tab,1));
        System.out.println(binarySearch(tab,77));
        System.out.println(binarySearch(tab,13));
        System.out.println(binarySearch(tab,100));
        System.out.println(binarySearch(tab,0));



    }

}

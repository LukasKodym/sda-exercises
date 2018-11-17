package com.lukas.trees;

public class MainTree {

    public static void main(String[] args) {

        BinaryTreeElement binaryTreeElement = BinaryTreeElement.exampleTree();
//        binaryTreeElement.toString();

        binaryTreeElement.printPreOrderList();
        System.out.println();
        System.out.println("Wysokość drzewa: " + binaryTreeElement.heightOfTree());
        System.out.println(binaryTreeElement.toFormattedJSON());
        System.out.println(binaryTreeElement.getPreOrderList());
        System.out.println(binaryTreeElement.getInOrderList());
        System.out.println(binaryTreeElement.getPostOrderList());


    }

}

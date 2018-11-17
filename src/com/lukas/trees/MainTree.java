package com.lukas.trees;

public class MainTree {

    public static void main(String[] args) {

        BinaryTreeElement binaryTreeElement = BinaryTreeElement.exampleTree();
//        binaryTreeElement.toString();

        System.out.println("Wysokość drzewa: " + binaryTreeElement.heightOfTree());
        System.out.println();
        System.out.println(binaryTreeElement.toFormattedJSON());


    }

}

package com.lukas.data_scructures;

public class QueueArray {

    private int[] array = new int[10];
    private int size = 0;

    public void push(int i) {

        array[size++] = i;

    }

    public int pop(){
        return array[size--];
    }

    public String toString(){
        return null;
        //todo to finish this method
    }

}




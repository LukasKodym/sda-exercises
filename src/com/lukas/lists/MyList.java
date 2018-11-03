package com.lukas.lists;

public class MyList {
    public Element head = null;
    public Element tail = null;
    public int count = 0;

    public void printElements(){
        Element p = head;
        while (p != null){
            System.out.println(p.data);
            p = p.next;
        }
    }
    public void printElementsRev(){
        Element p = tail;
        while (p != null){
            System.out.println(p.data);
            p = p.prev;
        }
    }

}

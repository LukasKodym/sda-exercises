package com.lukas.lists;

public class MyList {
    public Element head = null;
    public Element tail = null;
    public int count = 0;

    public void printElements() {
        Element p = head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

    public void printElementsRev() {
        Element p = tail;
        while (p != null) {
            System.out.println(p.data);
            p = p.prev;
        }
    }

    public String toString() { // here we can use class StringBuilder to use less memory

        String out = "";
        Element p = head;

        while (p != null) {
            if (p != tail) {
                out = out + p.data + ", ";
            } else {
                out = out + p.data + ".";
            }
            p = p.next;
        }
        return out;
    }

    public MyList insert(String text) {
        MyList l = new MyList();
        Element p = new Element();
        p.data = text;
        p.prev = null;
        p.next = l.head;
        l.head = p;
        l.count++;



        return this;

    }


}

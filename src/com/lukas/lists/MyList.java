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

    public MyList insert(String text) { // adding element to the begining of the list

        Element p = new Element();
        p.data = text;

        p.next = head;
        head = p;
        if (p.next != null) {
            p.next.prev = p;
        } else {
            tail = p;
        }
        count++;
        return this;
    }

    public MyList append(String text) { // adding element to the end of the list
        Element p = new Element();
        p.data = text;

        p.prev = tail;
        tail = p;
        if (p.prev != null) {
            p.prev.next = p;
        } else {
            head = p;
        }
        count++;
        return this;
    }

    public MyList insertBefore(Element nextElement, String text) {
        Element p = new Element();
        p.data = text;

        p.prev = nextElement.prev;
        p.next = nextElement;
        nextElement.prev = p;
        if (p.prev != null) {
            p.prev.next = p;
        } else {
            head = p;
        }
        count++;
        return this;
    }

    public MyList insertAfter(Element prevElement, String text) {
        Element p = new Element();
        p.data = text;

        p.prev = prevElement;
        p.next = prevElement.next;
        prevElement.next = p;
        if (p.next != null) {
            p.next.prev = p;
        } else {
            tail = p;
        }
        count++;
        return this;
    }

    public MyList delete(Element e) {

        count--;
        if (e.prev != null) {
            e.prev.next = e.next;
        }
        else {
            head = e.next;
        }
        if (e.next != null) {
            e.next.prev = e.prev;
        }
        else {
            tail = e.prev;
        }
        return this;
    }
}

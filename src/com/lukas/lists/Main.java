package com.lukas.lists;

public class Main {

    public static void main(String[] args) {
        MyList list = new MyList();

//  ręczne dodawanie elementólisty
//        // pierwszy element
//        Element e1 = new Element();
//        e1.data = "element pierwszy";
//        list.head = e1;
//        list.tail = e1;
//        list.count = 1;
//
//        // drugi element
//        Element e2 = new Element();
//        e2.data = "element drugi";
//        e2.prev = list.tail;
//        list.tail.next = e2;
//        list.tail = e2;
//        list.count++;
//
//        // trzeci element
//        Element e3 = new Element();
//        e3.data = "element trzeci";
//        e3.prev = list.tail;
//        list.tail.next = e3;
//        list.tail = e3;
//        list.count++;

        list.append("element drugi");
        list.append("element trzeci");
        list.append("element czwarty");
        list.insert("element pierwszy");
        list.insertBefore(list.head.next, "intruz");

//        list.printElements();
//        System.out.println();
//        list.printElementsRev();
//        System.out.println();
        System.out.println(list);

        list.delete(list.head.next);

        System.out.println(list);


    }
}

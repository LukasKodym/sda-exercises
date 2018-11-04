package com.lukas.stacks;

import java.util.Stack;

public class Main {

    public static String convertBase(int number, int base) {
        String result = "";
        Stack<Integer> stack = new Stack<>();
        do {
            stack.push(number % base);
            number = number / base;
        } while (number > 0);
        while (!stack.empty()) {
            result += stack.peek();
            stack.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(convertBase(12,2));
        System.out.println(convertBase(12,8));
        System.out.println(convertBase(0b1011,2));
        System.out.println(convertBase(066,8));

    }

}

package org.example.lesson9.hm9.task1;

import java.util.Stack;

public class ReverseLines {

//    Напишите класс который считывает строки с консоли до того момента как встретится строка quit
//После этого все до этого введенные строки нужно распечатать в обратном порядке.
//Например:
//one
//two
//three
//quit
//->
//three
//two
//one

    public static void main(String[] args) {

        String[] inputLines = {"one", "two", "three", "quit"};

        Stack<String> stack = new Stack<>();

        for (String line : inputLines) {
            if (line.equals("quit")) {
                break;
            }
            stack.push(line);
        }

        System.out.println("Введённые строки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

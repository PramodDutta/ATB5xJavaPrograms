package src.oops_21st_Jan_2024;

import java.util.Stack;

public class Lab188 {
    public static void main(String[] args) {

        // Stack
        Stack<String> stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        //stack.push(123);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());


    }
}

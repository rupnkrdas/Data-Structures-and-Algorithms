// import java.util.ArrayDeque;
// import java.util.Deque;
// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Stack;

import java.util.*;

public class InbuiltExamples {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // // Stack is a class here

        // stack.push(34);
        // stack.push(45);
        // stack.push(2);
        // stack.push(9);
        // stack.push(18);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop()); // gives java.util.EmptyStackException!!!

        // Queue<Integer> queue = new LinkedList<>();
        // // Queue is an interface here

        // queue.add(3);
        // queue.add(6);
        // queue.add(5);
        // queue.add(19);
        // queue.add(1);

        // System.out.println(queue.remove());
        // System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(78);
        deque.removeFirst();
        // etc etc

    }
}

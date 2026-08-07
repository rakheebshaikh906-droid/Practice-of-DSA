package Assigment;

//https://leetcode.com/problems/implement-queue-using-stacks/
//232. Implement Queue using Stacks

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ImplementQueueUsingStacks {
    Stack<Integer> First;
    Stack<Integer> second;

    // Constructor
    public ImplementQueueUsingStacks() {
        First = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        First.push(x);
    }

    public int pop() {
        if (second.isEmpty()) {
            while (!First.isEmpty()) {
                second.push(First.pop());
            }
        }
        return second.pop();
    }

    public int peek() {
        if (second.isEmpty()) {
            while (!First.isEmpty()) {
                second.push(First.pop());
            }
        }
        return second.peek();
    }

    public boolean empty() {
        return First.isEmpty() && second.isEmpty();
    }

    // MAIN METHOD FOR TESTING
    public static void main(String[] args) {
        String[] operations = {"MyQueue", "push", "push", "peek", "pop", "empty"};
        int[][] values = {{}, {1}, {2}, {}, {}, {}};

        ImplementQueueUsingStacks q = null;
        List<Object> output = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "MyQueue":
                    q = new ImplementQueueUsingStacks();
                    output.add(null);
                    break;

                case "push":
                    q.push(values[i][0]);
                    output.add(null);
                    break;

                case "peek":
                    output.add(q.peek());
                    break;

                case "pop":
                    output.add(q.pop());
                    break;

                case "empty":
                    output.add(q.empty());
                    break;
            }
        }

        System.out.println(output);
    }
}

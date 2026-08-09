package code;

import java.util.ArrayDeque;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class InBuildExample {
    static void main(String[] args) {

        //STACK IN BUILD METHOD
        Stack<Integer>stack=new Stack<>();

        // 1. push(E item) → Inserts element at top
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after push: " + stack);

        // 2. pop() → Removes and returns top element
        int removed = stack.pop();
        System.out.println("Popped element: " + removed);
        System.out.println("Stack after pop: " + stack);

        // 3. peek() → Returns top element without removing
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // 4. empty() → Checks if stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // 5. search(Object o)
        // Returns 1-based position from top, -1 if not found
        int position = stack.search(10);
        System.out.println("Position of 10 from top: " + position);

        // 6. size() → Returns number of elements
        System.out.println("Stack size: " + stack.size());

        // 7. contains(Object o) → Checks if element exists
        System.out.println("Stack contains 20? " + stack.contains(20));

        // 8. get(int index) → Get element by index
        System.out.println("Element at index 0: " + stack.get(0));

        // 9. set(int index, E element) → Replace element
        stack.set(0, 100);
        System.out.println("Stack after set(): " + stack);

        // 10. remove(int index) → Remove element at index
        stack.remove(1);
        System.out.println("Stack after remove(index): " + stack);

        // 11. clear() → Removes all elements
        stack.clear();
        System.out.println("Stack after clear(): " + stack);

        // 12. isEmpty() → Same as empty()
        System.out.println("Is stack empty? " + stack.isEmpty());





        //QUEUE IN BUILD METHOD
        Queue<Integer> q = new LinkedList<>();

        // Insert
        q.add(10);
        q.offer(20);
        q.offer(30);

        System.out.println("Queue: " + q);

        // Access
        System.out.println("Front using peek(): " + q.peek());
        System.out.println("Front using element(): " + q.element());

        // Remove
        System.out.println("Removed using poll(): " + q.poll());
        System.out.println("Removed using remove(): " + q.remove());

        System.out.println("Queue after removals: " + q);

        // Utility
        System.out.println("Size: " + q.size());
        System.out.println("Is empty? " + q.isEmpty());
        System.out.println("Contains 30? " + q.contains(30));

        q.clear();
        System.out.println("Queue after clear(): " + q);







        //ARRAYDEQUE IN BUILD METHOD
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.addLast(10);
        dq.addLast(20);
        dq.addFirst(5);

        System.out.println(dq); // [5, 10, 20]

        dq.removeFirst();       // removes 5
        dq.removeLast();        // removes 20

        System.out.println(dq); // [10]

        dq.push(100);           // stack push
        dq.push(200);

        System.out.println(dq); // [200, 100, 10]

        dq.pop();               // stack pop

        System.out.println(dq); // [100, 10]

    }
}

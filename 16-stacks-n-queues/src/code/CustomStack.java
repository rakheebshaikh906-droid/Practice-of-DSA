package code;

public class CustomStack {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor
    public CustomStack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    // Push operation
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // Check if empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Size of stack
    public int size() {
        return top + 1;
    }


    //MAIN CLASS
    public static void main(String[] args) {

        CustomStack stack = new CustomStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek()); // 30
        System.out.println(stack.pop());  // 30
        System.out.println(stack.size()); // 2
    }
}

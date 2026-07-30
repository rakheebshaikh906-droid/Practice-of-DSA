package code;

public class BubbleSort {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // ---------- INSERT AT LAST ----------
    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // ---------- GET NODE AT INDEX ----------
    private Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // ---------- BUBBLE SORT ----------
    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.val > second.val) {

                // 🔴 CASE 1: swap at HEAD
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }

                // 🔴 CASE 2: swap at TAIL
                else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }

                // 🔴 CASE 3: swap in MIDDLE
                else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }

            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }

    // ---------- DISPLAY ----------
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // ---------- MAIN ----------
    public static void main(String[] args) {

        BubbleSort list = new BubbleSort();

        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(1);
        list.insertLast(5);
        list.insertLast(2);

        System.out.print("Before Sorting: ");
        list.display();

        list.bubbleSort();

        System.out.print("After Sorting: ");
        list.display();
    }
}

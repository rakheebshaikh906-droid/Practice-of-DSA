package code;

public class ReverseLinkedList {

    static private Node head;
    static private Node tail;
    static private int size;
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
    // ---------- DISPLAY ----------
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();

        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(1);
        list.insertLast(5);
        list.insertLast(2);

        System.out.print("Before Sorting: ");
        list.display();

        list.reverse(head);

        System.out.print("After Recursion Sorting: ");
        list.display();

        list.inPlaceReverse();

        System.out.print("after In place sorting: ");
        list.display();

    }

    static void reverse(Node node){
        if(node==null){
            head=tail;
            return;
        }
        //recursive call
        reverse(node.next);

        tail.next=node;
        tail=node;
        tail.next=null;
    }

    //In place reverse
    static void inPlaceReverse(){
        if(size<2){
            return;
        }

        Node prev=null;
        Node present=head;
        Node next=present.next;

        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        head=prev;
    }
}

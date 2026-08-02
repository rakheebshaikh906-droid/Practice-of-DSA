package Assigment;

//https://leetcode.com/problems/palindrome-linked-list/description/
//234. Palindrome Linked List
public class palindromeLinkedList {
    static public Node head;
    static public Node tail;
    static public int size;
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
        palindromeLinkedList list = new palindromeLinkedList();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);

        list.display();

        System.out.println(isPalindrome(head)); // true
    }
    static boolean isPalindrome(Node head){
        if(head==null || head.next==null){
            return true;
        }
        Node mid=middle(head);
        Node headSecound=reverseList(mid);
        Node reverseSecound=headSecound;

        //compare both tha halve
        while(head!=null && headSecound!=null){
            if(head.val!= headSecound.val){
                break;
            }
            head=head.next;
            headSecound=headSecound.next;
        }
        //re reverse a list
        reverseList(reverseSecound);

        if(head==null || headSecound==null){
            return true;
        }
        return false;
    }

    //Middle
    static Node middle(Node head){
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    //reverse
    static Node reverseList(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node prev=null;
        Node present=head;
        Node next=present.next;

        tail=head;

        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }
}

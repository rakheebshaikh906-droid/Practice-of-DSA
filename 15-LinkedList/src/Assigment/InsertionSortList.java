package Assigment;

//https://leetcode.com/problems/insertion-sort-list/description/
//147. Insertion Sort List

public class InsertionSortList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static void main(String[] args) {
        //head={4,3,2,1};
        // Creating linked list: 4 -> 3 -> 2 -> 1
        ListNode head = new ListNode(4);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next=new ListNode(6);
        head.next.next.next.next.next=new ListNode(5);

        System.out.print("Before Sorting: ");
        display(head);

        head=insertionSort(head);

        System.out.print("after sorting: ");
        display(head);
    }
    static ListNode insertionSort(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=new ListNode(0);
        ListNode current=head;

        while(current!=null){
            ListNode previous=temp;
            ListNode next=current.next;

            while(previous.next!=null && previous.next.val< current.val){
                previous=previous.next;
            }
            //insert current between previous and previou.next
            current.next=previous.next;
            previous.next=current;


            //move the next node
            current=next;
        }
        return temp.next;
    }
    static void display(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("END");
    }
}

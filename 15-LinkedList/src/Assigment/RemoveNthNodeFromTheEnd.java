package Assigment;

public class RemoveNthNodeFromTheEnd {
    static public ListNode head;
    static public ListNode tail;
    static public int size;
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    // ---------- INSERT AT LAST ----------
    static ListNode insertLast(ListNode head, int val) {
        ListNode node = new ListNode(val);

        if (head == null) {
            return node;
        }

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        return head;
    }
    // ---------- DISPLAY ----------
    static void display(ListNode head){
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = null;
        head = insertLast(head, 1);
        head = insertLast(head, 2);
        head = insertLast(head, 3);
        head = insertLast(head, 4);
        head = insertLast(head, 5);

        System.out.print("Original List: ");
        display(head);

        int n = 2; // remove 2nd node from end

        head = removeNthFromEnd(head, n);

        System.out.print("After removing " + n + "th node from end: ");
        display(head);   // Expected: 1 -> 2 -> 3 -> 5 -> END
    }
    static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;

        //used two pointer start from dummy
        ListNode f1=dummy;
        ListNode f2=dummy;

        //move f2 by n time
        for(int i=0;i<n;i++){
            f2=f2.next;
        }

        //move both pointer until f2.next=null
        while(f2.next!=null){
            f1=f1.next;
            f2=f2.next;
        }

        //remove f1.next element

        f1.next=f1.next.next;

        return dummy.next;
    }
}

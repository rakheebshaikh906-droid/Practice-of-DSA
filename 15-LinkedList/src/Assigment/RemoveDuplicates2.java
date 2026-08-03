package Assigment;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/solutions/7480487/82-remove-duplicates-from-sorted-list-ii-09cd/
//82. Remove Duplicates from Sorted List II
public class RemoveDuplicates2 {
    static public ListNode head;
    static public ListNode tail;
    static public int size;
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
        // create linked list
        ListNode head = null;

        head = insertLast(head, 1);
        head = insertLast(head, 2);
        head = insertLast(head, 3);
        head = insertLast(head, 3);
        head = insertLast(head, 4);
        head = insertLast(head, 4);
        head = insertLast(head, 5);

        System.out.print("Original List:");
        display(head);

        // remove duplicates (LeetCode 82)
        head = deleteDuplicates(head);

        System.out.print("After Removing Duplicates:");
        display(head);
    }
    static ListNode deleteDuplicates(ListNode head){

        if(head==null || head.next==null){
            return head;
        }

        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode prev=dummy;
        ListNode curr=head;

        while(curr!=null){

            //found if duplicates are present or not
            if(curr.next!=null && curr.val==curr.next.val){
                int duplicates= curr.val;


                //skip all occurence of the duplicates
                while(curr!=null && curr.val==duplicates){
                    curr=curr.next;
                }
                //atag it
                prev.next=curr;
            }else{ //duplicats not founded
                prev=curr;
                curr=curr.next;
            }
        }
        return dummy.next;
    }
}

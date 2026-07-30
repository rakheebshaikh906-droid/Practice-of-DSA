package Assigment;

//https://leetcode.com/problems/add-two-numbers/?envType=problem-list-v2&envId=linked-list
//2. Add Two Numbers
public class AddTwoNumber {
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
    static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    static void main(String[] args) {
        // l1 = 2 -> 4 -> 3  (342)
        ListNode l1 = null;
        l1 = insertLast(l1, 2);
        l1 = insertLast(l1, 4);
        l1 = insertLast(l1, 3);

        // l2 = 5 -> 6 -> 4  (465)
        ListNode l2 = null;
        l2 = insertLast(l2, 5);
        l2 = insertLast(l2, 6);
        l2 = insertLast(l2, 4);

        System.out.print("List 1: ");
        display(l1);

        System.out.print("List 2: ");
        display(l2);

        ListNode result = addTwoNumbers(l1, l2);

        System.out.print("Result: ");
        display(result);   // Expected: 7 -> 0 -> 8 -> END
    }
    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;

        int carry=0;

        while(l1!=null || l2!=null){
            int sum=0+carry;

            if(l1!=null){
                sum=sum+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum=sum+l2.val;
                l2=l2.next;
            }

            carry=sum/10;
            sum=sum%10;
            temp.next=new ListNode(sum);
            temp=temp.next;
        }

        if(carry==1){
            temp.next=new ListNode(1);
        }
        return result.next;
    }
}

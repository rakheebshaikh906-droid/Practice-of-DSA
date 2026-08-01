package Assigment;


//https://leetcode.com/problems/merge-two-sorted-lists/description/
//21. Merge Two Sorted Lists
public class Merge {
    // Definition for singly-linked list.
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

    // main method (for local run)
    public static void main(String[] args) {

        // list1 = 1 -> 2 -> 4
        ListNode list1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4)));

        // list2 = 1 -> 3 -> 4
        ListNode list2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4)));

        Merge obj = new Merge();
        ListNode result = obj.mergeTwoLists(list1, list2);

        // print merged list
        while (result != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
        System.out.println("END");
    }

    //this method we write for my better understanding
    //static ListNode mergeTwoLists(ListNode list1, ListNode list2){
         //Node f=list1.head;
        //Node s=list2.head;

       //ListNode ans =new ListNode();

//       while(f!=null && s!=null){
//            if(f.val<s.val){
//                ans.insertlast(f.val);
//                f=f.next;
//             }else{
//                  ans.insertlast(s.val);
//                  s=s.next;
//             }
//      }
//     while(f!=null){
//         ans.insertlast(f.val);
//         f=f.next;
//     }
//     while(s!=null){
//         ans.insertlast(s.val);
//         s=s.next;
//     }
//}

    // method that works on LeetCode
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        // attach remaining list
        tail.next = (list1 != null) ? list1 : list2;

        return dummyHead.next;
    }
}

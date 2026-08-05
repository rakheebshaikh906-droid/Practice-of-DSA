package code;

import org.w3c.dom.Node;

import static java.lang.reflect.Array.get;

public class LL {
    // Node class
    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node(int value,Node next) {
            this.value=value;
            this.next = next;

        }
    }

    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public LL() {
        this.size = 0;
    }

    // Insert at beginning
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size+=1;
    }
    //Insert at last
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    //Insert at particular index
    public void insertIndex(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    //Delete at first
    public int deleteFirst(){
        int val= head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    //Delete at last
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secoundLast=get(size-2);
        int val=tail.value;
        tail=secoundLast;
        tail.next=null;
        return val;
    }
    //Delete at particular index
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;

        return val;
    }

    //Insert using recursion
    public void insertRecursion(int val,int index){
        head=insertRec(val,index,head);
    }
    private Node insertRec(int val,int index,Node node){
        //base case
        if (index == 0) {
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertRec(val,index-1,node.next);
        return node;
    }
    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }

        System.out.println("END");
    }
}

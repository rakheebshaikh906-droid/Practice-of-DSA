package code;

public class Main {
    static void main(String[] args) {
         LL list= new LL();
         //insert at first
         list.insertFirst(10);
         list.insertFirst(20);
         list.insertFirst(30);
         list.insertFirst(40);
         list.insertFirst(50);
         //insert at last
         list.insertLast(99);
         //insert at particular index
         list.insertIndex(100,3);
         list.display();
         //delete first
         System.out.println(list.deleteFirst());
         list.display();
         //delete last
         System.out.println(list.deleteLast());
         list.display();
         //delete at particular index
         System.out.println(list.delete(2));
         list.display();
         list.insertRecursion(88,2);
         list.display();

        //DLL list=new DLL();

        //list.insertFirst(10);
        //list.insertFirst(20);
        //list.insertFirst(30);
        //list.insertFirst(40);
        //list.insertFirst(50);
        //list.insertLast(99);
        //list.insert(40,45);

        //list.display();
        //list.displayRev();

        //CLL list = new CLL();
        //list.insert(10);
        //list.insert(20);
        //list.insert(30);
        //list.insert(40);
        //list.insert(50);
        //list.display();
        //list.delete(30);
        //list.display();

    }
}

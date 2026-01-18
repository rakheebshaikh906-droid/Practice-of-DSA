package code.rakheeb;

import java.util.ArrayList;

//Q.Used all method of array list
public class ArraylistMethod {
    static void main(String[] args) {
        ArrayList<Integer>number=new ArrayList<>();

        //add the number in new array list
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(60);
        System.out.println(number);
        System.out.println(number.get(2));//return index 2 value that is 40.

        //change the element of particular index
        number.set(2,33);
        System.out.println(number);

        number.remove(4);
        System.out.println(number);//the remove the value of index 2.

        System.out.println(number.contains(60));//its check the list will contain the object or not

        System.out.println("size of the list is:"+ number.size());//this display the size of the full array
    }
}

package code;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SET {
    //do not contain duplicate

    static void main(String[] args) {
        Set<Integer>set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);//they remove 10 internally because they are already present in it
        set.remove(20);

        System.out.println(set);

        Set<Integer>set1=new TreeSet<>();  //they automatic sort the element
        set1.add(50);
        set1.add(10);
        set1.add(40);
        set1.add(20);
        set1.add(30);

        System.out.println(set1);

    }
}

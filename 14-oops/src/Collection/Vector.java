package Collection;

import java.util.List;

public class Vector {
    static void main(String[] args) {

        // Creating a Vector object using List interface
        // Vector is a legacy class that implements List
        // It is synchronized, so it is thread-safe
        List<Integer>vector=new java.util.Vector<>();

        // Adding elements to the Vector
        // Vector maintains insertion order
        // Duplicate values are allowed
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        System.out.println(vector);

        //vector are slower than the arraylist because of this we prefers arraylist not vector
    }
}

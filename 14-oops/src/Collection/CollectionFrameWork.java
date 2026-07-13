package Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;

//import java.util.*; this is also currect and good way to import all

public class CollectionFrameWork {
    static void main(String[] args) {

        // ================= LIST =================
        // List allows duplicates and maintains insertion order
        List<Student> list = new ArrayList<>();

        list.add(new Student(1, "Rakheeb", 95));
        list.add(new Student(2, "ashu", 92));
        list.add(new Student(3, "Sarhan", 88));

        // Sorting list using Comparator (marks wise)
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s2.marks - s1.marks; // descending order
            }
        });

        System.out.println("Sorted List (by marks):");
        for (Student s : list) {
            System.out.println(s);
        }

        // ================= SET =================
        // Set does not allow duplicates
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // duplicate ignored

        System.out.println("\nSet elements:");
        System.out.println(set);

        // ================= MAP =================
        // Map stores key-value pairs
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Java");
        map.put(102, "Collections");
        map.put(103, "Framework");

        System.out.println("\nMap elements:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ================= ITERATOR =================
        // Iterator used to traverse collection safely
        Iterator<Student> itr = list.iterator();
        System.out.println("\nIterating List using Iterator:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // ================= SYNCHRONIZED COLLECTION =================
        // Making ArrayList thread-safe
        List<String> syncList =
                Collections.synchronizedList(new ArrayList<>());

        syncList.add("Thread");
        syncList.add("Safe");

        System.out.println("\nSynchronized List:");
        System.out.println(syncList);
    }
}

class Student {
    int id;
    String name;
    int marks;

    // Constructor
    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Overriding toString() for readable output
    public String toString() {
        return id + " " + name + " " + marks;
    }
}


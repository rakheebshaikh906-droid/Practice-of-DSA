package ObjectClasses;

import java.util.HashSet;

public class Hashcode_equals {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Rakheeb");
        Student s2 = new Student(1, "Rakheeb");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));

        HashSet<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);

        System.out.println(set.size()); // Output: 1
    }
}
// non-public class (allowed in same file)
class Student {

    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return roll;   // hash based on roll number
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Student)) {
            return false;
        }

        Student s = (Student) obj;
        return this.roll == s.roll;
    }
}


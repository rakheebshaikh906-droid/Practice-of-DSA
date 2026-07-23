package Properties.Encapsulation;

public class Encapsulation {
    static void main(String[] args) {

        Student s = new Student();

        s.setName("Rakheeb");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}

class Student {

    // private data members
    private int age;
    private String name;

    // setter methods
    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    // getter methods
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}


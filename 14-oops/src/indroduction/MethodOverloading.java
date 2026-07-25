package indroduction;

public class MethodOverloading {

    static class Student {
        int roll;
        String name;

        // constructor 1 (no parameter)
        Student() {
            roll = 20;
            name = "abdul rakheeb";
        }

        // constructor 2 (with parameters)
        Student(int rno, String naam) {
            roll = rno;
            name = naam;
        }

        void display() {
            System.out.println(roll + " " + name);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(19, "ashu");
        Student s3=s2;

        s1.display();
        s2.display();
        s3.display();
    }
}

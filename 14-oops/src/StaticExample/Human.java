package StaticExample;

public class Human {
    // Instance variables (unique for each object)
    int age;
    String name;
    int salary;
    boolean married;
    // Static variable (shared by all Human objects)
    static long population;

    public Human(int age, String name, int salary, boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;

        Human.population+=1;
    }
}

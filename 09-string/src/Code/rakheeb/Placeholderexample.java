package Code.rakheeb;
//Q.write a program using all place holder
public class Placeholderexample {
    static void main(String[] args) {
        // Declaring different types of variables
        String name = "Rakheeb";
        int age = 20;
        double percentage = 89.756;
        char grade = 'A';
        boolean passed = true;

        // Printing using printf() with placeholders
        System.out.printf("Hello, my name is %s.%n", name); // %s for String
        System.out.printf("I am %d years old.%n", age); // %d for integer
        System.out.printf("I scored %.2f%% in my exams.%n", percentage); // %.2f for 2 decimal places
        System.out.printf("My grade is %c.%n", grade); // %c for character
        System.out.printf("Did I pass? %b%n", passed); // %b for boolean

        // Combining all placeholders in one line
        System.out.printf(
                "%nSummary:%nName: %s | Age: %d | Percentage: %.2f | Grade: %c | Passed: %b%n",
                name, age, percentage, grade, passed
        );
    }
}

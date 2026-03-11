package Code.rakheeb;

public class PrettyPrinting {
    static void main(String[] args) {
        float a=234.76786767f;

        // %.2f --> formats the number to 2 decimal places
        System.out.printf("formatted number is %.2f",a);

        //Example 2: Formatting to 3 decimal places
        System.out.printf("Rounded to 3 decimal places: %.3f%n", a);

        //Example 3: Setting field width
        // %10.2f --> total width 10, 2 decimal places (adds spaces for alignment)
        System.out.printf("With width 10: %10.2f%n", a);

        //Example 4: Left alignment
        // %-10.2f --> left aligns within 10 spaces
        System.out.printf("Left aligned: %-10.2f (see the spaces!)%n", a);

        //Example 5: Using multiple placeholders
        String name = "Rakheeb";
        int age = 21;
        double marks = 89.756;
        System.out.printf("Student: %s | Age: %d | Marks: %.2f%n", name, age, marks);
    }
}

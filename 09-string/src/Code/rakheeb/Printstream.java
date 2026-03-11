package Code.rakheeb;
import java.io.PrintStream; // Import PrintStream class from java.io package
public class Printstream {
    static void main(String[] args) {
        try {
            // Create a PrintStream object that writes to the console (System.out)
            PrintStream ps = new PrintStream(System.out);

            // Print different types of data using PrintStream
            ps.println("Hello Rakheeb"); // prints a string
            ps.println(123);// prints an integer
            ps.println(true);// prints a boolean value
        }
        catch (Exception e) {
            // If any error occurs, print the error details
            e.printStackTrace();
        }
    }
}

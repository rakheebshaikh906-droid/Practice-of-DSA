package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        // Initializing two integers
        int a = 5;
        int b = 0;

        try {
            // This method call is commented out
            // If uncommented, it may throw ArithmeticException
            // divide(a, b);

            // Creating a String variable
            String name = "rakheeb";

            // Checking condition
            if (name.equals("rakheeb")) {
                // Manually throwing a custom exception
                throw new MyException("name is rakheeb");
            }

        }
        // Catch block for custom exception
        catch (MyException e) {
            // Prints the message passed to MyException
            System.out.println(e.getMessage());
        }

        // Catch block for arithmetic errors (like divide by zero)
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Generic catch block for any other exception
        catch (Exception e) {
            System.out.println("normal exception");
        }

        // Finally block always executes
        // Used for cleanup code (closing files, DB connections, etc.)
        finally {
            System.out.println("this will always execute");
        }
    }

    // Method to perform division
    // throws ArithmeticException if divisor is zero
    static int divide(int a, int b) throws ArithmeticException {

        // Checking for divide by zero
        if (b == 0) {
            // Manually throwing ArithmeticException
            throw new ArithmeticException("please do no divide by zero");
        }

        // Returning division result
        return a / b;
    }
}

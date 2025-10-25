package assignment;

import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String original = in.nextLine();

        // Remove spaces and convert to lowercase for uniform comparison
        String cleaned = original.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Check if the original and reversed are equal
        if (cleaned.equals(reversed)) {
            System.out.println("\"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a Palindrome.");
        }

        in.close();
    }
}

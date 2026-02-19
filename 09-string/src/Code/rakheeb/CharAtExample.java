package Code.rakheeb;

public class CharAtExample {
    static void main(String[] args) {
        // Declare and initialize a string variable
        String name="shaikh abdul rakheeb";
        // Use charAt(index) to get a character at a specific position
        // Note: Index starts from 0, so index 3 = 4th character
        char letter=name.charAt(3);
        // Print the character at position 3
        System.out.println(letter);
    }
}

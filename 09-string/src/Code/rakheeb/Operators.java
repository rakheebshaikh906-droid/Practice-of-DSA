package Code.rakheeb;

import java.util.ArrayList;

public class Operators {
    static void main(String[] args) {

        // When you add two characters, Java adds their ASCII values
        // 'a' -> 97, 'b' -> 98, so result = 97 + 98 = 195
        System.out.println('a'+'b');

        // When you use + between two Strings, it concatenates (joins) them
        System.out.println("a"+"b");

        // You can also add a number to a char and cast it back to char
        // 'a' (97) + 3 = 100 --> 'd'
        System.out.println((char)('a'+3));

        // Mixing String + number → number gets converted to String automatically
        System.out.println("a" + 1);  // Output: a1
        // Explanation: 1 is converted to "1" using Integer.toString(1)

        // You can concatenate Strings with objects too!
        // new ArrayList<>() will call its toString() → gives "[]"
        System.out.println("rakheeb" + new ArrayList<>());  // Output: rakheeb[]

        // new Integer(52) also calls its toString() method → gives "52"
        System.out.println("rakheeb" + new Integer(52));  // Output: rakheeb52

        // Error Example:
        // If you try to add two objects (non-strings) directly with +,
        // Java doesn’t know how to handle it → compile-time error!
        // System.out.println(new ArrayList<>() + new Integer(52)); // ❌ Error
    }
}
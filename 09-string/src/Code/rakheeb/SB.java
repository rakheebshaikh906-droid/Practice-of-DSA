package Code.rakheeb;

public class SB {//SB means StringBuilder
    static void main(String[] args) {
        StringBuilder series= new StringBuilder();
        for (int i=0;i<26;i++){
            char ch=(char)('A'+i); // Convert number to character (A, B, C, ...)
            series.append(ch); // Append each character to StringBuilder
        }
        // Print the complete series (A–Z)
        System.out.println(series);

        //deleteCharAt(index)
        // Deletes the character at the given index (here index 0 means 'A')
        series.deleteCharAt(0);
        System.out.println(series);

        //delete(start, end)
        // Deletes characters from index 1 (inclusive) to 4 (exclusive)
        // That means removes characters at index 1, 2, 3
        series.delete(1,4);
        System.out.println(series);

        //reverse()
        // Reverses the sequence of character
        series.reverse();
        System.out.println(series);

        //hashCode()
        // Returns an integer hash value for this StringBuilder object
        // Note: It does NOT print automatically, you must print it separately
        System.out.println(series.hashCode());

        //charAt(index)
        // Returns the character at a specific index
        // Note: This only *returns* a char, so we should print it
        System.out.println(series.charAt(5));

        //isEmpty()
        // Checks whether StringBuilder is empty or not
        // (returns true or false)
        System.out.println(series.isEmpty());
    }
}

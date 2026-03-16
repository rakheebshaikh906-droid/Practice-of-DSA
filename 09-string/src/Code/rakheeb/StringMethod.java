package Code.rakheeb;

public class StringMethod {
    static void main(String[] args) {
        // Create a string
        String name = "  Hello Java World  ";

        // length()
        System.out.println("Length: " + name.length()); // Counts characters including spaces

        // toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());

        // trim()
        System.out.println("Trimmed: '" + name.trim() + "'"); // Removes leading/trailing spaces

        // charAt(index)
        System.out.println("Character at index 2: " + name.charAt(2));

        // substring(beginIndex)
        System.out.println("Substring from index 6: " + name.substring(6));

        // substring(beginIndex, endIndex)
        System.out.println("Substring (0,5): " + name.substring(0, 5));

        // contains()
        System.out.println("Contains 'Java'? " + name.contains("Java"));

        // equals() and equalsIgnoreCase()
        System.out.println("Equals 'HELLO JAVA WORLD'? " + name.equals("HELLO JAVA WORLD"));
        System.out.println("EqualsIgnoreCase? " + name.equalsIgnoreCase("  hello java world  "));

        // startsWith() and endsWith()
        System.out.println("Starts with '  He'? " + name.startsWith("  He"));
        System.out.println("Ends with 'ld  '? " + name.endsWith("ld  "));

        // indexOf() and lastIndexOf()
        System.out.println("Index of 'Java': " + name.indexOf("Java"));
        System.out.println("Last index of 'l': " + name.lastIndexOf('l'));

        // replace() and replaceAll()
        System.out.println("Replace 'Java' with 'Rakheeb': " + name.replace("Java", "Rakheeb"));
        System.out.println("Replace all spaces with '-': " + name.replaceAll(" ", "-"));

        // isEmpty()
        System.out.println("Is empty? " + name.isEmpty());

        // concat()
        System.out.println("Concatenation: " + name.concat(" - Let's learn!"));

        // compareTo()
        System.out.println("CompareTo 'Hello': " + name.compareTo("Hello"));

        // toCharArray()
        char[] chars = name.toCharArray();
        System.out.print("Characters: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // split()
        String[] words = name.trim().split(" ");
        System.out.println("Splitted words:");
        for (String word : words) {
            System.out.println(word);
        }

        // valueOf()
        int num = 100;
        String strNum = String.valueOf(num);
        System.out.println("ValueOf example: " + strNum + " (now it's a String)");
    }
}

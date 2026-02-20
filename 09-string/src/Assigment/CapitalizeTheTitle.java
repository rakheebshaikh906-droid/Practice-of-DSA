package Assigment;
//https://leetcode.com/problems/capitalize-the-title/
//2129. Capitalize the Title
public class CapitalizeTheTitle {
    static void main(String[] args) {
        String title=  "capiTalIze tHe titLe";//expected output:"Capitalize The Title"
        System.out.println(capitalizeTitle(title));
    }
    static String capitalizeTitle(String title) {
        String[] parts = title.split(" ");

        for (int i = 0; i < parts.length; i++) {
            String word = parts[i].toLowerCase();

            if (word.length() <= 2) {
                parts[i] = word;  // fully lowercase
            } else {
                parts[i] = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            }
        }
        return String.join(" ", parts);
    }
}

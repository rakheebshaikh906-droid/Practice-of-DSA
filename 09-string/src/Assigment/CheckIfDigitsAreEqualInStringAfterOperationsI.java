package Assigment;

//https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/description/
//3461. Check If Digits Are Equal in String After Operations I

public class CheckIfDigitsAreEqualInStringAfterOperationsI {
    static void main(String[] args) {
        String s = "1234";

        System.out.println(hasSameDigits(s));
    }

    public static boolean hasSameDigits(String s) {
        while (s.length() > 2) {
            StringBuilder temp = new StringBuilder();

            for (int i = 0; i < s.length() - 1; i++) {
                int a = s.charAt(i) - '0';
                int b = s.charAt(i + 1) - '0';

                temp.append((a + b) % 10);
            }

            s = temp.toString();
        }

        return s.charAt(0) == s.charAt(1);
    }
}

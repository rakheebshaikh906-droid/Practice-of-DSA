package Assigment;

//https://leetcode.com/problems/reverse-string-prefix/?envType=problem-list-v2&envId=two-pointers
//3794. Reverse String Prefix

public class ReverseStringPrefix {
    static void main() {
        String s="abcd";
        int k=2;
        System.out.println(reversePrefix(s,k));
    }
    static String reversePrefix(String s, int k) {
        char[] arr = s.toCharArray();

        int i = 0, j = k-1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}

package assignment;

//https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/description/
//3043. Find the Length of the Longest Common Prefix
public class LengthOfLongestCommonPrefix {
    static void main(String[] args) {
        int[] arr1 = {1,10,100};
        int[] arr2 = {1000};
        System.out.println(lengthoflongest(arr1,arr2));
    }
    static int lengthoflongest(int[]arr1,int[]arr2){
        int maxLength = 0;
        // Compare every number in arr1 with every number in arr2
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                // Convert both numbers to string
                String s1 = String.valueOf(arr1[i]);
                String s2 = String.valueOf(arr2[j]);
                int length = 0;
                // Compare digit by digit from the start
                for (int l = 0; l< s1.length() && l < s2.length(); l++) {
                    if (s1.charAt(l) == s2.charAt(l)) {
                        length++;
                    } else {
                        break; // stop when digits differ
                    }
                }
                // keep track of max prefix length found
                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }
        return maxLength;
    }
}

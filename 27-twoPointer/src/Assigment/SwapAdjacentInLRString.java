
package Assigment;

// https://leetcode.com/problems/swap-adjacent-in-lr-string/
// 777. Swap Adjacent in LR String

public class SwapAdjacentInLRString {

    static void main(String[] args) {
        String start = "RXXLRXRXL";
        String result = "XRLXXRRLX";

        System.out.println(canTransform(start, result));
    }

    public static boolean canTransform(String start, String result) {

        // Step 1: Check L and R sequence (ignoring X)
        if (!start.replace("X", "").equals(result.replace("X", ""))) {
            return false;
        }

        int n = start.length();
        int i = 0;
        int j = 0;

        while (i < n && j < n) {

            // Skip X in both strings
            while (i < n && start.charAt(i) == 'X') {
                i++;
            }

            while (j < n && result.charAt(j) == 'X') {
                j++;
            }

            // If both pointers reach end
            if (i == n && j == n) {
                break;
            }

            // If only one pointer reaches end
            if (i == n || j == n) {
                return false;
            }

            char c1 = start.charAt(i);
            char c2 = result.charAt(j);

            // Both characters should be same
            if (c1 != c2) {
                return false;
            }

            // L can only move left
            if (c1 == 'L' && i < j) {
                return false;
            }

            // R can only move right
            if (c1 == 'R' && i > j) {
                return false;
            }

            i++;
            j++;
        }

        return true;
    }
}

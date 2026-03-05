package Assigment;
//https://leetcode.com/problems/swap-adjacent-in-lr-string/description/
//777. Swap Adjacent in LR String
public class SwapLRString {
    static void main(String[] args) {
        String start = "RXXLRXRXL";
        String result = "XRLXXRRLX";
        System.out.println(canTransform(start, result)); // expected output: true
    }
    static boolean canTransform(String start, String result){
        // Step 1: If L and R sequence doesn't match (ignoring X), it's impossible
        if (!start.replace("X", "").equals(result.replace("X", ""))) {
            return false;
        }

        int n = start.length();
        int i = 0, j = 0;

        while (i < n && j < n) {
            // Skip 'X' in both strings
            while (i < n && start.charAt(i) == 'X') i++;
            while (j < n && result.charAt(j) == 'X') j++;

            // If both pointers reach end, break
            if (i == n && j == n) break;

            // If only one pointer reaches end, not possible
            if (i == n || j == n) return false;

            char c1 = start.charAt(i);
            char c2 = result.charAt(j);

            // Both characters should be same (L or R)
            if (c1 != c2) return false;

            // 'L' can only move left → index in result <= index in start
            if (c1 == 'L' && i < j) return false;

            // 'R' can only move right → index in result >= index in start
            if (c1 == 'R' && i > j) return false;

            i++;
            j++;
        }
        return true;
    }
}

package Assigment;

//https://leetcode.com/problems/compute-decimal-representation/description/
//3697. Compute Decimal Representation

import java.util.ArrayList;
import java.util.Arrays;

public class ComputeDecimalRepresentation {
    static void main(String[] args) {
        int n=537;
        System.out.println(Arrays.toString(decimalRepresentation(n)));
    }
    static int[] decimalRepresentation(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 1;
        while (n > 0) {
            int rem = n % 10;
            if (rem != 0) {
                ans.add(i * rem);
            }
            n = n / 10;
            i = i * 10;
        }
        int[] res = new int[ans.size()];
        for (int j = 0; j < ans.size(); j++) {
            res[ans.size()-j-1] = ans.get(j);
        }
        return res;
    }
}

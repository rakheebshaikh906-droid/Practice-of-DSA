package assigment;

//https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/description/?envType=problem-list-v2&envId=hash-table
//2442. Count Number of Distinct Integers After Reverse Operations

import java.util.HashSet;
import java.util.Set;

public class CountNumberOffDistinctIntegersAfterReverseOperations {
    static void main(String[] args) {
        int[]nums={1,13,10,12,31};
        System.out.println(countDistinctIntegers(nums));
    }
    static int countDistinctIntegers(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int a : nums){
            set.add(a);
            int reverse = reverse(a);
            set.add(reverse);
        }
        return set.size();
    }
    static int reverse(int n){
        int rev=0;
        while(n!=0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        return rev;
    }
}

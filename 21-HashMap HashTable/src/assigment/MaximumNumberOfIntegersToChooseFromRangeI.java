package assigment;

//https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i/description/?envType=problem-list-v2&envId=binary-search
//2554. Maximum Number of Integers to Choose From a Range I

import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfIntegersToChooseFromRangeI {
    static void main(String[] args) {
        int[]banned={1,6,5};
        int n=5;
        int maxSum=6;
        System.out.println(maxCount(banned,n,maxSum));
    }
    static int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer>set=new HashSet<>();
        for(int a : banned){
            set.add(a);
        }
        int count=0;
        int sum=0;

        for(int i=1;i<=n;i++){
            if(!set.contains(i) && sum+i<=maxSum){
                sum+=i;
                count++;
            }
        }

        return count;

    }
}

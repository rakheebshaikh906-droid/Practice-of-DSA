package assignment;

//https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/description/
//3512. Minimum Operations to Make Array Sum Divisible by K
public class MinOperation {
    static void main(String[] args) {
        int[] num={3,9,7};
        int k=5;
        System.out.println(minOperation(num,k));
    }
    static int minOperation(int[]num,int k){
        long sum=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
        }
        return (int) sum%k;
    }
}

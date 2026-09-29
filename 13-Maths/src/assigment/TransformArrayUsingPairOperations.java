package Assigment;

//https://leetcode.com/problems/transform-array-using-pair-operations/description/
//4062. Transform Array Using Pair Operations

public class TransformArrayUsingPairOperations {
    static void main(String[] args) {
        int[] source = {1,2,3}, target = {0,2,4};
        System.out.println(canTransform(source,target));

    }
    static boolean canTransform(int[] source, int[] target) {
        long sum1=0;
        long sum2=0;
        for(int num : source){
            sum1+=num;
        }
        for(int i : target){
            sum2+=i;
        }

        return sum1==sum2;
    }
}

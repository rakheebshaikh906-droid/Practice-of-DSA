package Assigment;

//https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/?envType=problem-list-v2&envId=v44z9nnt
//1979. Find Greatest Common Divisor of Array
public class FindGreatestCommonDivisor {
    static void main(String[] args) {
        int [] nums={2,5,6,9,10};
        System.out.println(findGCD(nums));
    }
    static int findGCD(int[]nums){
        //first we find max and min of this array

        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int min=nums[0];
        for(int j=1;j<nums.length;j++){
            if(nums[j]<min){
                min=nums[j];
            }
        }
        return gcd(min,max);
    }

    static int gcd(int a,int b){
        while( b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}

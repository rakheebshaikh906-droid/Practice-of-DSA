package assignment;

//https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/?envType=problem-list-v2&envId=array
//3550. Smallest Index With Digit Sum Equal to Index

public class SmallestIndexWithDigitSumEqualToIndex {
    static void main(String[] args) {
        int[]nums={1,3,2};
        System.out.println(smallest(nums));
    }
    static int smallest(int[]nums){
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int j=nums[i];

            while(j>0){
                sum+=j%10;
                j/=10;
            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}

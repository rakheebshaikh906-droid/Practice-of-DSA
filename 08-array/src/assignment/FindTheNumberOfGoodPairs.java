package assignment;

//https://leetcode.com/problems/find-the-number-of-good-pairs-i/solutions/7489253/3162-find-the-number-of-good-pairs-i-by-975me/
//3162. Find the Number of Good Pairs I
public class FindTheNumberOfGoodPairs {
    static void main(String[] args) {
        int[]nums1={1,2,4,12};
        int[]nums2={2,4};
        int k=3;
        System.out.println(numberOfPairs(nums1,nums2,k));
    }
    static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j< nums2.length;j++){
                if(nums1[i]%(nums2[j]*k)==0){
                    count+=1;
                }

            }
        }
        return count;
    }
}

package assignment;

//https://leetcode.com/problems/count-elements-with-maximum-frequency/description/?envType=problem-list-v2&envId=array
//3005. Count Elements With Maximum Frequency
public class CountElementsWithMaximumFrequency {
    static void main(String[] args) {
        int[]nums={1,2,2,3,1,4};
        System.out.println(maxFreq(nums));
    }
    static int maxFreq(int[]nums){
        int[]freq=new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        //find the max freq
        int max=freq[0];
        for(int i=0;i<freq.length;i++){
            if(freq[i]>max){
                max=freq[i];
            }
        }
        //count the total occur of max freq
        int count=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==max){
                count+=max;
            }
        }
        return count;
    }
}

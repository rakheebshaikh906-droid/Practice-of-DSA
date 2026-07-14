package assignment;

//https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
//2149. Rearrange Array Elements by Sign

import java.util.Arrays;
public class RearrangeArrayElementsBySign {
    static void main(String[] args) {
        int[]nums={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(reArrange(nums)));
    }
    static int[] reArrange(int[]nums){
        int[]ans=new int[nums.length];
        int[]positive=new int[nums.length/2];
        int ind=0;
        int aus=0;
        int[]negative=new int[nums.length/2];

        for(int i : nums){
            if(i>0 || i==0){
                positive[ind++]=i;
            }else{
                negative[aus++]=i;
            }
        }
        int i=0;
        int j=0;
        int k=0;
        while(i< positive.length && j< negative.length){
            ans[k++]=positive[i++];
            ans[k++]=negative[j++];
        }
        return ans;
    }
}

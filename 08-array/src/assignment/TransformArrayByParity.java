package assignment;

//https://leetcode.com/problems/transform-array-by-parity/submissions/1882828708/?envType=problem-list-v2&envId=array
//3467. Transform Array by Parity
import java.util.Arrays;
public class TransformArrayByParity {
    static void main(String[] args) {
        int []nums={1,5,1,4,2};
        System.out.println(Arrays.toString(transformArray(nums)));
    }
    static int[] transformArray(int[] nums) {
        int[]ans=new int[nums.length];
        int index=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]%2==0){
               ans[index++]=0;
            }else{
                ans[index++]=1;
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}

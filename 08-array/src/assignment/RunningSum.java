package assignment;

public class RunningSum {
    static void main(String[] args) {
        //step:1 -> original array
        int[]nums={1,2,3,4};
        //calculate running sum in the same array
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];//current element + sum of all previous element
        }
        //print the running sum array
        System.out.print("Running sum array:");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}

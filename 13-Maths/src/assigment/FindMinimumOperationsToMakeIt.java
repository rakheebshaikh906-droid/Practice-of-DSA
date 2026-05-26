package Assigment;

public class FindMinimumOperationsToMakeIt {
    static void main(String[] args) {
        int nums[]={1,2,3,4};
        System.out.println(minimumOperation(nums));
    }
    static int minimumOperation(int[]nums){
        int count=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]%3!=0){
                count++;
            }
        }
        return count;
    }
}

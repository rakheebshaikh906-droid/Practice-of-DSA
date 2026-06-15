package Assigment;

//https://leetcode.com/problems/rotate-array/submissions/1852095898/?envType=problem-list-v2&envId=math
//189. Rotate Array
public class ReverseArray {
     static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,7};
        int k=3;
        rotated(nums,k);


        // print array (optional)
        for(int x : nums){
            System.out.print(x + " ");
        }
    }
    static void rotated(int[]nums,int k){
        int n = nums.length;
        k = k % n; // in case k > n
        //Agar koi k bohot bada de (jaise 100), to rotation circular hota hai.
        //Isliye modulo use karte hain.

        // Step 1: reverse full array
        Reverse(nums, 0, n - 1);
        // Step 2: reverse first k elements
        Reverse(nums, 0, k - 1);
        // Step 3: reverse remaining elements
        Reverse(nums, k, n - 1);
    }

    static void Reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

package Assigment;

//https://leetcode.com/problems/kth-largest-element-in-an-array/
//215. Kth Largest Element in an Array
public class Kth_Largest {
    static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }

    static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        int targetIndex = n - k; // kth largest = (n-k)th index after sorting
        return quickSelect(nums, 0, n - 1, targetIndex);
    }

    private static int quickSelect(int[] nums, int low, int high, int target) {
        if (low >= high) {
            return nums[low];
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {
            while (nums[s] < pivot) s++;
            while (nums[e] > pivot) e--;

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        if (target <= e) {
            return quickSelect(nums, low, e, target);
        } else if (target >= s) {
            return quickSelect(nums, s, high, target);
        } else {
            return nums[target];
        }
    }
}

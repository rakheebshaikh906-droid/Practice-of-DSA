package assignment;
//Q.find maximum in rotated sorted array
public class maxfind {
    static void main(String[] args) {
        int[] nums = {2, 2, 2, 0, 1};
        System.out.println(maxfind(nums));  // expected output: 2
    }
    static int maxfind(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // if mid element is less than end → maximum is on right side
            if (nums[mid] < nums[end]) {
                end = mid - 1;  // move left
            }
            // if mid element is greater than end → maximum is in right half (including mid)
            else if (nums[mid] > nums[end]) {
                start = mid;
            }
            // if equal → duplicates, so shrink range
            else {
                end--;
            }
        }
        return nums[start];
    }
}

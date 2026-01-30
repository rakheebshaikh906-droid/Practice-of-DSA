package code.rakheeb;

public class duplicateelement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 9, 2, 2, 2};
        int pivot = findPivot(nums);
        System.out.println("Pivot index: " + pivot);
        if (pivot != -1) {
            System.out.println("Pivot element: " + nums[pivot]);
        }
    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: mid is pivot
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // Case 2: mid-1 is pivot
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Case 3: skip duplicates
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                // write 3 cases for find the pivot in duplicate element
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                // Check if end-1 is pivot
                if (end > start && nums[end - 1] > nums[end]) {
                    return end - 1;
                }
                end--;
            }
            // Left side is sorted → pivot must be on right
            else if (nums[start] < nums[mid] ||
                    (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            }
            // Pivot is on left side
            else {
                end = mid - 1;
            }
        }
        return -1; // No pivot (array not rotated)
    }
}



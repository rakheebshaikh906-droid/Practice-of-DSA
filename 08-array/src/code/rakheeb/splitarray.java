package code.rakheeb;

public class splitarray {
    static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;
        System.out.println(splitArray(nums, m));

    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        // Find the max element and total sum
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // max single element
            end += nums[i]; // sum of all elements
        }

        // Binary search between max element and total sum
        while (start < end) {
            int mid = start + (end - start) / 2;

            // try to split array into pieces with sum <= mid
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    // start new subarray
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1; // too many pieces, increase allowed sum
            } else {
                end = mid; // try smaller max sum
            }
        }
        return end; // or start (both will be same here)
    }
}




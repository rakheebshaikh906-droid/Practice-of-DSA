package assignment;
//Q.remove duplicate element in sorted array
public class Removeduplicate {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4};
        int length = removeDuplicates(nums);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    // Function to remove duplicates
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0; // pointer for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {  // found a new unique element
                j++;
                nums[j] = nums[i];     // place it in next position
            }
        }
        return j + 1; // new length of unique elements
    }
}


    //simple form to remove duplicate
    //public class RemoveDuplicates {
       // public static void main(String[] args) {
           // int[] nums = {1, 1, 2, 2, 3, 3, 4};

           // int length = removeDuplicates(nums);

            //System.out.println("Length after removing duplicates: " + length);
            //System.out.print("Array after removing duplicates: ");
             //for (int i = 0; i < length; i++) {
                //System.out.print(nums[i] + " ");
            //}
        //}

        //public static int removeDuplicates(int[] nums) {
          //  if (nums.length == 0) return 0;

          //  int x = 0; // pointer for unique elements
          //  for (int i = 1; i < nums.length; i++) {
            //    if (nums[i] != nums[x]) {
               //     x++;
               //     nums[x] = nums[i];
             //   }
          //  }
          //  return x + 1; // length of unique elements
       // }
    //}



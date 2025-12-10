package assignment;
//Q.find the ceiling of a number in sorted array.
public class ceilingnumber {
    public static void main(String[] args) {

        int[]arr={2,3,5,9,12,14,15};
        int target=10;
        System.out.println(ceilingofnumber(arr,target));
    }

    static int ceilingofnumber(int[]arr,int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return arr[start];

    }
}

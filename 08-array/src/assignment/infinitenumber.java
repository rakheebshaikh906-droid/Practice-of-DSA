package assignment;
//Q.find position of an element in a sorted array of infinite number
public class infinitenumber {
    public static void main(String[] args) {
        int[] num = {3, 5, 6, 7, 8, 9, 12, 34, 45, 56, 67, 89, 90, 180, 200};
        int target = 56;
        System.out.println(ans(num,target));

    }
    static int ans(int[]num,int target){
        //first we find the range
        //first start of box of size 2
        int start=0;
        int end=1;
        //condition for the target in lie in range
        while( target>=num[end]){
            int newstart=end+1;
            //dooble the box
            end=end+((end-start)+1)*2;
            start=newstart;
        }
        return binarysearch(num,target,start,end);
    }

    static int binarysearch(int[] num, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (num[mid] > target) {
                end = mid - 1;
            } else if (num[mid] < target) {
                start = mid + 1;
            } else {
                return mid;//founded
            }
        }
        return -1;//not founded
    }
}


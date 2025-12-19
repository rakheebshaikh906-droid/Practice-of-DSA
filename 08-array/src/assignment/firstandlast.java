package assignment;
//Q.find the first and last position in sorted array.
public class firstandlast {
    public static void main(String[] args) {
        int[] num = {5, 7, 7, 8, 8, 10};
        int target=8;
        int[]result=searchinrange(num,target);
        System.out.println("["+result[0]+","+result[1]+"]");
    }
    static int[] searchinrange(int[]num,int target){
        int[] ans={-1,-1};
        int start=search(num,target,true);
        int end=search(num,target,false);

        ans[0]=start;
        ans[1]=end;

        return ans;
    }

    static int search(int[] num, int target, boolean findfirstindex) {
        int ans=-1;
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (num[mid] > target) {
                end = mid - 1;
            } else if (num[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;

                if (findfirstindex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return ans;
    }
}

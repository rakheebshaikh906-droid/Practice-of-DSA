package code.rakheeb;
//Q.perform simple binary search
public class binarysearch {
    static void main(String[] args) {
        int[]arr={12,34,32,54,67,89,44};
        int target=67;
        System.out.println(search(arr,target));
    }
    //method for binary search
    static int search(int[]arr,int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }else if (arr[mid]>target){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

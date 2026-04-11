package Searching;

//Q.binary search using recursion
public class BinarySearch {
    static void main(String[] args) {
        int[]arr={12,23,34,45,56,78};
        int target=45;
        System.out.println(binary(arr,target,0,arr.length-1));
    }
    static int binary(int []arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return binary(arr,target,0,mid-1);
        }
        return binary(arr,target,mid+1,arr.length-1);
    }
}

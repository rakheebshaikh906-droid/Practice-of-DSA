package code.rakheeb;
//Q.find the pivot element in array
public class findpivot {
    static void main(String[] args) {
        int[] arr={3,4,5,6,7,1,2};
        System.out.println(findpivotelement(arr));

    }
    static int findpivotelement(int[] arr){

        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            // now write four case of find the pivot
            if(end>mid && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>arr[mid]){
                return end=mid-1;
            }else{
                return start=mid+1;
            }
        }
        return -1;

    }

}

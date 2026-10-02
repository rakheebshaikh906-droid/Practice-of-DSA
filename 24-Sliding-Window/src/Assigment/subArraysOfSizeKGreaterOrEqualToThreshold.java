package Assigment;

//https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/?envType=problem-list-v2&envId=sliding-window
//1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

public class subArraysOfSizeKGreaterOrEqualToThreshold {
    static void main(String[] args) {
        int[]arr={2,2,2,2,5,5,5,8};
        int k=3;
        int threshold=4;

        System.out.println(numOfSubarrays(arr,k,threshold));

    }
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int sum=0;
        int l=0;
        int r=k-1;
        for(int i=l;i<=r;i++){
            sum+=arr[i];
        }
        int count=0;
        int average=sum/k;
        if(average>=threshold){
            count++;
        }
        while(r<n-1){
            sum=sum-arr[l];
            l++;
            r++;
            sum=sum+arr[r];
            average=sum/k;
            if(average>=threshold){
                count++;
            }

        }
        return count;
    }
}

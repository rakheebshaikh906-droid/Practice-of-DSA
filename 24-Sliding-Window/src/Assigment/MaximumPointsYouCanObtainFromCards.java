package Assigment;

//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/
//1423. Maximum Points You Can Obtain from Cards

public class MaximumPointsYouCanObtainFromCards {
    static void main(String[] args) {
        int[]cardPoints={1,2,3,4,5,6,1};
        int k=3;
        System.out.println(maxScore(cardPoints,k));
    }
    public static int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int rsum=0;
        int maxSum=0;
        int n=cardPoints.length;

        for(int i=0;i<=k-1;i++){
            lsum+=cardPoints[i];
            maxSum=lsum;
        }
        int rightIdx=n-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-cardPoints[i];
            rsum=rsum+cardPoints[rightIdx];
            rightIdx--;
            maxSum=Math.max(maxSum,lsum+rsum);
        }
        return maxSum;
    }

}

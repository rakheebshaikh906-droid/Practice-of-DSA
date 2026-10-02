package Assigment;

//https://leetcode.com/problems/count-square-submatrices-with-all-ones/
//1277. Count Square Submatrices with All Ones

public class CountSquareSubmatricesWithAllOnes {
    static void main(String[] args) {
        int[][]matrix={
                {0,1,1,1},
                {1,1,1,1},
                {0,1,1,1}
        };
        System.out.println(countSquares(matrix));
    }
    public static int countSquares(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][]dp=new int[n][m];
        for(int i=0;i<n;i++){
            dp[i][0]=matrix[i][0];
        }
        for(int j=0;j<m;j++){
            dp[0][j]=matrix[0][j];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=1+Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]));
                }
            }
        }
        int ans=0;
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                ans+=dp[i][j];
            }
        }
        return ans;
    }
}

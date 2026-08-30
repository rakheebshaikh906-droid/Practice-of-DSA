package Assigment;

//https://leetcode.com/problems/cherry-pickup-ii/
//1463. Cherry Pickup II
//hard
import java.util.Arrays;
public class cherryPickUp2 {
    static void main(String[] args) {
        int[][]grid={
                {3,1,1},
                {2,5,1},
                {1,5,5},
                {2,1,1}
        };
        System.out.println(cherryPickup(grid));
    }
    static int cherryPickup(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int[][][]dp=new int [n][m][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return solve (0,0,m-1,m,n,dp,grid);

    }
    static int solve (int i,int j1,int j2, int c,int r,int[][][]dp,int[][]a){
        //base cases
        if(j1<0 || j2<0 || j1>=c|| j2>=c){
            return Integer.MIN_VALUE;
        }
        if(i==r-1){
            if(j1==j2){
                return a[i][j1];
            }else{
                return a[i][j1]+a[i][j2];
            }

        }
        if(dp[i][j1][j2]!=-1){
            return dp[i][j1][j2];
        }
        //explore all possible path
        int max=0;
        for(int dj1=-1;dj1<=1;dj1++){
            for(int dj2=-1;dj2<=1;dj2++){
                int value=0;
                if(j1==j2) value = a[i][j1];
                else value =a[i][j1]+a[i][j2];
                value+=solve(i+1,j1+dj1,j2+dj2,c,r,dp,a);
                max=Math.max(max,value);
            }
        }
        return dp[i][j1][j2]=max;
    }
}

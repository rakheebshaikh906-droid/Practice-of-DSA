package assignment;

//https://leetcode.com/problems/find-missing-and-repeated-values/description/?envType=problem-list-v2&envId=array
//2965. Find Missing and Repeated Values

import java.util.Arrays;
public class FindMissingAndRepeatedValues {
    static void main(String[] args) {
        int[][]grid={
                {1,3},
                {2,2}
        };
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid)));
        System.out.println(Arrays.toString(findMissingAndRepeatedValues2(grid)));

    }
    static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n= grid.length;
        int[]temp=new int[n*n];
        int idx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[i].length;j++){
                temp[idx++]=grid[i][j];
            }
        }
        Arrays.sort(temp);
        int[]ans=new int[2];

        for(int k=0;k<temp.length;k++){
            for(int m=k+1;m<temp.length;m++){
                if(temp[k]==temp[m]){
                    ans[0]=temp[k];
                    ans[1]=temp[k+2]+1;
                }
            }
        }
        return ans;
    }
    //best and optimal solution
    static int[] findMissingAndRepeatedValues2(int[][] grid) {
        int n = grid.length;
        int size = n * n;

        int[] freq = new int[size + 1];

        // Count frequency
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }

        int[] ans = new int[2];

        for (int i = 1; i <= size; i++) {
            if (freq[i] == 2) {
                ans[0] = i; // repeated
            }
            if (freq[i] == 0) {
                ans[1] = i; // missing
            }
        }

        return ans;
    }
}

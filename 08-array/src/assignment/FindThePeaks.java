package assignment;

//https://leetcode.com/problems/find-the-peaks/?envType=problem-list-v2&envId=array
//2951. Find the Peaks

import java.util.ArrayList;
import java.util.List;

public class FindThePeaks {
    static void main(String[] args) {
        int[]mountain={1,4,3,8,5};
        System.out.println(findPeaks(mountain));
    }
    static List<Integer> findPeaks(int[] mountain) {
        List<Integer>ans=new ArrayList<>();

        for(int i=1;i< mountain.length-1;i++){
            if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]){
                ans.add(i);
            }
        }
        return ans;
    }
}

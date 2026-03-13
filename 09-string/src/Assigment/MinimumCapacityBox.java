package assignment;

//https://leetcode.com/problems/minimum-capacity-box/?envType=problem-list-v2&envId=array
//3861. Minimum Capacity Box

import java.util.ArrayList;
import java.util.List;

public class MinimumCapacityBox {
    static void main(String[] args) {
        int[]capacity={1,5,3,7};
        int itemSize=3;
        System.out.println(minimumIndex(capacity,itemSize));
    }
    static int minimumIndex(int[] capacity, int itemSize) {
        int ans=-1;
        for(int i=0;i< capacity.length;i++){
            if(capacity[i]>=itemSize){
                if(ans==-1 || capacity[i]<capacity[ans]){
                    ans=i;
                }
            }
        }
        return ans;

    }
}

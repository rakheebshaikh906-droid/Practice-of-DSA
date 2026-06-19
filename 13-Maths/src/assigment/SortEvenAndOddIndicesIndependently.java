package Assigment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEvenAndOddIndicesIndependently {
    static void main(String[] args) {
        int[]nums={4,1,2,3};
        System.out.println(Arrays.toString(sorted(nums)));
    }
    static int[] sorted(int[]nums){
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);// increasing
        Collections.sort(odd,Collections.reverseOrder()); //decreasing

        int a = 0, b= 0;
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                nums[i] = even.get(a++);
            } else {
                nums[i] = odd.get(b++);
            }
        }
        return nums;
    }
}
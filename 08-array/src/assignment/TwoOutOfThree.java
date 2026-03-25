package assignment;

//https://leetcode.com/problems/two-out-of-three/description/
//2032. Two Out of Three

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoOutOfThree {
    static void main(String[] args) {
        int [] nums1 = {3,1}, nums2 = {2,3}, nums3 = {1,2};
        System.out.println(twoOutOfThree(nums1,nums2,nums3));
    }

    static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        Set<Integer> s3 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int n : nums1) s1.add(n);
        for(int n : nums2) s2.add(n);
        for(int n : nums3) s3.add(n);

        for(int n : s1){
            if(s2.contains(n) || s3.contains(n)){
                result.add(n);
            }
        }

        for(int n : s2){
            if(s3.contains(n)){
                result.add(n);
            }
        }
        return new ArrayList<>(result);


    }
}

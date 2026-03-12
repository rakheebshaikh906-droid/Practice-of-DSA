package assignment;

//https://leetcode.com/problems/find-the-difference-of-two-arrays/description/
//2215. Find the Difference of Two Arrays

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    static void main(String[] args) {
        int[]nums1={1,2,3};
        int[]nums2={2,4,6};

        System.out.println(findDifference(nums1,nums2));

    }
    static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();

        for(int i=0;i< nums1.length;i++){
            for(int j=0;j< nums2.length;j++){
                if(nums1[i]!=nums2[j]){
                    list1.add(nums1[i]);
                }
                if(nums2[j]!=nums1[i]){
                    list2.add(nums2[j]);
                }
            }
        }
        ans.add(list1);
        ans.add(list2);

        return ans;

    }

    static List<List<Integer>> findDifference2(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int n : nums1) {
            set1.add(n);
        }

        for (int n : nums2) {
            set2.add(n);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int n : set1) {
            if (!set2.contains(n)) {
                list1.add(n);
            }
        }

        for (int n : set2) {
            if (!set1.contains(n)) {
                list2.add(n);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(list1);
        ans.add(list2);

        return ans;
    }
}

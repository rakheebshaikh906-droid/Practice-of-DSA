package assigment;

//https://leetcode.com/problems/count-values-with-equally-spaced-occurrences-i/description/
//4048. Count Values With Equally Spaced Occurrences I

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountValuesWithEquallySpacedOccurrences1 {
    static void main(String[] args) {
        int[]nums={1,8,1,5,1,5,8,5};
        System.out.println(countSpecialIntegers(nums));
    }
    static int countSpecialIntegers(int[]nums){
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        int count=0;
        for(Map.Entry<Integer,List<Integer>> list : map.entrySet()){
            if(list.getValue().size()==3 && list.getValue().get(1)-list.getValue().get(0)==list.getValue().get(2)-list.getValue().get(1)){
                count++;
            }
        }
        return count;
    }
}

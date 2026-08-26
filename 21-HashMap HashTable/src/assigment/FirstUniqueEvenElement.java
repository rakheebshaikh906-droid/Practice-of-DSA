package assigment;

import java.util.HashSet;
import java.util.Set;

public class FirstUniqueEvenElement {
    static void main(String[] args) {
        int[]nums={3,4,2,5,4,6};
        System.out.println(firstUniqueEven(nums));
    }
    static int firstUniqueEven(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for(int num : nums){
            if(!seen.contains(num) && num%2==0){
                return num;
            }
            seen.add(num);
        }
        return -1;

    }
}

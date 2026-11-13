package assigment;

import java.util.HashMap;

public class NRepeatedElementSize2NArray {
    static void main(String[] args) {
        int[]nums={5,1,5,2,5,3,5,4};
        System.out.println(nRepeated(nums));
    }
    static int nRepeated(int[]nums){
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int i : nums){
            freq.put(i, freq.getOrDefault(i,0)+1);
        }

        int maxFreq = 0;
        int ans = -1;

        for (int key : freq.keySet()) {
            if (freq.get(key) > maxFreq) {
                maxFreq = freq.get(key);
                ans = key;
            }
        }
        return ans;


    }
}

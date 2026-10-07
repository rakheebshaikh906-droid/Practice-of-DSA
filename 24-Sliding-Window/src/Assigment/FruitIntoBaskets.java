package Assigment;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/fruit-into-baskets/description/
//904. Fruit Into Baskets

public class FruitIntoBaskets {
    static void main(String[] args) {
        int[]arr={1,2,3,2,2};
        System.out.println(fruits(arr));
    }
    static int fruits(int[]arr){
        int l=0;
        int r=0;
        int maxLen=0;
        Map<Integer,Integer> map = new HashMap<>();

        while(r<arr.length){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);

            if(map.size()>2){
                while(map.size()>2){
                    map.put(arr[l], map.get(arr[l]) - 1);
                    if(map.get(arr[l])==0){
                        map.remove(arr[l]);
                    }
                    l++;
                }
            }
            if(map.size()<=2){
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
    }
}

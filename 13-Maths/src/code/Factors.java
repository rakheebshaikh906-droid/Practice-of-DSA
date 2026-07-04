package code;

import java.util.ArrayList;
public class Factors {
    static void main(String[] args) {
        int nums=28;
        factor(nums);
    }
    static void factor(int nums){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(nums); i++) {
            if (nums % i == 0) {
                if (i == nums / i) {   // FIX 1
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(nums / i);   // FIX 2
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}

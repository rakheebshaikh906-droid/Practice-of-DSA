package Assigment;

//https://leetcode.com/problems/self-dividing-numbers/submissions/1910664751/?envType=problem-list-v2&envId=math
//728. Self Dividing Numbers

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    static void main(String[] args) {
        int left=1;
        int right=22;
        System.out.println(selfDividingNumbers(left,right));
    }
    static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int temp=i;
            boolean ok = true;
            while(temp>0){
                int rem=temp%10;
                if (rem == 0 || i % rem != 0) {
                    ok = false;
                    break;
                }
                temp/=10;
            }
            if (ok) {
                ans.add(i);
            }

        }
        return ans;
    }
}

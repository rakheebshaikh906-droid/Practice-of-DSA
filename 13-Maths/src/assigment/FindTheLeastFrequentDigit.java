package Assigment;

import java.util.*;

public class FindTheLeastFrequentDigit {
    static void main(String[] args) {
        int n= 723344511;
    }
    static int least(int n){
        TreeSet<Integer>set=new TreeSet<>();
        while(n!=0){
            int digit=n%10;
            set.add(digit);
            n/=10;
        }
        return set.first();
    }
}

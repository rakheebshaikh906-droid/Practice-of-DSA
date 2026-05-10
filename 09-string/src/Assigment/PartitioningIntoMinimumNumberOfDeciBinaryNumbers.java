package Assigment;

//https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/description/?envType=problem-list-v2&envId=string
//1689. Partitioning Into Minimum Number Of Deci-Binary Numbers

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    static void main(String[] args) {
        String n="32";
        System.out.println(minimumPartition(n));
    }
    static int minimumPartition(String n){
        int max=0;
        for(int i=0;i<n.length();i++){
            int digit=n.charAt(i)-'0';
            if(digit>max){
                max=digit;
            }
        }
        return max;
    }
}

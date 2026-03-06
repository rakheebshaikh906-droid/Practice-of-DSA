package Assigment;

//https://leetcode.com/problems/truncate-sentence/?envType=problem-list-v2&envId=array
//1816. Truncate Sentence

public class TruncateSentence {
    static void main(String[] args) {
        String s="Hello how are you Contestant";
        int k=4;
        System.out.println(truncateSentence(s,k));
    }
    static String truncateSentence(String s, int k) {
        String[]arr=s.split(" ");
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<k;i++) {
            ans.append(arr[i]);
            if (i < (k - 1)) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}

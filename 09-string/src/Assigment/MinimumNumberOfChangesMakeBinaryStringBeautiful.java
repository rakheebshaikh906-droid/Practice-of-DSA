package Assigment;

//https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/?envType=daily-question&envId=2026-11-18
//2914. Minimum Number of Changes to Make Binary String Beautiful

public class MinimumNumberOfChangesMakeBinaryStringBeautiful {
    static void main(String[] args) {
        String s="1011000110";
        System.out.println(minChanges(s));
    }
    public static  int minChanges(String s) {
        int ans=0;
        for(int i=0;i<s.length()-1;i+=2){
            if(s.charAt(i)-'0'!=s.charAt(i+1)-'0'){
                ans++;
            }
        }
        return ans;
    }
}

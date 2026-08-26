package Assigment;

//https://leetcode.com/problems/shortest-and-lexicographically-smallest-beautiful-string/description/
//2904. Shortest and Lexicographically Smallest Beautiful String

public class ShortestAndLexicographicallySmallestBeautifulString {
    static void main(String[] args) {
        String  s = "100011001";
        int k=3;
        System.out.println(shortestBeautifulSubstring(s,k));
    }
    static String shortestBeautifulSubstring(String s, int k) {
        String ans="";
        for(int i=0;i<s.length();i++){
            int count=0;
            StringBuilder res = new StringBuilder();
            int j=i;
            while(j<s.length() && k > count){
                if(s.charAt(j)=='1'){
                    count++;
                }
                res.append(s.charAt(j));
                j++;

            }
            if (count == k) {

                if (ans.equals("")
                        || res.length() < ans.length()
                        || (res.length() == ans.length()
                        && res.toString().compareTo(ans) < 0)) {

                    ans = res.toString();
                }
            }
        }
        return ans;
   }
}

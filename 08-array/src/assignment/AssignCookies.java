package assignment;

import java.util.Arrays;

//https://leetcode.com/problems/assign-cookies/
//455. Assign Cookies

public class AssignCookies {
    static void main(String[] args) {
        int[]g={1,2,3};
        int[]s={1,1};
        System.out.println(findContentChildren(g,s));
    }
    static int findContentChildren(int[] g, int[] s) {
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int left=0;
        int right=0;
        while(left<g.length && right<s.length){
            if(g[left]<=s[right]){
                count++;
                left++;
                right++;
            }else{
                right++;
            }
        }
        return count;
    }
}

package Assigment;
import java.util.Collection;
//leetcode.com/problems/shuffle-string/description/
//1528. Shuffle String
public class ShuffleString {
    static void main(String[] args) {
        String s="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        System.out.println(shuffle(s,indices));
    }
    static String shuffle(String s,int[] indices){
        //character array to form final string
        char[] str=new char[s.length()];
        //do what the question says
        for(int i=0;i<s.length();i++){
            str[indices[i]]=s.charAt(i);
        }
        //return the restoring value
        return String.valueOf(str);
    }
}

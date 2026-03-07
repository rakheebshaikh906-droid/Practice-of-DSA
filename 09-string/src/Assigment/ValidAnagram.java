package Assigment;

//https://leetcode.com/problems/valid-anagram/description/?envType=problem-list-v2&envId=string
//242. Valid Anagram
public class ValidAnagram {
    static void main(String[] args) {
        String s="anagram";
        String t="nagaram";

        System.out.println(isAnagram(s,t));
    }
    static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        //Frequency array
        int [] count= new int[26];

        //Count characters of first string
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);// character nikaala
            int index=ch-'a';  // index calculate kiya
            count[index]++;     // increase the frequency
        }

        //Decrease count using second string
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);// character nikaala
            int index=ch-'a';  // index calculate kiya
            count[index]--;     // decrease the frequency


            if(count[index]<0){
                return false;
            }
        }
        return true;
    }
}

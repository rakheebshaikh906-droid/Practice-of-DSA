package Assigment;
//https://leetcode.com/problems/length-of-last-word/description/
//58. Length of Last Word
public class LengthOfTheLastWord {
    static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
    static int lengthOfLastWord(String s){
        s=s.trim();//trim() method remove the extra spaces from start to and
        //because if extra spaces are present in the end the give space length not last word length
        int length=0;
        //we run the loop from end to start
        for(int i=s.length()-1;i>=0;i--){
            //we check if tha charAt(i)==spaces means last word will be complete
            //then we break the loop and give this character length
            if(s.charAt(i)==' '){
                break;
            }
            length++;
        }
        return length;
    }
}

package Assigment;

//https://leetcode.com/problems/detect-capital/description/
//520. Detect Capital

public class DetectCapital {
    static void main(String[] args) {
        String word ="USA";
        System.out.println(detect(word));
    }
    static boolean detect(String word){
        int upperCast=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))) {
                upperCast++;
            }
        }

        return upperCast==word.length() || upperCast==0 || upperCast==1 && Character.isUpperCase(word.charAt(0));
    }
}

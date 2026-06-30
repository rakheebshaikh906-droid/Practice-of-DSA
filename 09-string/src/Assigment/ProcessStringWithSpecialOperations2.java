package Assigment;

//https://leetcode.com/problems/process-string-with-special-operations-i/description/
//3612. Process String with Special Operations I

public class ProcessStringWithSpecialOperations2 {
    static void main(String[] args) {
        String s="a#b%*";
        System.out.println(processStr(s));
    }
    static String processStr(String s){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*' && result.length()>0){
                result.delete(result.length() - 1,result.length());
            } else if (s.charAt(i)  == '#') {
                result.append(result);
            } else if (s.charAt(i)  == '%') {
                result.reverse();
            }else{
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}

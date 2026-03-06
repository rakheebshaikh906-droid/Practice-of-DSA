package Assigment;
//https://leetcode.com/problems/to-lower-case/description/
//709. To Lower Case
public class ToLowerCase {
    static void main(String[] args) {
        String s = "HELLO";//expected output:"hello"
        System.out.println(Lowercase(s));
    }
    static String Lowercase(String s){
        //convert the string into lower case
        String s1=s;
        return s1.toLowerCase();
    }
}

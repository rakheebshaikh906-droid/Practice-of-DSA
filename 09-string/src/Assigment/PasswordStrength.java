package Assigment;

//https://leetcode.com/problems/password-strength/description/?envType=problem-list-v2&envId=string
//3941. Password Strength

import java.util.HashSet;
import java.util.Set;

public class PasswordStrength {
    static void main(String[] args) {
        String password = "bbB11#";
        System.out.println(password(password));
    }
    static int password(String password){
        Set<Character>pass=new HashSet<>();
        for(int i=0;i<password.length();i++){
            pass.add(password.charAt(i));
        }
        int sum=0;
        for(char ch : pass){
            if(Character.isUpperCase(ch)){
                sum+=2;
            } else if (Character.isLowerCase(ch)) {
                sum+=1;
            } else if (Character.isDigit(ch)) {
                sum+=3;
            }else {
                sum+=5;
            }
        }
        return sum;
    }
}

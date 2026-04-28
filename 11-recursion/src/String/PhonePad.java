package String;

import java.util.ArrayList;

public class PhonePad {
    static void main(String[] args) {
        pad("","12");
        System.out.println(padRet("","12"));
        System.out.println(padCount("","12"));
    }
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';//this will be convert '2' into 2.

        for (int i=(digit-1)*3;i<digit*3;i++){
            char ch= (char)('a'+i);//its give me the proper char like a b c ..... and so on

            //recursive call
            pad(p+ch,up.substring(1));
        }
    }

    //method for returning in the string
    static ArrayList<String> padRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>ans=new ArrayList<>();

        int digit=up.charAt(0)-'0';//this will be convert '2' into 2.

        for (int i=(digit-1)*3;i<digit*3;i++) {
            char ch = (char) ('a' + i);//its give me the proper char like a b c ..... and so on

            //recursive call
            ans.addAll(padRet(p + ch, up.substring(1)));
        }
        return ans;
    }
    //count
    static int padCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int digit=up.charAt(0)-'0';//this will be convert '2' into 2.
        int count=0;
        for (int i=(digit-1)*3;i<digit*3;i++){
            char ch= (char)('a'+i);//its give me the proper char like a b c ..... and so on

            //recursive call
           count+=padCount(p+ch,up.substring(1));
        }
        return count;
    }
}

package String;

import java.util.ArrayList;
public class SubSequence {
    static void main(String[] args) {
        subSeq("","abc");
        System.out.println(subSeqReturn("","abc"));
    }
    static void subSeq( String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);

        //first recursion call for take it
        subSeq(p+ch,up.substring(1));
        //second recursion call for ignore it
        subSeq(p,up.substring(1));
    }

    //return the array list
    static ArrayList<String> subSeqReturn(String p,String up){
        //base case
        if(up.isEmpty()){
            //create a new array list and return in it
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        //take it
        ArrayList<String> left=subSeqReturn(p+ch,up.substring(1));
        //ignore it
        ArrayList<String> right=subSeqReturn(p,up.substring(1));

        //add both left and right str
        left.addAll(right);
        //return any one left and right
        return left;
    }
}
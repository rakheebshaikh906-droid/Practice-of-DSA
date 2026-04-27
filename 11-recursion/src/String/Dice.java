package String;

import java.util.ArrayList;

public class Dice {
    static void main(String[] args) {
        dice("",4);
        System.out.println(diceReturn("",4));
        System.out.println(diceCount("",4));
        System.out.println(diceface("",6,7));
        System.out.println(diceFaceCount("",6,7));
    }
    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            //recursive call
            dice(p+i,target-i);
        }
    }
    //return in arrayList
    static ArrayList<String> diceReturn(String p,int target){
        if(target==0){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>ans=new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){
            //recursive call
            ans.addAll(diceReturn(p+i,target-i));
        }
        return ans;
    }
    //count
    static int diceCount(String p,int target){
        if(target==0){
            return 1;
        }
        int count=0;
        for(int i=1;i<=6 && i<=target;i++){
            //recursive call
            count=count+(diceCount(p+i,target-i));
        }
        return count;
    }
    //if you can given dice face its not 6 but its given the
    static ArrayList<String> diceface(String p,int target,int face){
        if(target==0){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>ans=new ArrayList<>();
        for(int i=1;i<=face && i<=target;i++){
            //recursive call
            ans.addAll(diceface(p+i,target-i,face));
        }
        return ans;
    }
    //count
    static int diceFaceCount(String p,int target,int face){
        if(target==0){
            return 1;
        }
        int count=0;
        for(int i=1;i<=face && i<=target;i++){
            //recursive call
            count+=(diceFaceCount(p+i,target-i,face));
        }
        return count;
    }
}

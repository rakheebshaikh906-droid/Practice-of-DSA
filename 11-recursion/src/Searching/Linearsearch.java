package Searching;

import java.util.ArrayList;

public class Linearsearch {
    static void main(String[] args) {
        int[]arr={1,3,4,6,9,5,7,9};
        int target=9;
        System.out.println(search(arr,target,0));
        System.out.println(searchIndex(arr,target,0));
        searchAllIndex(arr,target,0);
        System.out.println(list);
        System.out.println(linearSearch(arr,target,0,new ArrayList<>()));
        System.out.println(linearSearch2(arr,target,0));
    }

    //check if the target will present in the array or not
    static boolean search(int[]arr,int target,int index){
        if(index==arr.length-1){
            return false;
        }
        return arr[index]==target || search(arr,target,index+1);
    }

    //this method for return index
    static int searchIndex(int[]arr,int target,int index){
        if(index==arr.length-1){
            return -1 ;
        }
        if(arr[index]==target){
            return index;
        }else{
            return searchIndex(arr,target,index+1);
        }
    }

    //it's used when we have two or more occ of a target
    static ArrayList<Integer>list=new ArrayList<>();
    static void searchAllIndex(int[]arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        searchAllIndex(arr,target,index+1);
    }

    //return array list
    //this is very used full as compare to below one
    static ArrayList<Integer> linearSearch(int[]arr,int target,int index,ArrayList<Integer>list){
        if(index==arr.length){
            return list;
        }
        if(target==arr[index]){
            list.add(index);
        }
        return linearSearch(arr,target,index+1,list);
    }

    static ArrayList<Integer> linearSearch2(int[]arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(target==arr[index]){
            list.add(index);
        }
        ArrayList<Integer>ansFromBelowCalls= linearSearch2(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
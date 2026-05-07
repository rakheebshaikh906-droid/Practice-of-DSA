package code;

public class Sorted{
    static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[]arr,int index){
        //base case
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}

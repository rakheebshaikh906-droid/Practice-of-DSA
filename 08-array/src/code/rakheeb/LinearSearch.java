package code.rakheeb;

//Q.search in array using linear search.
public class LinearSearch {
    static void main(String[] args) {
        int[]arr={23,34,56,78,90};
        int target=56;
        System.out.println(search(arr,target));
    }

    //method for searching
    static int search(int[]arr,int target){
        for(int i=0;i< arr.length;i++){
            //int element=arr[index];//this is will be used when we need element accept index value
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}

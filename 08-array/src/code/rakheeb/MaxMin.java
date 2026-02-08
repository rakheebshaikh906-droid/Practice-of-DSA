package code.rakheeb;

//Q.find the maximum value in array and minimum value in array
public class MaxMin {
    static void main(String[] args) {
        int[]arr={23,45,65,4,56,67,87,66};
        System.out.print("maximum value in the array is:");
        System.out.println(Max(arr));
        System.out.print("minimum value in the array is:");
        System.out.println(Min(arr));
    }

    //method for finding maximum value in array
    static int Max(int[]arr){
        int maxvalue=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxvalue){
                maxvalue=arr[i];
            }
        }
        return maxvalue;
    }

    //method for finding minimum value in array
    static int Min(int[]arr){
        int minvalue=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minvalue){
                minvalue=arr[i];
            }
        }
        return minvalue;
    }
}

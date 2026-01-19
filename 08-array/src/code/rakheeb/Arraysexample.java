package code.rakheeb;
// write a java programme to store n number in an array and display
//1) all element
//2) the sum of all element
//3) the maximum and minimum element
import java.util.Scanner;
public class Arraysexample {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number:");
        int n= in.nextInt();
        int[]arr=new int[n];

        //input element
        System.out.println("enter "+ n + " element:");
        for(int i=0 ; i<n ; i++){
            arr[i]=in.nextInt();
        }

        //display element

        System.out.println("\nArray elements are:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");//use print for same line
        }

        //find sum,max,min

        int sum=0;
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }

        //display the result

        System.out.println("\n\nsum of element "+ sum);
        System.out.println("maximum number is "+ max);
        System.out.println("minimum number is "+ min);
    }
}

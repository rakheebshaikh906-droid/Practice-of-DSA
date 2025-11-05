package Assignment;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // print n numbers of fibonacci series and take
        // input n from user
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = in.nextInt();

        int a=0;
        int b=1;
        int count =2;

        while (count<=n){
            int temp = b;
            b =b+a;
            a = temp;
            count++;
            System.out.println(a);
        }

    }
}
/* while (count<=n){
  int temp = b;
  b =b+a;
  a=temp;
  count++
  }
 */
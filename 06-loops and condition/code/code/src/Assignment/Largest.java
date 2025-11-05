package Assignment;

import java.util.Scanner;

public class Largest {
//    Take integer inputs till the user
//    enters 0 and print the largest number from all.
    public static void main(String[] args) {

          int max =0;

         while (true){
             Scanner in = new Scanner(System.in);
             int n = in.nextInt();


                if (n>max){
                    max = n;
                }
                if (n==0){
                    break;
                }
    }
          System.out.println("largest : "+max);

}

}

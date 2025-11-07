package Assignment;

import java.util.Scanner;

public class Product_Sum {
    public static void main(String[] args) {
        // Subtract the Product and Sum of Digits
        // of an Integer

        Scanner in = new Scanner(System.in);
        System.out.print("enter integer : ");
        int num = in.nextInt();


        int product = 1;
        int sum =0;
        while (num>0){
            int rem = num%10;
            product = product*rem;
            sum = sum +rem;
            num /=10;
        }
        System.out.println(product);
        System.out.println(sum);
        int sub = product-sum;
        System.out.println(sub);


    }
}

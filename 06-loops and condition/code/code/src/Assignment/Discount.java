package Assignment;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter original amount : ");
        double orignalAmount = in.nextDouble();

        System.out.print("enter discount in % : ");
        double discountPercentage = in.nextDouble();

        double discountAmount = (discountPercentage/100)*orignalAmount;
        double finalPrice = orignalAmount-discountAmount;

        System.out.println("the Discounted amount is : "+discountAmount);
        System.out.println("the final price is : "+finalPrice);


    }
}

package Assignment;

import java.util.Scanner;

public class Product {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int ans = product(a,b);
        System.out.println(ans);
    }
    static int product(int a , int b){
        int product = a*b;
        return product;
    }

}

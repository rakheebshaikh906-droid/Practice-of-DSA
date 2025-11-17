package Assignment;

import java.util.Scanner;

public class Circumfrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter radius :");
        int r = in.nextInt();

        double ans = circum(r);
        System.out.print("circumfrence : "+ ans);

    }
    static double circum(int r){
        double area = 2*3.142*r;
        return area;

    }
}

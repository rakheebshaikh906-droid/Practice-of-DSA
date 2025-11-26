package Assignment;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if(isEligible(age)){
            System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }

    }
    static boolean isEligible(int n){
        return n>=18;
    }

}

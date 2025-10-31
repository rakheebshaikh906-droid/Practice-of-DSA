package Assignment;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // average on N numbers until user press 0
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true){
            int num = in.nextInt();
            if (num!=0){
                sum=sum+num;
                count++;
            } else if (num==0) {
                break;
            }else {
                System.out.println("invalid integer");
            }

        }
        double avg = sum/count;
        System.out.println("Average: "+avg);
    }
}

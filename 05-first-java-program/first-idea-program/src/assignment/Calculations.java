package assignment;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter num1 : ");
        int num1 = in.nextInt();

        System.out.print("enter num2 : ");
        int num2 = in.nextInt();

        System.out.print("Select operator (+,-,*,/) : ");
        String op = in.next();

        if (op.equals("+")){
            System.out.println(num1+num2);
        } else if (op.equals("-") ) {
            System.out.println(num1-num2);
        } else if (op.equals("*")) {
            System.out.println(num1*num2);
        }else if (op.equals("/")) {
            System.out.println(num1/num2);
        }else {
            System.out.println("please enter valid operator");
        }


    }
}

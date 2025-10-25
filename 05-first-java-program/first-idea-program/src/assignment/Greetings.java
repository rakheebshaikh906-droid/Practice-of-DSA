package assignment;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter your name :");
        String name = in.next();
        System.out.println("hello "+name+", you are welcome");
    }
}

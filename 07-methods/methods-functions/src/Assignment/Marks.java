package Assignment;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter marks : ");
        int marks = in.nextInt();
        int result = grades(marks);
        System.out.println(result);

    }
    static int grades(int marks){
        if (marks >=91 && marks <=100){
            System.out.println("AA");
        }
        if (marks >=81 && marks <=90){
            System.out.println("AB");
        }
        if (marks >=71 && marks <=80){
            System.out.println("BB");
        }
        if (marks >=61 && marks <=70){
            System.out.println("BC");
        }
        if (marks >=51 && marks <=60){
            System.out.println("CD");
        }
        if (marks >=41 && marks <=50){
            System.out.println("DD");
        }
        if ( marks <=40){
            System.out.println("Fail");
        }
        return marks;
    }

}
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail

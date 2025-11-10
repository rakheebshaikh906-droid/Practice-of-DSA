package rakheeb;

public class Conditionals {
  public static void main(String[] args) {
        int marks = 85;

        // Simple if-else condition
        if (marks >= 90) {
            System.out.println("Excellent!");
        } 
        else if (marks >= 75) {
            System.out.println("Very Good!");
        } 
        else if (marks >= 50) {
            System.out.println("Good, but you can do better!");
        } 
        else {
            System.out.println("Needs improvement");
        }

        // Nested if example
        if (marks >= 60) {
            System.out.println("You passed the exam!");
            if (marks >= 80) {
                System.out.println("You also got distinction 🎉");
            }
        } else {
            System.out.println("Sorry, you failed the exam 😔");
        }
    }
}


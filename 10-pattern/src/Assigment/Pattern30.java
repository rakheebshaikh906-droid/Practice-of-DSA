package Assigment;

//30.         1
//          2 1 2
//        3 2 1 2 3
//      4 3 2 1 2 3 4
//    5 4 3 2 1 2 3 4 5
public class Pattern30 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 1; i <= n; i++) {

            // leading spaces (single space * 2 for proper alignment)
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            // decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

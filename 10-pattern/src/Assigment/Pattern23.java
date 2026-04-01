package Assigment;

//23.    1
//       0 1
//       1 0 1
//       0 1 0 1
//       1 0 1 0 1
public class Pattern23 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // print 1 when (i + j) is even, else 0
                System.out.print(((i + j) % 2) + " ");
            }
            System.out.println();
        }
    }
}

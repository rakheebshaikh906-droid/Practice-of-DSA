package Assigment;

//27.   1 1 1 1 1 1
//      2 2 2 2 2
//      3 3 3 3
//      4 4 4
//      5 5
//      6
public class Pattern27 {
    static void main(String[] args) {
        pattern(6);
    }
    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

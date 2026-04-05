package Assigment;

//32.    E
//       D E
//       C D E
//       B C D E
//       A B C D E
public class Pattern32 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){

        for (int i = 0; i < n; i++) {

            // starting character (E, D, C, B, A)
            char ch = (char) ('A' + (n - 1 - i));

            // print from starting char to E
            for (char c = ch; c <= 'A' + (n - 1); c++) {
                System.out.print(c + " ");
            }

            System.out.println();
        }
    }
}

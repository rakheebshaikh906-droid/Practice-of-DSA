package Assigment;

//31.      4 4 4 4 4 4 4
//         4 3 3 3 3 3 4
//         4 3 2 2 2 3 4
//         4 3 2 1 2 3 4
//         4 3 2 2 2 3 4
//         4 3 3 3 3 3 4
//         4 4 4 4 4 4 4
public class Pattern31 {
    static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        int size = 2 * n - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;

                int layer = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print((n - layer) + " ");
            }
            System.out.println();
        }
    }
}

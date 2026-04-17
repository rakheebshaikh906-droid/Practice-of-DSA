package Assigment;

//https://leetcode.com/problems/permutation-sequence/description/?envType=problem-list-v2&envId=recursion
//60. Permutation Sequence
public class PermutationSequence {
    static void main(String[] args) {
        int n=3;
        int k=3;
        System.out.println(getPermutation(n,k));
    }
    static int count = 0;
    static String answer = "";

    static String getPermutation(int n, int k) {
        StringBuilder up = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            up.append(i);
        }

        permutationFinder("", up.toString(), k);
        return answer;
    }

    static void permutationFinder(String p, String up, int k) {
        if (!answer.isEmpty()) return;

        // base condition
        if (up.isEmpty()) {
            count++;
            if (count == k) {
                answer = p;
            }
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            if (!answer.isEmpty()) return;

            String first = p.substring(0, i);
            String second = p.substring(i);

            permutationFinder(first + ch + second, up.substring(1), k);
        }
    }
}

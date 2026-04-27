package String;

import java.util.ArrayList;
public class Permutation {
    public static void main(String[] args) {
        permutation("", "abc");
        System.out.println(permutationReturn("", "abc"));
        System.out.println(permutationCount("", "abc"));
    }

    // Print permutations
    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i,p.length());
            permutation(first + ch + second, up.substring(1));
        }
    }

    // Return permutations in ArrayList
    static ArrayList<String> permutationReturn(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(permutationReturn(first + ch + second, up.substring(1)));
        }

        return ans;
    }

    // Count permutations
    static int permutationCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        char ch = up.charAt(0);
        int count =0;

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count =count+permutationCount(first + ch + second, up.substring(1));
        }

        return count;
    }
}
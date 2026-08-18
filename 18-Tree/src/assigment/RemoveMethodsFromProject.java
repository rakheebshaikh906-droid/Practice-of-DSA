package assigment;

//https://leetcode.com/problems/remove-methods-from-project/?envType=daily-question&envId=2026-08-05
//3310. Remove Methods From Project

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RemoveMethodsFromProject {
    static void main(String[] args) {

        int n = 4;
        int k = 1;
        int[][] invocations = {
                {0, 1},
                {1, 2},
                {2, 3}
        };
        System.out.println(remainingMethods(n,k,invocations));
    }

    static void dfs(int node, HashMap<Integer, ArrayList<Integer>> invoke, int[] vis) {

        vis[node] = 1;

        if (!invoke.containsKey(node)) {
            return;
        }

        for (int it : invoke.get(node)) {

            if (vis[it] == 0) {
                dfs(it, invoke, vis);
            }
        }
    }

    static List<Integer> remainingMethods(int n, int k, int[][] invocations) {

        HashMap<Integer, ArrayList<Integer>> invoke = new HashMap<>();

        // Build Graph
        for (int[] edge : invocations) {

            int u = edge[0];
            int v = edge[1];

            invoke.computeIfAbsent(u, x -> new ArrayList<>()).add(v);
        }

        // Find Suspicious Methods
        int[] vis = new int[n];
        dfs(k, invoke, vis);

        List<Integer> rem = new ArrayList<>();

        // Check if any non-suspicious method calls a suspicious method
        for (int[] edge : invocations) {

            int u = edge[0];
            int v = edge[1];

            if (vis[u] == 0 && vis[v] == 1) {

                for (int i = 0; i < n; i++) {
                    rem.add(i);
                }

                return rem;
            }
        }

        // Return remaining methods
        for (int i = 0; i < n; i++) {

            if (vis[i] == 0) {
                rem.add(i);
            }
        }

        return rem;
    }
}
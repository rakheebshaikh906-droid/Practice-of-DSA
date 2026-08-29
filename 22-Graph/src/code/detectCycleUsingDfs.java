package code;

import java.util.*;

public class detectCycleUsingDfs {

    // DFS function to detect cycle
    static boolean detectCycle(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[node] = true;

        for (int neighbor : adj.get(node)) {

            // parent ko ignore karo
            if (neighbor == parent) continue;

            // agar already visited hai -> cycle
            if (visited[neighbor]) return true;

            // DFS call
            if (detectCycle(neighbor, node, adj, visited)) return true;
        }

        return false;
    }

    public static void main(String[] args) {

        int n = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // edges (undirected)
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(3).add(1); // cycle banaya
        adj.get(1).add(3);

        boolean[] visited = new boolean[n];

        boolean hasCycle = false;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                if (detectCycle(i, -1, adj, visited)) {
                    hasCycle = true;
                    break;
                }
            }
        }

        System.out.println(hasCycle); // true / false
    }
}
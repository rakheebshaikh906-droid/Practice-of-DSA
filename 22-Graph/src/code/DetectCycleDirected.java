package code;

import java.util.*;

//detect cycle in directed graph using dfs
public class DetectCycleDirected {

    public static boolean detectCycle(int node, List<List<Integer>> adj, boolean[] visited, boolean[] path) {

        visited[node] = true;
        path[node] = true;

        for (int j = 0; j < adj.get(node).size(); j++) {
            int neighbor = adj.get(node).get(j);

            // If already in current path → cycle found
            if (path[neighbor]) {
                return true;
            }

            // If not visited, go deeper
            if (!visited[neighbor]) {
                if (detectCycle(neighbor, adj, visited, path)) {
                    return true;
                }
            }
        }

        // Backtrack
        path[node] = false;
        return false;
    }

    public static boolean isCycle(int V, List<List<Integer>> adj) {
        boolean[] visited = new boolean[V];
        boolean[] path = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (detectCycle(i, adj, visited, path)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 4;

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Example graph
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(1); // cycle here

        System.out.println(isCycle(V, adj)); // true
    }
}
package code;

import java.util.*;

public class BFSGraph {

    public static void main(String[] args) {
        int V = 5;

        // Adjacency list (same as vector<int> adj[])
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // edges (example)
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(4);

        System.out.println(bfs(V, adj));
    }

    static ArrayList<Integer> bfs(int V, ArrayList<ArrayList<Integer>> adj) {

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];

        ArrayList<Integer> ans = new ArrayList<>();

        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {

            int node = q.poll();
            ans.add(node);

            for (int i = 0; i < adj.get(node).size(); i++) {

                int neighbor = adj.get(node).get(i);

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }

        return ans;
    }
}
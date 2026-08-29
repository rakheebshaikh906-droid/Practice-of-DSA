package code;

import java.util.*;

//detect cycle in directed graph using bfs
public class DetectCycleBFS {

    public static boolean isCycle(int V, List<List<Integer>> adj) {

        int[] indegree = new int[V];

        // Step 1: Calculate indegree
        for (int i = 0; i < V; i++) {
            for (int neighbor : adj.get(i)) {
                indegree[neighbor]++;
            }
        }

        // Step 2: Add nodes with indegree 0
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        // Step 3: BFS
        int count = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            count++;

            for (int neighbor : adj.get(node)) {
                indegree[neighbor]--;

                if (indegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        // Step 4: Check cycle
        return count != V;
    }

    public static void main(String[] args) {
        int V = 4;

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Example with cycle
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(1); // cycle

        System.out.println(isCycle(V, adj)); // true
    }
}
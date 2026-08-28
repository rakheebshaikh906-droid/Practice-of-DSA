package code;

import java.util.*;

public class adjacencyList {
    public static void main(String[] args) {

        int n = 4;

        // adjacency list
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // edges: (node, weight)
        adj.get(0).add(new int[]{1, 5});
        adj.get(1).add(new int[]{0, 5});

        adj.get(1).add(new int[]{2, 3});
        adj.get(2).add(new int[]{1, 3});

        adj.get(2).add(new int[]{3, 2});
        adj.get(3).add(new int[]{2, 2});

        // print adjacency list
        for (int i = 0; i < n; i++) {
            System.out.print(i + " -> ");
            for (int[] edge : adj.get(i)) {
                System.out.print("(" + edge[0] + "," + edge[1] + ") ");
            }
            System.out.println();
        }
    }
}
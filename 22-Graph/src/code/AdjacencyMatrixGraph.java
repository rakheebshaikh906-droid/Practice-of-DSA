package code;

import java.util.Scanner;

//this was the example of unweighted graph

public class AdjacencyMatrixGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        int[][] adjMatrix = new int[n][n];

        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();

        // Taking edges input
        for (int i = 0; i < edges; i++) {
            System.out.print("Enter edge (u v): ");
            int u = sc.nextInt();
            int v = sc.nextInt();

            // Undirected graph
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1;
        }

        // Printing adjacency matrix
        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
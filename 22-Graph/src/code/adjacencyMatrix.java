package code;

public class adjacencyMatrix {
    public static void main(String[] args) {

        //this was a code of undirected unweighted graph
        int n = 4; // number of vertices
        int[][] adj = new int[n][n];

        // edges (undirected)
        adj[0][1] = 1;
        adj[1][0] = 1;

        adj[1][2] = 1;
        adj[2][1] = 1;

        adj[2][3] = 1;
        adj[3][2] = 1;

        // print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }

    //this was the example of undirected unweighted graph

//    int n = 4; // number of vertices
//    int[][] adjacency = new int[n][n];
//
//    // edges with weights (undirected)
//    adjacency[0][1]=5;
//    adjacency[1][0]=5;
//
//    adjacency[1][2]=3;
//    adjacency[2][1]=3;
//
//    adjacency[2][3]=2;
//    adjacency[3][2]=2;
//
//    // print matrix
//        for(
//    int i = 0;
//    i<n;i++)
//
//    {
//        for (int j = 0; j < n; j++) {
//            System.out.print(adjacency[i][j] + " ");
//        }
//        System.out.println();
//    }

}
package Assigment;

//https://leetcode.com/problems/find-the-safest-path-in-a-grid/description/?envType=daily-question&envId=2026-07-01
//2812. Find the Safest Path in a Grid

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindTheSafestPathInGrid {
    static void main(String[] args) {
        int[][] grid = {
                {1, 0, 0},
                {0, 0, 0},
                {0, 0, 1}
        };
        //System.out.println(maximumSafenessFactor(grid));
    }


    static int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    static int maximumSafenessFactor(List<List<Integer>> grid) {

        int n = grid.size();
        int[][] dist = new int[n][n];

        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        Queue<int[]> q = new LinkedList<>();

        // Add all thieves into queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    dist[i][j] = 0;
                    q.offer(new int[]{i, j});
                }
            }
        }

        // Multi Source BFS
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (nr >= 0 && nr < n &&
                        nc >= 0 && nc < n &&
                        dist[nr][nc] == Integer.MAX_VALUE) {

                    dist[nr][nc] = dist[r][c] + 1;
                    q.offer(new int[]{nr, nc});
                }
            }
        }

        // Print Distance Grid
        System.out.println("Distance Grid:");

        for (int[] row : dist) {
            System.out.println(Arrays.toString(row));
        }

        int low = 0;
        int high = 2 * n;
        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canReach(dist, mid, n)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    static boolean canReach(int[][] dist, int safe, int n) {

        if (dist[0][0] < safe)
            return false;

        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[n][n];

        q.offer(new int[]{0, 0});
        vis[0][0] = true;

        while (!q.isEmpty()) {

            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];

            if (r == n - 1 && c == n - 1)
                return true;

            for (int[] d : dirs) {

                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nr < n &&
                        nc >= 0 && nc < n &&
                        !vis[nr][nc] &&
                        dist[nr][nc] >= safe) {

                    vis[nr][nc] = true;
                    q.offer(new int[]{nr, nc});
                }
            }
        }

        return false;
    }
}

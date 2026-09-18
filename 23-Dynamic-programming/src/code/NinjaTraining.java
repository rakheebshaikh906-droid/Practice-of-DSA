package code;

import java.util.Arrays;
public class NinjaTraining {
    static void main(String[] args) {
        int[][] points = {
                {10, 40, 70},
                {20, 50, 80},
                {30, 60, 90}
        };
        int n = points.length;

        int recursionAnswer = recursion(n - 1, 3, points);

        int[][] dp = new int[n][4];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int memoizationAnswer = memoization(n - 1, 3, points, dp);
        int tabulationAnswer = tabulation(n, points);
        int spaceOptimizedAnswer = spaceOptimized(n, points);

        System.out.println("Recursion: " + recursionAnswer);
        System.out.println("Memoization: " + memoizationAnswer);
        System.out.println("Tabulation: " + tabulationAnswer);
        System.out.println("Space Optimized: " + spaceOptimizedAnswer);
    }

    //using recursion
    static int recursion(int day, int last, int[][] points) {
        if (day == 0) {
            int max = 0;
            for (int task = 0; task < 3; task++) {
                if (task != last) {
                    max = Math.max(max, points[0][task]);
                }
            }
            return max;
        }
        int max = 0;
        for (int task = 0; task < 3; task++) {
            if (task != last) {
                int current = points[day][task] + recursion(day - 1, task, points);
                max = Math.max(max, current);
            }
        }
        return max;
    }

    //using memorization
    static int memoization(int day, int last, int[][] points, int[][] dp) {
        if (day == 0) {
            int max = 0;
            for (int task = 0; task < 3; task++) {
                if (task != last) {
                    max = Math.max(max, points[0][task]);
                }
            }
            return max;
        }
        if (dp[day][last] != -1) {
            return dp[day][last];
        }
        int max = 0;
        for (int task = 0; task < 3; task++) {
            if (task != last) {
                int current = points[day][task] + memoization(day - 1, task, points, dp);
                max = Math.max(max, current);
            }
        }
        return dp[day][last] = max;
    }

    //using tabulation
    static int tabulation(int n, int[][] points) {
        int[][] dp = new int[n][4];

        dp[0][0] = Math.max(points[0][1], points[0][2]);
        dp[0][1] = Math.max(points[0][0], points[0][2]);
        dp[0][2] = Math.max(points[0][0], points[0][1]);

        dp[0][3] = Math.max(
                points[0][0],
                Math.max(points[0][1], points[0][2])
        );

        for (int day = 1; day < n; day++) {
            for (int last = 0; last < 4; last++) {
                dp[day][last] = 0;
                for (int task = 0; task < 3; task++) {
                    if (task != last) {
                        int current = points[day][task] + dp[day - 1][task];
                        dp[day][last] = Math.max(dp[day][last], current);
                    }
                }
            }
        }
        return dp[n - 1][3];
    }

    //using spaceOptimization
    static int spaceOptimized(int n, int[][] points) {
        int[] prev = new int[4];

        prev[0] = Math.max(points[0][1], points[0][2]);
        prev[1] = Math.max(points[0][0], points[0][2]);
        prev[2] = Math.max(points[0][0], points[0][1]);

        prev[3] = Math.max(
                points[0][0],
                Math.max(points[0][1], points[0][2])
        );

        for (int day = 1; day < n; day++) {
            int[] current = new int[4];
            for (int last = 0; last < 4; last++) {
                for (int task = 0; task < 3; task++) {
                    if (task != last) {
                        int value = points[day][task] + prev[task];

                        current[last] = Math.max(current[last], value);
                    }
                }
            }
            prev = current;
        }
        return prev[3];
    }
}
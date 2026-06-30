package Assigment;

//https://leetcode.com/problems/valid-boomerang/
//1037. Valid Boomerang
public class ValidBoomerang {
    static void main(String[] args) {
        int [][]points={
                {1,1},
                {2,3},
                {3,2}
        };
        System.out.println(isBoomerang(points));
    }
    static boolean isBoomerang(int[][] points) {
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];

        return (x2 - x1) * (y3 - y1) != (y2 - y1) * (x3 - x1);
    }
}

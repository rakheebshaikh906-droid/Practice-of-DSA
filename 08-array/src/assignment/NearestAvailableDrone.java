package assignment;

//https://leetcode.com/contest/weekly-contest-515/problems/nearest-available-drone/description/
//Q1. Nearest Available Drone

public class NearestAvailableDrone {
    static void main(String[] args) {
        int[][]drones={
                {0,0,8},
                {2,2,9}
        };
        int[]target={3,4};
        System.out.println(nearestDrone(drones,target));
    }
    static int nearestDrone(int[][] drones, int[] target) {
        int x2=target[0];
        int y2=target[1];

        int minDistance=Integer.MAX_VALUE;
        int ans=-1;
        for(int i=0;i<=drones.length-1;i++) {
            int x1 = drones[i][0];
            int y1 = drones[i][1];
            int range = drones[i][2];

            int distance=Math.abs(x1-x2)+Math.abs(y1-y2);

            if(distance<=range){
                if(distance<minDistance){
                    minDistance=distance;
                    ans=i;
                }
            }
        }
        return ans;



    }
}

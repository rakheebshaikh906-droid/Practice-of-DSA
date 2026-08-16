package assignment;

//https://leetcode.com/contest/weekly-contest-515/problems/minimize-the-maximum-waiting-time-at-synchronized-traffic-lights/description/
//Q2. Minimize the Maximum Waiting Time at Synchronized Traffic Lights

import java.util.Arrays;
public class MinimizeTheMaximumWaitingTime {
    static void main(String[] args) {
        int period=8;
        int[]lights={2,3};
        int[]arrivalTime={2,5,8,11};
        System.out.println(minPenalty(period,lights,arrivalTime));
    }
    static int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int ans=0;
        Arrays.sort(lights);
        int light=lights[lights.length-1];
        for(int i=0;i<arrivalTime.length;i++){
            int r=arrivalTime[i]%period;
            if(r<light){
                ans+=0;
            }else{
                ans=Math.max(ans,period-r);
            }
        }
        return ans;

    }
}

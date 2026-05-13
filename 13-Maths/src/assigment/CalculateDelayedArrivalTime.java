package Assigment;

//https://leetcode.com/problems/calculate-delayed-arrival-time/
//2651. Calculate Delayed Arrival Time

public class CalculateDelayedArrivalTime {
    static void main(String[] args) {
        int arrivalTime = 15;
        int delayedTime = 5;
        System.out.println(findDelayedArrivalTime(arrivalTime,delayedTime));
    }
    static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime+delayedTime)%24;
    }
}


package Assigment;

//https://leetcode.com/contest/weekly-contest-510/problems/number-of-elapsed-seconds-between-two-times/description/
//Q1. Number of Elapsed Seconds Between Two Times

public class NumberOfElapsedSecondsBetweenTwoTimes {
    static void main(String[] args) {
        String startTime = "12:34:56", endTime = "13:00:00";
        System.out.println(secondsBetweenTimes(startTime,endTime));
    }
    static int secondsBetweenTimes(String startTime, String endTime) {
        int sh = Integer.parseInt(startTime.substring(0, 2));
        int sm = Integer.parseInt(startTime.substring(3, 5));
        int ss = Integer.parseInt(startTime.substring(6, 8));

        int eh = Integer.parseInt(endTime.substring(0, 2));
        int em = Integer.parseInt(endTime.substring(3, 5));
        int es = Integer.parseInt(endTime.substring(6, 8));

        int startSeconds = sh * 3600 + sm * 60 + ss;
        int endSeconds = eh * 3600 + em * 60 + es;

        return endSeconds - startSeconds;
    }
}

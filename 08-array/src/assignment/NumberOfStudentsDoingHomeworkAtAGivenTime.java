package assignment;

//https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/description/
//1450. Number of Students Doing Homework at a Given Time

public class NumberOfStudentsDoingHomeworkAtAGivenTime {
    static void main(String[] args) {
        int[]startTime={1,2,3};
        int[]endTime={3,2,7};
        int queryTime=4;
        System.out.println(busyStudent(startTime,endTime,queryTime));
    }
    static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0;
        for(int i=0;i<startTime.length;i++){
            if(startTime[i]<=queryTime && endTime[i]>=queryTime){
                    count++;
                }
            }
        return count;
    }
}

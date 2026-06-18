package Assigment;

//https://leetcode.com/problems/angle-between-hands-of-a-clock/
//1344. Angle Between Hands of a Clock

public class AngleBetweenHandsOfClock {
    static void main(String[] args) {
        int hour = 12, minutes = 30 ;
        System.out.println(angleClock(hour,minutes));
    }
    static double angleClock(int hour, int minutes) {
        double angle=Math.abs(30*hour - 5.5*minutes);
        if(angle>180){
            angle=360-angle;
        }
        return angle;
    }
}

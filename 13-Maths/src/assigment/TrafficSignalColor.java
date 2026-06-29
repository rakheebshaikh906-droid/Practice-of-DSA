package Assigment;

public class TrafficSignalColor {
    static void main(String[] args) {
        int timer=5;
        System.out.println(trafficSignal(timer));
    }
    static String trafficSignal(int timer){
        if(timer==0){
            return "Green";
        } else if (timer==30) {
            return "Orange";
        } else if (30 < timer  && timer <= 90) {
            return "Red";
        }
        return "Invalid";
    }
}

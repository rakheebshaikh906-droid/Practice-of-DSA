package Assigment;
//https://leetcode.com/problems/robot-return-to-origin/description/
//657. Robot Return to Origin
public class RobotReturn {
    static void main(String[] args) {
        String moves = "UD";
        System.out.println(judgeCircle(moves));
    }
    static boolean judgeCircle(String moves){
        int x=0,y=0; // (x, y) represents robot's current position
        // Loop through each move in the given string
        for(char ch:moves.toCharArray()){
            if(ch=='R'){
                x++; // Move right → increase x
            } else if (ch=='L') {
                x--;// Move left → decrease x
            } else if(ch=='U') {
                y++;// Move up → increase y
            }else{
                y--; // Move down → decrease y
            }
        }
        // If both x and y are zero → robot is back at the origin
        return x==0 && y==0;
    }
}

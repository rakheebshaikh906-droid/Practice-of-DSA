package Assigment;

//https://leetcode.com/problems/maximum-containers-on-a-ship/description/?envType=problem-list-v2&envId=math
//3492. Maximum Containers on a Ship

public class MaximumContainerOnShip {
    static void main(String[] args) {
        int n=2;
        int w=3;
        int maxWeight=15;
        System.out.println(maxContainer(n,w,maxWeight));
    }
    static int maxContainer(int n,int w,int maxWeight){
        return Math.min(n*n,maxWeight/w);
    }
}

package Assigment;

//https://leetcode.com/problems/find-closest-person/description/?envType=problem-list-v2&envId=math
//3516. Find Closest Person

public class FindCloset {
    static void main(String[] args) {
        int x=2;
        int y=7;
        int z=4;
        System.out.println(findClosest(x,y,z));
    }
    static int findClosest(int x, int y, int z) {
        int ans1=Math.abs(x-z);
        int ans2=Math.abs(y-z);

        if(ans1<ans2){
            return 1;
        } else if (ans1>ans2) {
            return 2;
        }
        return 0;
    }

}

package assignment;

//https://leetcode.com/problems/two-furthest-houses-with-different-colors/description/?envType=daily-question&envId=2026-04-20
//2078. Two Furthest Houses With Different Colors

public class TwoFurthestHousesWithDifferentColors {
    static void main(String[] args) {
        int[]colors={1,8,3,8,3};
        System.out.println(maxDistance(colors));
    }
    static int maxDistance(int[] colors) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<colors.length;i++){
            for(int j=i+1;j< colors.length;j++){
                if(colors[i]!=colors[j]){
                    max=Math.max(max,Math.abs(i-j));
                }
            }
        }
        return max;
    }
}

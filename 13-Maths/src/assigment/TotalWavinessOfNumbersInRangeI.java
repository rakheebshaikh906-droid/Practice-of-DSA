package Assigment;

//https://leetcode.com/problems/total-waviness-of-numbers-in-range-i/description/?envType=problem-list-v2&envId=math
//3751. Total Waviness of Numbers in Range I

public class TotalWavinessOfNumbersInRangeI {
    static void main(String[] args) {
        System.out.println(totalWaviness(120,130));
        System.out.println(totalWaviness2(4848,4848));
    }
    static int totalWaviness(int num1,int num2){
        int count=0;
        for(int i=num1;i<=num2;i++){
            int right = i % 10;
            int middle = (i / 10) % 10;
            int left = i / 100;

            if(middle>right && middle>left || middle<right && middle<left){
                count+=1;
            }
        }
        return count;
    }
    //write and according to LeetCode condition
    static int totalWaviness2(int num1, int num2) {
        int count = 0;

        for (int n = num1; n <= num2; n++) {

            if (n < 100) continue;

            int temp = n;

            int right = temp % 10;
            temp /= 10;
            int middle = temp % 10;
            temp /= 10;

            while (temp >= 1) {
                int left = temp % 10;

                if ((middle > left && middle > right) ||
                        (middle < left && middle < right)) {
                    count++;
                }

                right = middle;
                middle = left;
                temp /= 10;
            }
        }
        return count;
    }
}

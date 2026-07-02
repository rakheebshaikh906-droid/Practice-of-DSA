package Assigment;

public class ValidSubarraysWithMatchingSumDigits {
    static void main(String[] args) {
        int[]nums={1,100,1};
        int x=1;
        System.out.println(valid(nums,x));
    }
    static int valid(int[]nums,int x){
        int count=0;
        int n=nums.length;

        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = prefix[j + 1] - prefix[i];

                int last = sum % 10;
                int first = sum;
                while(first >= 10){
                    first /= 10;
                }
                if(first==x && last==x){
                    count++;
                }
            }
        }
        return count;
    }
}

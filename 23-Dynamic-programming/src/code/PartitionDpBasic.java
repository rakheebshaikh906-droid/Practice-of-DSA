package code;

//Q) find the minimum number of operations required to multiply both matrix
public class PartitionDpBasic {
    static void main(String[] args) {
        int[]nums={10,20,30,40,50};
        System.out.println(part(nums));
    }
    static int part(int[]nums){
        return f(1,nums.length-1,nums);

    }
    private static int f(int i,int j,int[]a){
        //base cases
        if(i==j) return 0;

        int min=Integer.MAX_VALUE;
//        for(int k=1;k<j;k++){
//            int steps=a[i-1]*a[k]*a[j]+f(i,k,a)+f(k+1,j,a);
//            min=Math.min(min,steps);
//        }
        for (int k = i; k < j; k++) {
            int steps = a[i - 1] * a[k] * a[j]
                    + f(i, k, a)
                    + f(k + 1, j, a);

            min = Math.min(min, steps);
        }
        return min;
    }
}

package assignment;

//https://leetcode.com/problems/construct-uniform-parity-array-ii/description/
//3876. Construct Uniform Parity Array II

public class ConstructUniformParityArray2 {
    static void main(String[] args) {
        int[]nums1={1,4,7};
        System.out.println(construct(nums1));
    }
    static boolean construct(int[]nums1){
//        int[]nums2=new int[nums1.length];
//        int parity = nums1[0]%2;
//        nums2[0]=nums1[0];
//        boolean ans=false;
//        for(int i=1;i<nums1.length;i++){
//            for(int j=0;j<nums1.length;j++){
//                if(nums1[i]%2==parity){
//                    nums2[i]=nums1[i];
//                    ans=true;
//                }else{
//                    nums2[i]=nums1[i]-nums1[j];
//                    if(nums2[i]%2==parity){
//                        ans=true;
//                    }
//                }
//            }
//        }
//        return ans;

        int min = Integer.MAX_VALUE;
        boolean hasOdd = false;

        for (int x : nums1) {
            min = Math.min(min, x);
            if (x % 2 != 0) hasOdd = true;
        }
        if (!hasOdd) return true;
        return min % 2 != 0;


    }
}

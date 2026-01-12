package assignment;

//https://leetcode.com/problems/restore-finishing-order/solutions/7488479/3668-restore-finishing-order-by-rakheebs-g6rg/
//3668. Restore Finishing Order
import java.util.Arrays;

public class RestoreFinishingOrder {
    static void main(String[] args) {
        int[]order={1,4,5,3,2};
        int[]friends={2,5};
        System.out.println(Arrays.toString(recoverOrder(order,friends)));
    }
    static int[] recoverOrder(int[] order, int[] friends) {
        int[]ans=new int[friends.length];
        int index=0;
        for(int i=0;i< order.length;i++){
            for(int j=0;j< friends.length;j++){
                if(order[i]==friends[j]){
                    ans[index]=order[i];
                    index++;
                }
            }
        }
        return ans;
    }
}

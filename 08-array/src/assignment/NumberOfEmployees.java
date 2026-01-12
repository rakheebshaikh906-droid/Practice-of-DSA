package assignment;

//https://leetcode.com/problems/number-of-employees-who-met-the-target/description/?envType=problem-list-v2&envId=array
//2798. Number of Employees Who Met the Target
public class NumberOfEmployees {
    static void main(String[] args) {
        int[]hours={0,1,2,3,4};
        int target=2;
        System.out.println(numberOfEmployeesWhoMetTarget(hours,target));
    }
    static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int i=0;i<hours.length;i++){
            if(hours[i]==target){
                count+=1;
            } else if (hours[i] > target) {
                count+=1;
            }
        }
        return count;
    }
}

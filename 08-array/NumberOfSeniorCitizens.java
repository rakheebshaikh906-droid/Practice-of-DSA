package assignment;

//https://leetcode.com/problems/number-of-senior-citizens/submissions/1899843300/?envType=problem-list-v2&envId=array
//2678. Number of Senior Citizens

public class NumberOfSeniorCitizens {
    static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(details));
    }
    static int countSeniors(String[] details) {
        int count = 0;

        for (String s : details) {
            int age = Integer.parseInt(s.substring(11, 13));
            if (age > 60) {
                count++;
            }
        }
        return count;
    }
}

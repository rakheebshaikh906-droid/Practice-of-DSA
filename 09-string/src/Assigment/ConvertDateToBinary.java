package Assigment;

//https://leetcode.com/problems/convert-date-to-binary/description/?envType=problem-list-v2&envId=math
//3280. Convert Date to Binary

public class ConvertDateToBinary {
    static void main(String[] args) {
        String date="2080-02-29";
        System.out.println(convertToBinary(date));
    }
    static String convertToBinary(String date){
        String[] parts = date.split("-");

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        String y = Integer.toBinaryString(year);
        String m = Integer.toBinaryString(month);
        String d = Integer.toBinaryString(day);

        return y + "-" + m + "-" + d;

    }
}

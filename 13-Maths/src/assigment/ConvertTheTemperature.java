package Assigment;

import java.util.ArrayList;

//https://leetcode.com/problems/convert-the-temperature/description/?envType=problem-list-v2&envId=math
//2469. Convert the Temperature
public class ConvertTheTemperature {
    static void main(String[] args) {
       double celsius=36.50;
        double[] result = convertTemperature(celsius);

        System.out.println("Kelvin: " + result[0]);
        System.out.println("Fahrenheit: " + result[1]);
    }
    static double[] convertTemperature(double celsius){
        double[]ans=new double[2];

        ans[0]= celsius + 273.15;
        ans[1]= celsius * 1.80 + 32.00;

        return ans;
    }
}

package com.rakheeb;

import java.util.Scanner;

public class Temperate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("please enter the temperate in C : ");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5)+32 ;
        System.out.println("the temp in fehranite is "+tempF);
    }
}


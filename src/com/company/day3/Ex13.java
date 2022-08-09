package com.company.day3;

import java.util.Scanner;

// 2016년
public class Ex13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] dates = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int countDates = 0;

        for (int i = 0; i < a-1; i++) {
            countDates += dates[i];
        }

        countDates += (b-1);

        String answer = days[countDates%7];
        System.out.println(answer);

    }

}

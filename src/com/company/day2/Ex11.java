package com.company.day2;

import java.util.Arrays;
import java.util.Scanner;

// x만큼 간격이 있는
public class Ex11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();

        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i+1);
        }

        System.out.println(Arrays.toString(answer));

    }
}

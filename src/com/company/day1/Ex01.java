package com.company.day1;

import java.util.Scanner;

public class Ex01 {
    
    // 1. 직사각형 별찍기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String star = "*";
        String row = star.repeat(a);

        for (int i = 0; i < b; i++) {
            System.out.println(row);
        }

    }

}

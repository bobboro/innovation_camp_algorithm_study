package com.company.day2;

import java.util.Scanner;

// 부족한 금액 계산하기
public class Ex12 {

    public static void main(String[] args) {
        long answer = 0;

        Scanner scan = new Scanner(System.in);

        int price = scan.nextInt();
        int count = scan.nextInt();
        int money = scan.nextInt();

        long total_price = 0;

        for (int i = 1; i <= count; i++) {
            total_price += (long) price*i;
        }

        if(total_price > money) {
            answer = total_price - money;
        }

        System.out.println(answer);
    }

}

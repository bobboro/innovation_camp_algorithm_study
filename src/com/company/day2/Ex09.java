package com.company.day2;

import java.util.Scanner;

// 핸드폰 번호 가리기
public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();

        String show = num.substring(num.length()-4, num.length());
        String before_hidden = num.substring(0, num.length()-4);

        String hidden = before_hidden.replaceAll(".", "*");
        String hidden2 = "*".repeat(before_hidden.length());

        System.out.println(hidden2+show);
    }
}

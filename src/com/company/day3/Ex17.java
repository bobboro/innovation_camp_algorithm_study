package com.company.day3;

import java.util.Scanner;

// 문자열 다루기 기본
public class Ex17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        boolean answer = true;

        if (s.length() != 4 && s.length() != 6) {
            answer = false;
        }

        for (int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))){
                answer = false;
            }
        }

        System.out.println(answer);
    }

}

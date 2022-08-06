package com.company.day1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 입력 테스트용
        Scanner scan = new Scanner(System.in);
        int num;
        num = scan.nextInt();
        if (num%2 == 0) {
            System.out.println(num + " is Even");
        }else {
            System.out.println(num + " is Odd");
        }

        class Solution {
            public String solution(int num) {
                String answer = "";
                if(num%2 == 0) {
                    answer = "Odd";
                }else {
                    answer = "Even";
                }
                return answer;
            }
        }

    }

}

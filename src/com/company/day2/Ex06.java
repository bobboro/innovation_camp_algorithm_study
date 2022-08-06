package com.company.day2;

// 없는 숫자 더하기
public class Ex06 {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,6,7,8,0};
        int answer = 0;
        int total = 45;

        for (int i = 0; i < numbers.length; i++) {
            answer = total -= numbers[i];
        }

        System.out.println(answer);

    }
}

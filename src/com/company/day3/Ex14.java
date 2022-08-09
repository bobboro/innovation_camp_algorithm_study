package com.company.day3;

import java.util.Arrays;

// 나누어 떨어지는 숫자 배열
public class Ex14 {

    public static void main(String[] args) {
        int count = 0;

        int[] arr = {3, 6, 16, 18};
        int divisor = 3;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                count++;
            }
        }

        int[] answer = new int[count];

        count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer[count]=arr[i];
                count++;
            }
        }

        Arrays.sort(answer);

        if(answer.length == 0) {
            answer = new int[1];
            answer[0] = -1;
        }

        System.out.println(Arrays.toString(answer));

    }

}

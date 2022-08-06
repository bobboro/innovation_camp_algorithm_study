package com.company.day2;

// 평균 구하기
public class Ex08 {
    public static void main(String[] args) {

        int[] arr = {1,3,5,6};
        double total = 0;
        double answer = 0;

        for (int i = 0; i <arr.length; i++) {
            total += arr[i];
        }
        answer = total/arr.length;
        System.out.println(answer);
    }
}

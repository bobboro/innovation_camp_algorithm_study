package com.company.day2;

// 음양 더하기
public class Ex07 {
    public static void main(String[] args) {

        int minus = 0;
        int plus = 0;
        int answer = 0;

        boolean[] signs = {true, false, false};
        int[] absolutes = {4,7,2};

        for (int i = 0; i < signs.length; i++) {
            if(!signs[i]){
                minus += (absolutes[i] * -1);
            }
        }

        for (int i = 0; i < signs.length; i++) {
            if(signs[i]) {
                plus += absolutes[i];
            }
        }

        answer = plus + minus;
        System.out.println(answer);
    }
}

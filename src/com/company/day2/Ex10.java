package com.company.day2;

import java.util.Arrays;
import java.util.Scanner;

// 행렬의 덧셈
public class Ex10 {
    public static void main(String[] args) {

        int[][] a = {{2}, {3}};
        int[][] b = {{4}, {6}};
        int[][] answer = new int[a.length][a[0].length]; // a.length = a의 세로값, a[0].length = a의 가로값

        for (int i = 0; i < a.length; i++) { // -> 세로값, 1번 반복
            for (int j = 0; j < a[0].length; j++) { // 가로값, 2번 반복
                answer[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println(Arrays.deepToString(answer));
    }
}

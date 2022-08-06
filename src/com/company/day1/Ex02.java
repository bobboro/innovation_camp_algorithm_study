package com.company.day1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

    // 가운데 글자 가져오기
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String[] word = input.split("");
        int count = input.length();

        if(count%2 == 1){
            System.out.println(word[count/2]);
        }else{
            System.out.println((word[count/2-1]) + word[count/2]);
        }

    }
}

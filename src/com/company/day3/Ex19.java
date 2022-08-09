package com.company.day3;

import java.util.Scanner;

// 수박수박수박수박수박수?
public class Ex19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String answer = "";
        String odd = "수";
        String even = "수박";

        if(n%2 == 1){
            answer = even.repeat(n/2) + odd;
        }else {
            answer = even.repeat(n/2);
        }

        System.out.println(answer);

    }

}

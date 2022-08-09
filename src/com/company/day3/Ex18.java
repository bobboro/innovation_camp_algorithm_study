package com.company.day3;

// 서울에서 김서방 찾기
public class Ex18 {

    public static void main(String[] args) {

        String answer = "";
        String[] seoul = {"Jane", "You", "Kim"};

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }

        System.out.println(answer);

    }

}

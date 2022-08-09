package com.company.day3;

// 문자열 내 p와 y의 개수
public class Ex16 {

    public static void main(String[] args) {

        boolean answer = true;

        // 특정 문자의 개수를 세기위해 선언
        int countp = 0;
        int county = 0;

        String s = "pPoooyY";

        // 입력받은 s를 소문자로 변경해주고
        String lower_s = s.toLowerCase();

        // 소문자로 변경된 s를 문자열 배열에 넣는다.
        String[] list = lower_s.split("");


        // 문자 배열에서 p나 y를 포함하는 count를 증가시키고
        for (int i = 0; i < list.length; i++) {
            if("p".equals(list[i])) {
                countp++;
            }
            if("y".equals(list[i])) {
                county++;
            }
        }

        // p와 y의 갯수가 다르다면 answer를 false로 변경
        if(countp != county) {
            answer = false;
        }


//        System.out.println(answer);

    }

}

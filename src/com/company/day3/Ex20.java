package com.company.day3;

import java.util.HashMap;

// 완주하지 못한 선수
public class Ex20 {

    public static void main(String[] args) {
        String answer = "";
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        HashMap<String, Integer> hm = new HashMap<>();

        for(String name : participant) {
            hm.put(name, hm.getOrDefault(name, 0) + 1);
        }
        for(String name : completion) {
            hm.put(name, hm.get(name)-1);
        }

        for(String key : hm.keySet()){
            if(hm.get(key) != 0) {
                answer = key;
                System.out.println(answer);
            }
        }





    }



}

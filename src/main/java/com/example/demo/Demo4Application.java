package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo4Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo4Application.class, args);
    }

    //    public static String getSingleString(String str) {
//        Set<Character> existChars = new HashSet<>();
//        String result = "";
//
//        while (!str.isEmpty()) {
//            System.out.println(str);
//            char c = str.charAt(0);
//            if (!existChars.contains(c)) {
//                result = result.concat(String.valueOf(c));
//                existChars.add(c);
//            }
//
//            str = str.substring(1);
//        }
//
//        return result;
//    }
}

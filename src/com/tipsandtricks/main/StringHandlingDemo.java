package com.tipsandtricks.main;

import java.util.Arrays;

public class StringHandlingDemo {
    public static void main(String[] args) {
        String str1 = "John is studying. ";
        String str2 = "In college.";
//
//        System.out.println(str1.length());
//
//        String result = str1.concat(str2);
//        System.out.println(result);
//
//        String r = String.format("The name of student is " + "%s, and the age is " + "%d.", "John", 21);
//        System.out.println(r);

//        System.out.println(str1.charAt(5));
//
//        if(str1.equals(str2)) {
//            System.out.println("Both strings are same.");
//        } else {
//            System.out.println("Both strings are different.");
//        }
//
//        System.out.println(str1.indexOf('i'));

//        System.out.println(str1.replace('s', 'r'));

//        String[] arr = str1.split(" ");
//        Arrays.asList(arr).forEach(s -> System.out.println(s));

        String newStr1 = str1.substring(0, 5);
        System.out.println(newStr1);
    }
}

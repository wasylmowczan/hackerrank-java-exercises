package com.hackerrank.java.Strings;

import java.util.Scanner;

public class _00_Introduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int lengthA = A.length();
        int lengthB = B.length();
        System.out.println(lengthA + lengthB);

        int result = A.compareTo(B);
        if (result > 0) {
            System.out.println("Yes");
        }
        if (result < 0) {
            System.out.println("No");
        }
        if (result == 0) {
            System.out.println("No");
        }
        String firstCapitalLetter = A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase();
        String secondCapitalLetter = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();
        System.out.println(firstCapitalLetter + " " + secondCapitalLetter);
    }
}

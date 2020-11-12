package com.hackerrank.java.introduction;

import java.util.Scanner;

public class _08_EndOfFile {

    /*
    Read some unknown n lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; sc.hasNext() == true; i++) {
            System.out.println(i + " " + sc.nextLine());
        }
        sc.close();
    }
}